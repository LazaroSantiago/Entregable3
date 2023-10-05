package Service;

import Repository.CarreraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("CarreraService")
public class CarreraService implements BaseService{
    /*todo();*/

    @Autowired
    private CarreraRepository CarreraRepository;

    @Override
    public List findAll() throws Exception {
        return null;
    }

    @Override
    public Object findByID(Long id) throws Exception {
        return null;
    }

    @Override
    public boolean delete(Long id) throws Exception {
        return false;
    }

    @Override
    public Object save(Object entity) throws Exception {
        return null;
    }

    @Override
    public Object update(Long id, Object entity) throws Exception {
        return null;
    }
}
