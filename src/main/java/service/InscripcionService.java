package service;

import DTO.InscripcionDTO;
import entity.Carrera;
import entity.Estudiante;
import entity.Inscripcion;
import repository.InscripcionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("InscripcionService")
public class InscripcionService implements BaseService<Inscripcion> {
    /*todo: CRUD inscripciones*/

    @Autowired
    private InscripcionRepository InscripcionRepository;


    @Override
    public List<Inscripcion> findAll() throws Exception {
        return null;
    }

    @Override
    public Inscripcion findById(Long id) throws Exception {
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

    public List<InscripcionDTO> getReporte() {
        return InscripcionRepository.reporteCarreras();
    }

}
