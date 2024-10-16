package workforcemanger.workforce.service.GenericService;

import java.util.List;

public interface GenericService {
    abstract <T> T create(T t);
    abstract <T> T update(T t);
    abstract <T> T delete(T t);
    abstract <T> List<T> findAll(Class<T> clazz);
}
