package HomeWork_11.Shopping_list;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Product {
    private String name;
    private double price;
    private Category category;

    List<String> productList = new ArrayList<>();

    public Product() {

    }

    public Product(String name, double price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void addProduct(String name, double price, Category category){
        Product product = new Product(name,price,category);
        productList.add(product.toString());
    }

    public void deleteProduct(String name){
        productList.remove(name);
    }

    public void printProducts(){
        System.out.println("Product list: " + productList);
    }

//    public List<Product> priceRange(double min, double max){
//
////        for (test : productList){
////
////        }
////      return null;
//    }

    public void givenCategory(Category category){
            productList.contains(category.toString());

    }

    @Override
    public String toString() {
        return "Name: " + name +
                ", price: " + price +
                ", category: " + category;
    }
}
