package repository;

import DTO.CarreraDTO;
import entity.Carrera;
import entity.Estudiante;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("CarreraRepository")
public interface CarreraRepository extends BaseRepository<Carrera, Long> {
    //todo: generar un reporte de las carreras, que para cada carrera incluya información de los
    //inscriptos y egresados por año. Se deben ordenar las carreras alfabéticamente, y
    //presentar los años de manera cronológica.
    //Estoy seguro de que habia una consulta igual en el entregable 2.

    
    // F recuperar las carreras con estudiantes inscriptos, y ordenar por cantidad de inscriptos.
    @Query(
            "SELECT new DTO.CarreraDTO(c.nombre, count(i.estudiante.numeroLegajo))  " +
            "FROM Carrera c INNER JOIN Inscripcion i ON i.carrera.id_carrera = c.id_carrera "+
            "GROUP BY c.nombre "+
            "HAVING count(i.estudiante.numeroLegajo) > 0 "+
            "ORDER BY count(i.estudiante.numeroLegajo) DESC ")
    List<CarreraDTO> getCarrerasPorCantidadEstudiantes();


}
