package repository;

import DTO.EstudianteDTO;
import entity.Estudiante;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("EstudianteRepository")
public interface EstudianteRepository extends BaseRepository<Estudiante, Long> {

    // C recuperar todos los estudiantes, y especificar algún criterio de ordenamiento simple.
    @Query("SELECT e FROM Estudiante e " +
            "ORDER BY e.numeroLegajo ")
    List<Estudiante> getEstudiantes();

    // D recuperar un estudiante, en base a su número de libreta universitaria.
    @Query(
            "select e from Estudiante e " +
                    "where e.numeroLegajo = :numeroLegajo"
    )
    Estudiante getEstudianteByNumeroLegajo(@Param("numeroLegajo")int numeroLegajo);

    // E recuperar todos los estudiantes, en base a su género.
    @Query("SELECT new DTO.EstudianteDTO(e.nombre, e.apellido, e.ciudad, e.genero, e.numeroLegajo) " +
           "FROM Estudiante e " +
           "WHERE e.genero LIKE :genero")
    List<EstudianteDTO> getEstudiantesByGenero(@Param("genero")char genero);

    // G recuperar los estudiantes de una determinada carrera, filtrado por ciudad de residencia.
    @Query(
            "select e " +
                    "from Estudiante e inner join Inscripcion i on e.numeroLegajo = i.estudiante.numeroLegajo inner  join " +
                    "Carrera c on i.carrera.id_carrera = c.id_carrera " +
                    "where c.nombre like :carrera and e.ciudad like :ciudad"
    )
    List<Estudiante> getEstudiantesByCarreraAndApellido(@Param("carrera")String carrera, @Param("ciudad")String ciudad);
}
