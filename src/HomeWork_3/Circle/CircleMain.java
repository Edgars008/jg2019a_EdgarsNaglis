package HomeWork_3.Circle;

import HomeWork_3.Circle.Circle; //nav nepieciešams šis imports

public class CircleMain {
    public static void main(String[] args) {

        Circle aplis = new Circle();  //mainīgā nosaukumam ir jābūt angliski
        aplis.setRadius(300);
        System.out.printf("Apļa radius: %.2f%n", aplis.getRadius());
        System.out.printf("Apļa laukums: %.2f%n", aplis.calculateArea());

    }
}
