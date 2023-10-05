package Repository;

import Entity.Estudiante;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("EstudianteRepository")
public interface EstudianteRepository extends BaseRepository<Estudiante, Integer> {
    //todo: queries
    /* Las cosas que requieran SQL o no esten en el repo base van aca. */
    //ejemplo:

    @Query("SELECT e FROM Estudiante e WHERE e.genero = :genero")
    List<Estudiante> findAllByGenero(char genero);
}
