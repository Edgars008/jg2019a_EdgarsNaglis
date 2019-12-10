package FinalWork.service;

import FinalWork.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

  Long add(Product product);

  Optional<Product> findBy(Long id);

  List<Product> findAll();

  void deleteBy(Long id);

}
