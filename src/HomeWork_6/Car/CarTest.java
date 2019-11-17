package HomeWork_6.Car;

public class CarTest {
    public static void main(String[] args) {
        Car bmw = new Car("530", "black", 260);
        System.out.println(bmw.accelerate());
        System.out.println(bmw.slowDown());
        System.out.println(bmw.slowDown());
        bmw.speedUp();

    }
}
