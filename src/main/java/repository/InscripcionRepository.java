package repository;

import entity.Inscripcion;
import org.springframework.stereotype.Repository;

@Repository("InscripcionRepository")
public interface InscripcionRepository extends BaseRepository<Inscripcion, Long> {
    //esto puede quedar vacio.
}
