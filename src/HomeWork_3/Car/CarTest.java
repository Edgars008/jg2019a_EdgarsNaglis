package HomeWork_3.Car;

import HomeWork_3.Car.Car; //nav nepieciešams šis imports

public class CarTest  {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("Melna");
        car.setManufacturer("Volvo");
        car.setYear(2019);
        car.printcar();

    }
}
