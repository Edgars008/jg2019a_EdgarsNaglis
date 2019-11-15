package HomeWork_3_Objekti_Circle;//trūkst package
//pienāc lūdzu pirms nodarbīas paskaidrošu
//nekompilējās

import HomeWork_3_Objekti_Circle.Circle;

public class CircleMain {
    public static void main(String[] args) {

        Circle aplis = new Circle();
        aplis.setRadius(300);
        System.out.println("Apļa radius: " + aplis.getRadius());
        System.out.println("Apļa laukums: " + aplis.calculateArea());

    }
}
