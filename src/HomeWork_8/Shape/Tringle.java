package HomeWork_8.Shape;

public class Tringle extends AbstractShape {

    private int edge;

    public Tringle(int color, int edge) {
        super(color);
        this.edge = edge;
    }

    @Override
    public void getName() {
        System.out.println("Trijsturis");
    }

    @Override
    public void getArea() {
        System.out.println("Trijsturis laukums: " + area());
    }

    @Override
    double area() {
        return this.edge * this.edge;
    }
}
