package Service;

import DTO.EstudianteDTO;
import Entity.Estudiante;
import Repository.EstudianteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service("EstudianteServicio")
public class EstudianteService implements BaseService<Estudiante> {
    @Autowired
    private EstudianteRepository estudianteRepository;

    @Override
    @Transactional
    public List<Estudiante> findAll() throws Exception {
        return estudianteRepository.findAll();
    }

    @Override
    @Transactional
    public Estudiante findByID(Long id) throws Exception {
        try {
            Optional<Estudiante> result = estudianteRepository.findByID(id);
            return result.get();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(Long id) throws Exception {
        try {
            if (estudianteRepository.existsById(id)) {
                estudianteRepository.deleteById(id);
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
    public Estudiante save(Estudiante entity) throws Exception {
        try {
            return estudianteRepository.save(entity);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Estudiante update(Long id, Estudiante entity) throws Exception {
        try{
            Optional<Estudiante> result = estudianteRepository.findByID(id);
            return result.get();
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<EstudianteDTO> getEstudiantesPorGenero(char genero) throws Exception {
        var result = estudianteRepository.findAllByGenero(genero);
        try {
            return result.stream().map(estudiante -> new EstudianteDTO(estudiante.getNumeroLegajo(), estudiante.getNombre(), estudiante.getApellido())).collect(Collectors.toList());
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

}
