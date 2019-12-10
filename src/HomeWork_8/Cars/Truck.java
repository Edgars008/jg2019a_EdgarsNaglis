package HomeWork_8.Cars;

import java.util.Objects;

public class Truck extends Car {
    protected int weight;

    public Truck(int doors, String name, String color, int maxSpeed, int weight) {
        super(doors, name, color, maxSpeed);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return weight == truck.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weight);
    }
}
