package HomeWork_6.Car;

public class Car {
    private String model;
    private String color;
    private int maxSpeed;
    private int currentSpeed;

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
    }

    public int accelerate(){
        if (currentSpeed <= maxSpeed){
            currentSpeed += 1;
            isDriving();
        }else {
            return currentSpeed;
        }
        System.out.print("Atrums: ");
        return currentSpeed;
    }

    public int slowDown(){
        if (currentSpeed <= maxSpeed && currentSpeed > 0){
            currentSpeed -= 1;
            isDriving();
            canAccelerate();
        }else {
            System.out.print("Atrums: ");
            return currentSpeed;
        }
        System.out.print("Atrums: ");
        return currentSpeed;
    }

    private boolean isDriving(){
        if (currentSpeed > 0){
            return true;
        }else {
            return false;
        }
    }

    private boolean canAccelerate(){
        if (currentSpeed <= maxSpeed && currentSpeed >= 0){
            return true;
        }else {
            return false;
        }
    }

    public void speedUp(){
        while (currentSpeed != maxSpeed){
            System.out.println(accelerate());
        }
    }



}
