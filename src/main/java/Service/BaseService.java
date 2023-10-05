package Service;

import java.util.List;

public interface BaseService<E> {
    List<E> findAll() throws Exception;

    E findByID(Long id) throws Exception;

    boolean delete(Long id) throws Exception;

    public E save(E entity) throws Exception;

    public E update(Long id, E entity) throws Exception;
}
