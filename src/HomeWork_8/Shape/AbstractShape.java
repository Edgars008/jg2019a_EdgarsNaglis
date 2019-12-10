package HomeWork_8.Shape;

public abstract class  AbstractShape implements Shape {

    private int color;

    public AbstractShape(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    abstract double area();
}
