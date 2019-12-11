package FinalWork.model;

import FinalWork.error.MissingMandatoryField;

import java.math.BigDecimal;
import java.util.Objects;

public class Product {

    private  static long idCounter = 0;

    private Long id;
    private String name;
    private BigDecimal price;
    private ProductCategory category;
    private BigDecimal discount;
    private String description;

    public Product(String name,
                   BigDecimal price,
                   ProductCategory productCategory,
                   BigDecimal discount,
                   String description) {
        this(name,productCategory,price);
        this.discount = discount;
        this.description=description;
        this.id = idCounter++;

    }

    public Product(String name,
                   ProductCategory productCategory,
                   BigDecimal price) {
        validate(name, productCategory, price);

        this.id = idCounter++;
        this.name = name;
        this.category=productCategory;
        this.price = price;
    }

    private void validate(String name, ProductCategory category, BigDecimal price) {

        String fieldName = null;

        if (name == null || name.equalsIgnoreCase("")){
            fieldName = "name";
        }else if (category == null){
            fieldName = "category";
        }else if (price == null){
            fieldName = "price";
        }

        if (fieldName !=null){
            throw new MissingMandatoryField(this.getClass(),fieldName);
        }
    }


    public static long getIdCounter() {
        return idCounter;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                ", discount=" + discount +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id) &&
                Objects.equals(name, product.name) &&
                Objects.equals(price, product.price) &&
                category == product.category &&
                Objects.equals(discount, product.discount) &&
                Objects.equals(description, product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, category, discount, description);
    }
}
