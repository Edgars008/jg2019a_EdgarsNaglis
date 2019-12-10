package FinalWork.service;

import FinalWork.model.Product;

import java.util.*;

class ProductServiceImpl implements ProductService {


    private Map<Long, Product> repository = new HashMap<>();

    @Override
    public Long add(Product product) {
        repository.put(product.getId(), product);
        return product.getId();
    }

    @Override
    public Optional<Product> findBy(Long id) {
        return Optional.ofNullable(repository.get(id));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(repository.values());
    }

    @Override
    public void deleteBy(Long id) {
        repository.remove(id);
    }
}
