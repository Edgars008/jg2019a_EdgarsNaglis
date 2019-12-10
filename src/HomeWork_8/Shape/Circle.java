package HomeWork_8.Shape;

public class Circle extends AbstractShape {

    private int radius;

    public Circle(int color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void getName() {
        System.out.println("Aplis");
    }

    @Override
    public void getArea() {
        System.out.println("Apla laukums: " + area());
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
