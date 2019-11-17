package HomeWork_2;

public class MathOperations {
    public static void main(String[] args) {
        int firstNumber = 5;
        int secondNumber = 10;

       MathOperations mathOperations = new MathOperations();
       mathOperations.add(firstNumber,secondNumber);
       mathOperations.subtract(firstNumber,secondNumber);
       mathOperations.divide(firstNumber,secondNumber);
       mathOperations.multiply(firstNumber,secondNumber);


    }

    public void add(int one, int two){
        System.out.println("Add operation = " + (one + two));
    }
    public void subtract(int one, int two){
        System.out.println("Subtract operation = " + (one - two));
    }
    public void divide(int one, int two){
        System.out.println("Divide operation = " + (one / two));
    }
    public void multiply(int one, int two){
        System.out.println("Multiply operation = " + (one * two));
    }
}
