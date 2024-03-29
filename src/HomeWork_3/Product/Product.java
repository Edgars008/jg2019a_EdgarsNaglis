package HomeWork_3.Product;//trūkst package
//pienāc lūdzu pirms nodarbīas paskaidrošu
//nekompilējās

//Ok
public class Product {
    private String name;
    private double regularPrice;
    private double discount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double calculateActualPrice(){
        return regularPrice -(regularPrice * (discount/100));

    }

    public void printInformation(){
        System.out.println("Produkts: " + name);
        System.out.println("Produkta parasta cena: " + regularPrice);
        System.out.println("Produkta atlaide: " + discount+"%");  //atlaidei ir jābut veselam skaitlim
        System.out.println("Produkta cena ar atlaidi: " + calculateActualPrice());

    }
}
