package HomeWork_10.Simple_Database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookRepository implements Repository<Book> {

    Map<String, Book> books = new HashMap <>();



    @Override
    public List<Book> findAll() {
        List<Book> booksList = new ArrayList<>(books.values());
        return booksList;
    }

    @Override
    public Book findById(String id) {
        books.containsKey(id);
        return null;
    }

    @Override
    public void save(Book item) {
        books.put("Grāmata: ", item);
    }

    @Override
    public void delete(String id) {
            books.remove(id);
    }
}
