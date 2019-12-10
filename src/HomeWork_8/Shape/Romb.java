package HomeWork_8.Shape;

public class Romb extends AbstractShape {

    private int edge;
    private int height;

    public Romb(int color, int edge, int height) {
        super(color);
        this.edge = edge;
        this.height = height;
    }

    @Override
    double area() {
        return this.edge * this.height;
    }

    @Override
    public void getName() {
        System.out.println("Rombs");
    }

    @Override
    public void getArea() {
        System.out.println("Rombs laukums: " + area());
    }
}
