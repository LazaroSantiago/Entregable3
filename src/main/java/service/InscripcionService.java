package service;

import entity.Inscripcion;
import repository.InscripcionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("InscripcionService")
public class InscripcionService implements BaseService<Inscripcion> {
    /*todo();*/

    @Autowired
    private InscripcionRepository InscripcionRepository;


    @Override
    public List<Inscripcion> findAll() throws Exception {
        return null;
    }

    @Override
    public boolean delete(Long id) throws Exception {
        return false;
    }

    @Override
    public Inscripcion save(Inscripcion entity) throws Exception {
        return null;
    }

    @Override
    public Inscripcion update(Long id, Inscripcion entity) throws Exception {
        return null;
    }
}
