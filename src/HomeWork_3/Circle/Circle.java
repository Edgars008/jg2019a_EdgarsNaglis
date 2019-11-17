package HomeWork_3.Circle;//trūkst package
//pienāc lūdzu pirms nodarbīas paskaidrošu
//nekompilējās

public class Circle {
   private double radius;


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea(){
       return Math.PI * radius * radius;
   }



}
