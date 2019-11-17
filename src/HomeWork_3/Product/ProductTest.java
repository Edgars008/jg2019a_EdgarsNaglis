package HomeWork_3.Product;//trūkst package
//pienāc lūdzu pirms nodarbīas paskaidrošu
//nekompilējās

import HomeWork_3.Product.Product;

public class ProductTest {
    public static void main(String[] args) {
Product milk = new Product();
milk.setName("Piens");
milk.setRegularPrice(0.80);
milk.setDiscount(20);
milk.printInformation();
    }
}
