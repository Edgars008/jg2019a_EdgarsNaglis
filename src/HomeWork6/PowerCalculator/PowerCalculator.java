package HomeWork6.PowerCalculator;

public class PowerCalculator {
    private int number;
    private int power;

    public void pow(int number, int power){ // 7 3
        if (power == 0){
            System.out.println("Powered number: " + 1);
        }
        else if (number == 0){
            System.out.println("Powered number: " + 0);
        }
        else if (number > 0 && power > 0){
            int copy = power; // 3
            int total=number; // 7
            while (copy > 0){// 3 > 0
                copy--;
                total *= number; // total = 7 * 7 = 49
                copy--; // 2
            }
            System.out.println("Powered number: " + total);
        }else {
            System.out.println("Input numbers can't be lower or equel to zero!");
        }
    }
}
