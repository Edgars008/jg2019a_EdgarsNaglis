import java.awt.*;

public class Dog {
    private String name;
    private int age;
    private boolean hungry;
    private Color color;

    public Dog(String name, int age, boolean hungry, Color color) {
        this.name = name;
        this.age = age;
        this.hungry = hungry;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void bark(){
       System.out.println(this.name + " is wowowowowowowoowow");
   }
   public void eat(){
       System.out.println(this.name + " is eating");
   }

   public void sleep(){
       System.out.println(this.name + " is sleapind");
   }


}
