package HomeWork_3.Circle;//trūkst package
//pienāc lūdzu pirms nodarbīas paskaidrošu
//nekompilējās

import HomeWork_3.Circle.Circle;

public class CircleMain {
    public static void main(String[] args) {

        Circle aplis = new Circle();
        aplis.setRadius(300);
        System.out.printf("Apļa radius: %.2f%n", aplis.getRadius());
        System.out.printf("Apļa laukums: %.2f%n", aplis.calculateArea());

    }
}
