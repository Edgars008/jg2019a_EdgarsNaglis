package HomeWork_8.Cars;

import java.util.Objects;

public class PassengersCar extends Car {

    protected int wheels;

    public PassengersCar(int doors, String name, String color, int maxSpeed, int wheels) {
        super(doors, name, color, maxSpeed);
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "PassengersCar{" +
                "wheels=" + wheels +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PassengersCar that = (PassengersCar) o;
        return wheels == that.wheels;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), wheels);
    }
}
