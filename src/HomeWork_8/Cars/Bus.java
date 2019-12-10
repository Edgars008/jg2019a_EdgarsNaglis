package HomeWork_8.Cars;

import java.util.Objects;

public class Bus extends Car {

    protected int passengers;

    public Bus(int doors, String name, String color, int maxSpeed) {
        super(doors, name, color, maxSpeed);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "passengers=" + passengers +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return passengers == bus.passengers;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengers);
    }
}
