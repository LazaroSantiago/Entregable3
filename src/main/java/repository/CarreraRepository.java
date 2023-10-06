package repository;

import DTO.CarreraDTO;
import entity.Carrera;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("CarreraRepository")
public interface CarreraRepository extends BaseRepository<Carrera, Long> {
    //todo: generar un reporte de las carreras, que para cada carrera incluya información de los
    //inscriptos y egresados por año. Se deben ordenar las carreras alfabéticamente, y
    //presentar los años de manera cronológica.
    //Estoy seguro de que habia una consulta igual en el entregable 2.


    //creo que esto no sirve para nada ;_;
    @Query(value =
            "SELECT nombre, count(legajo_estudiante) AS cantEstudiantes " +
            "FROM carrera e INNER JOIN inscripcion i ON i.id_carrera = e.id_carrera "+
            "GROUP BY e.nombre "+
            "HAVING count(i.legajo_estudiante) > 0 "+
            "ORDER BY count(i.legajo_estudiante) DESC ",
            nativeQuery = true)
    List<CarreraDTO> getCarrerasPorCantidadEstudiantes();

}
