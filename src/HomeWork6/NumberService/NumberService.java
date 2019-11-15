package HomeWork6.NumberService;

import java.util.ArrayList;

public class NumberService {
    private int num1;
    private int num2;

    public void sumInRange(int num1, int num2) {
        int sum = 0;
        if (num1 < num2){
            while (num1 <= num2){
                sum += num1;
                if (num1 > num2){
                    break;
                }
                num1 += 1;

            }
        }else {
            while (num1 >= num2){
                sum += num2;
                if (num2 > num1){
                    break;
                }
                num2 += 1;

            }
        }
        System.out.println("Total Sum: " + sum);
    }

    public void getEvenNumberCount(int num1, int num2) {

        if (num1 < num2){
            System.out.print("Distance numbers: " + num1 + " to " + num2 + " Even numbers:");
            while (num1 <= num2){
                int even = num1;
                int remainder = even % 2;
                if (remainder == 0){
                    System.out.print(" " + even);
                }
                if (num1 > num2){
                    break;
                }
                num1 += 1;

            }
        }else {
            System.out.print("Distance numbers: " + num1 + " to " + num2 + " Even numbers: ");
            while (num1 >= num2){
                int even = num2;
                int remainder = even % 2;
                if (remainder == 0){
                    System.out.print(" " + even);
                }
                if (num2 > num1){
                    break;
                }
                num2 += 1;
            }
        }
        System.out.println();
    }

}
