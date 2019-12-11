package FinalWork.model;

import FinalWork.error.MissingMandatoryField;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void shouldHaveMandatoryFieldId(){
        Product product = new Product("Produkts",ProductCategory.CANDY, BigDecimal.TEN);
        assertNotNull(product.getId());

    }

    @Test
    void shouldGHaveMandatoryFieldNameNotFound(){
        Assertions.assertThrows(MissingMandatoryField.class,() ->
                new Product(null,ProductCategory.CANDY, BigDecimal.TEN),
                "Product attribute 'name' is a mandatory field");
    }

    @Test
    void shouldGHaveMandatoryFieldNameIsEmtpy(){
        Assertions.assertThrows(MissingMandatoryField.class,() ->
                        new Product("",ProductCategory.CANDY, BigDecimal.TEN),
                "Product attribute 'name' is a mandatory field");
    }

    @Test
    void shouldGHaveMandatoryFieldProductCategoryNotFound(){
        Assertions.assertThrows(MissingMandatoryField.class,() ->
                        new Product("test",null, BigDecimal.TEN),
                "Product attribute 'name' is a mandatory field");
    }

    @Test
    void shouldGHaveMandatoryFieldProductPriceNotFound(){
        Assertions.assertThrows(MissingMandatoryField.class,() ->
                        new Product("test",ProductCategory.CANDY,null),
                "Product attribute 'name' is a mandatory field");
    }

}