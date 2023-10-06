package service;

import entity.Carrera;
import repository.CarreraRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("CarreraService")
public class CarreraService implements BaseService<Carrera> {
    /*todo();*/

    @Autowired
    private CarreraRepository carreraRepository;

    @Override
    public List<Carrera> findAll() throws Exception {
        return null;
    }

    @Override
    public boolean delete(Long id) throws Exception {
        return false;
    }

    @Override
    public Carrera save(Carrera entity) throws Exception {
        return null;
    }

    @Override
    public Carrera update(Long id, Carrera entity) throws Exception {
        return null;
    }
//
//    @Override
//    public List<Carrera> findAll() throws Exception {
//        return null;
//    }
//
//    @Override
//    public Carrera findById(Long id) throws Exception {
//        return null;
//    }
//
//    @Override
//    @Transactional
//    public boolean delete(Long id) throws Exception {
//        try {
//            if (carreraRepository.existsById(id)) {
//                carreraRepository.deleteById(id);
//                return true;
//            } else {
//                throw new Exception();
//            }
//        } catch (Exception e) {
//            throw new Exception(e.getMessage());
//        }
//    }
//
//    @Override
//    @Transactional
//    public Carrera save(Carrera entity) throws Exception {
//        try {
//            return this.carreraRepository.save(entity);
//        } catch (Exception e) {
//            throw new Exception(e.getMessage());
//        }
//    }
//
//    @Override
//    public Carrera update(Long id, Carrera entity) throws Exception {
//        return null;
//    }
}
