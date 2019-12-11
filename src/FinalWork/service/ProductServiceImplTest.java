package FinalWork.service;

import FinalWork.model.Product;
import FinalWork.model.ProductCategory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static FinalWork.model.ProductCategory.CANDY;
import static FinalWork.model.ProductCategory.FRUIT;
import static java.math.BigDecimal.*;
import static org.junit.jupiter.api.Assertions.*;

class ProductServiceImplTest {

    private ProductService service;

    @BeforeEach
    void setUp(){
        service = new ProductServiceImpl();
    }

    @Test
    void shouldSaveAndFindProductById(){
        Product orange = createProduct("orange");

        Long orangeId = service.add(orange);
        assertNotNull(orangeId);
        Optional<Product> savedOrange = service.findBy(orangeId);
        assertTrue(savedOrange.isPresent());
        assertEquals(orange, savedOrange.get());
    }

    @Test
    void shouldFindAllProducts() {
        Product orange = createProduct("orange");
        Product banana = createProduct("banana");
        service.add(orange);
        service.add(banana);

        List<Product> allProducts = service.findAll();
        assertEquals(2,allProducts);
        assertEquals(Arrays.asList(orange,banana),allProducts);

    }

    @Test
    void shouldDeleteById() {
        Product orange = createProduct("orange");
        Long orangeId = service.add(orange);

        service.deleteBy(orangeId);
        assertTrue(service.findAll().isEmpty());
    }

    @Test
    void shouldFindProductByCategory(){
        Product p1 = new Product("t1", CANDY, TEN);
        Product p2 = new Product("t2", FRUIT, TEN);
        Product p3 = new Product("t3", CANDY, TEN);

        service.add(p1);
        service.add(p2);
        service.add(p3);

        List<Product> candies = service.findBy(CANDY);
        assertEquals(2, candies.size());
        assertEquals(candies, Arrays.asList(p1,p3));
    }

    private Product createProduct(String name) {
        Product orange = new Product(name,ProductCategory.FRUIT, TEN);
        return orange;
    }
}