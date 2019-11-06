public class CircleMain {
    public static void main(String[] args) {

        Circle aplis = new Circle();
        aplis.setRadius(300);
        System.out.println("Apļa radius: " + aplis.getRadius());
        System.out.println("Apļa laukums: " + aplis.calculateArea());

    }
}
