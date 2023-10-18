package service;

import DTO.CarreraDTO;
import entity.Carrera;
import repository.CarreraRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service("CarreraService")
public class CarreraService implements BaseService<Carrera> {

    @Autowired
    private CarreraRepository carreraRepository;

    @Override
    @Transactional
    public List<Carrera> findAll() throws Exception {
        return carreraRepository.findAll();
    }

    @Override
    @Transactional
    public Carrera findById(Long id) throws Exception {
        try{
            Optional<Carrera> result = carreraRepository.findById(id);
            return result.get();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
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
            return result.stream().map(carreraDTO ->new CarreraDTO(carreraDTO.getNombre(), carreraDTO.getCantEstudiantes())).collect(Collectors.toList());
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
