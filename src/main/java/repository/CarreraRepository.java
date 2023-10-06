package repository;

import DTO.CarreraDTO;
import entity.Carrera;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("CarreraRepository")
public interface CarreraRepository extends BaseRepository<Carrera, Long> {

    @Query(value =
            "SELECT nombre, count(legajo_estudiante) AS cantEstudiantes " +
            "FROM carrera e INNER JOIN inscripcion i ON i.id_carrera = e.id_carrera "+
            "GROUP BY e.nombre "+
            "HAVING count(i.legajo_estudiante) > 0 "+
            "ORDER BY count(i.legajo_estudiante) DESC ",
            nativeQuery = true)
    List<CarreraDTO> getCarrerasPorCantidadEstudiantes();

}
