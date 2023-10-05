package Repository;

import Entity.Estudiante;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("EstudianteRepository")
public interface EstudianteRepository extends BaseRepository<Estudiante, Integer> {
    //todo: queries
    /* La  unica faltante es la de aca abajo deberia se un insert de estudiante */

    /*@Query(
            "insert into "
    )
    void agregarEstudiante(Estudiante estudiante);*/

    List<Estudiante> getEstudianteByNumeroLegajo(int nuemeroLegajo);

    @Query(
            " SELECT e FROM Estudiante e " +
                    "ORDER BY e.numeroLegajo DESC "
    )
    List<Estudiante> getEstudiantes();

    @Query(
            " SELECT e FROM Estudiante e " +
                    "ORDER BY e.numeroLegajo ASC "
    )
    List<Estudiante> getEstudiantesAscendente();

    List<Estudiante> getEstudiantesByGenero(char genero);

    List<Estudiante> deleteEstudianteByNumeroLegajo(int numeroLegajo );
}
