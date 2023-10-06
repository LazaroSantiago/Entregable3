package repository;

import entity.Carrera;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("CarreraRepository")
public interface CarreraRepository extends BaseRepository<Carrera, Long> {

//    @Query("SELECT e.nombre, count(i.estudiante.numeroLegajo) AS cantEstudiantes " +
//            "FROM Carrera e INNER JOIN Inscripcion i ON i.carrera.id_carrera = e.id_carrera " +
//            "GROUP BY e.nombre " +
//            "HAVING cantEstudiantes > 0 " +
//            "ORDER BY cantEstudiantes DESC ")
//    List<Carrera> getCarrerasPorCantidadEstudiantes();

}
