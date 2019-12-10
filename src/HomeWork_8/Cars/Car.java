package HomeWork_8.Cars;

import java.util.Objects;

public class Car {

    protected int doors;
    protected String name;
    protected String color;
    protected int maxSpeed;

    public Car(int doors, String name, String color, int maxSpeed) {
        this.doors = doors;
        this.name = name;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "doors=" + doors +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return doors == car.doors &&
                maxSpeed == car.maxSpeed &&
                Objects.equals(name, car.name) &&
                Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(doors, name, color, maxSpeed);
    }
}
