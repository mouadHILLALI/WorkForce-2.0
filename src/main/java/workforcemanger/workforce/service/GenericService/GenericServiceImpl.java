package workforcemanger.workforce.service.GenericService;

import workforcemanger.workforce.configuration.JpaEntityManagerFactory;
import workforcemanger.workforce.repository.GenericRepository.GenericRepositoryImpl;

import javax.persistence.EntityManager;
import java.util.Collections;
import java.util.List;

public class GenericServiceImpl implements GenericService {
    JpaEntityManagerFactory emf = new JpaEntityManagerFactory();
    GenericRepositoryImpl repository = new GenericRepositoryImpl(emf);
    @Override
    public <T> T create(T t) {
        try {
            return repository.create(t);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }

    @Override
    public <T> T update(T t) {
        try {
            return repository.update(t);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }

    @Override
    public <T> T delete(T t) {
        return null;
    }

    @Override
    public <T> List<T> findAll(Class<T> clazz) {
        return Collections.emptyList();
    }
}
