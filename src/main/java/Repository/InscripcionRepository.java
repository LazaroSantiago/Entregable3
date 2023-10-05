package Repository;

import Entity.Inscripcion;
import org.springframework.stereotype.Repository;

@Repository("InscripcionRepository")
public interface InscripcionRepository extends BaseRepository<Inscripcion, Integer>{

    //todo: queries
    /* La  unica faltante es la de aca abajo deberia se un insert de estudiante */

    void saveInscripcion();
}
