package HomeWork_3.Circle;

//lietojam "ctrl + alt + l"
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
