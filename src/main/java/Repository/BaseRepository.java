package Repository;

import org.springframework.data.repository.NoRepositoryBean;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public interface BaseRepository<T, ID extends Serializable> extends org.springframework.data.repository.Repository<T,ID> {
    void delete(T deleted);

    void deleteById(Long id);

    boolean existsById(Long id);

    List<T> findAll();

    Optional<T> findByID(Long id);

    T save(T persisted);
}
