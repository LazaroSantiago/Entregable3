package service;

import DTO.CarreraDTO;
import entity.Carrera;
import repository.CarreraRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service("CarreraService")
public class CarreraService implements BaseService<Carrera> {
    /*todo();*/

    @Autowired
    private CarreraRepository carreraRepository;

    @Override
    @Transactional
    public List<Carrera> findAll() throws Exception {
        //todo: findAll
        return null;
    }

    @Override
    @Transactional
    public Carrera findById(Long id) throws Exception {
        //todo: findByID
        return null;
    }

    @Override
    @Transactional
    public boolean delete(Long id) throws Exception {
        try {
            if (carreraRepository.existsById(id)) {
                carreraRepository.deleteById(id);
                return true;
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }


    @Override
    @Transactional
    public Carrera save(Carrera entity) throws Exception {
        try {
            return this.carreraRepository.save(entity);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public List<CarreraDTO> getCarrerasPorCantidadEstudiantes() throws Exception {
        var result = carreraRepository.getCarrerasPorCantidadEstudiantes();
        try{
            return result.stream().map(carrera ->new CarreraDTO(carrera.getNombre(), carrera.getCantEstudiantes())).collect(Collectors.toList());
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }



}
