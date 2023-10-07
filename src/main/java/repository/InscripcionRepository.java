package repository;

import entity.Carrera;
import entity.Estudiante;
import entity.Inscripcion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("InscripcionRepository")
public interface InscripcionRepository extends BaseRepository<Inscripcion, Long> {

    // parte de la h parte 1
    @Query("select e " +
            "from Estudiante e inner join Inscripcion i on e.numeroLegajo = i.estudiante.numeroLegajo " +
            "where i.carrera.id_carrera = :id_carrera " +
            "order by i.fechaInicio desc ")
    List<Estudiante> getEstudiantesByCarrera(@Param("id_carrera") long id_carrera);

    @Query("select i from Inscripcion i " +
            "where i.estudiante.numeroLegajo = :id_estudiante and i.carrera.id_carrera = :id_carrera ")
    Inscripcion getInscripcionByCarreraAndAndEstudiante(@Param("id_estudiante") int id_estudiante, @Param("id_carrera") long id_carrera);

    @Query("select c from Carrera c " +
            "order by c.nombre")
    List<Carrera> getCarreras();
}
