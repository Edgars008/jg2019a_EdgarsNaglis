package HomeWork_10.Simple_Database;

import java.util.List;

public interface Repository<T> {

    List<T> findAll();
    T findById (String id);
    void save(T item);
    void delete (String id);
}
