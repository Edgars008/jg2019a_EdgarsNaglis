import java.awt.*;

public class DogTest {
    public static void main(String[] args) {
        Dog rex = new Dog("Rex",6,false, Color.BLACK);
        rex.eat();
        rex.bark();
        rex.sleep();
    }
}
