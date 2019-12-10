package HomeWork_2;

import java.util.Random;

//OK
public class RandomNumbersServiceTest {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int num1 = randomGenerator.nextInt();
        int num2 = randomGenerator.nextInt();
        int num3 = randomGenerator.nextInt();
        int sum = num1 + num2 + num3;
        System.out.println("Skaitlis 1: " + num1);
        System.out.println("Skaitlis 2: " + num2);
        System.out.println("Skaitlis 3: " + num3);
        System.out.println("Kopsumma: " + sum);


    }
}
