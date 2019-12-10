package FinalWork.service;

import FinalWork.model.Product;
import FinalWork.model.ProductCategory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

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

    private Product createProduct(String name) {
        Product orange = new Product();
        orange.setName(name);
        orange.setCategory(ProductCategory.FRUIT);
        orange.setPrice(BigDecimal.TEN);
        return orange;
    }
}