package repository;

import DTO.InscripcionDTO;
import entity.Inscripcion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("InscripcionRepository")
public interface InscripcionRepository extends BaseRepository<Inscripcion, Long> {

    @Query("SELECT new DTO.InscripcionDTO(c.nombre, i.fechaInicio, i.esGraduado, e.numeroLegajo, e.nombre, e.genero) " +
            "FROM Inscripcion i " +
            "JOIN Carrera c ON i.carrera.id_carrera = c.id_carrera " +
            "JOIN Estudiante e ON i.estudiante.numeroLegajo = e.numeroLegajo " +
            "ORDER BY c.nombre ASC, YEAR(i.fechaInicio) ASC")
    List<InscripcionDTO> reporteCarreras();
}
