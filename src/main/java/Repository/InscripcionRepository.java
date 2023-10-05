package Repository;

import Entity.Inscripcion;
import org.springframework.stereotype.Repository;

@Repository("InscripcionRepository")
public interface InscripcionRepository extends BaseRepository<Inscripcion, Integer> {
    //todo inscripcion repo
}
