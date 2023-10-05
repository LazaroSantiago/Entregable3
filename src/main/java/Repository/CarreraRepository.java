package Repository;

import DTO.CarreraDTO;
import Entity.Carrera;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("CarreraRepository")
public interface CarreraRepository extends BaseRepository<Carrera, Integer>{

    @Query(
            "SELECT e.nombre, sum(i.id_estudiante) AS cantEstudiantes " +
                    "FROM Carrera e inner join Inscripcion i ON i.id_carrera = e.id_carrera " +
                    "GROUP BY e.nombre " +
                    "HAVING cantEstudiantes > 0 " +
                    "ORDER BY cantEstudiantes DESC "
    )
    List<Carrera> getCarrerasPorCantidadEstudiantes();
    
}
