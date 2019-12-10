package HomeWork_11.Shopping_list;

import HomeWork_11.UserRepositoryMock;
import HomeWork_11.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProductTest {
    private Product product;
    private Category category;

        @BeforeEach
        void setUp(){
            product = new Product();
        }

        @Test
        void shouldAddProduct(){
            product.addProduct("Tomats",3.0,Category.FRUIT);
            assertEquals("Tomats",product.getName());
        }

        @Test
        void shouldPrintAllProduct(){
            product.printProducts();
            assertEquals("Tomats",product.getName());
        }


}
