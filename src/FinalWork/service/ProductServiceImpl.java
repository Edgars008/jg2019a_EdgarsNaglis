package FinalWork.service;

import FinalWork.model.Product;
import FinalWork.model.ProductCategory;

import java.util.*;
import java.util.stream.Collectors;

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

    @Override
    public List<Product> findBy(ProductCategory category) {


//        List<Product> result = new ArrayList<>();
//        for (Product product : repository.values()){
//            if (product.getCategory() == category){
//                result.add(product);
//            }
//        }
//        return result;
      return   repository.values().parallelStream()
                .filter(product -> product.getCategory() == category)
                .collect(Collectors.toList());
    }
}
