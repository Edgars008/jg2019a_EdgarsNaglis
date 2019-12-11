package FinalWork;

import java.util.Scanner;

public class demoAppllication {
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new demoAppllication().run();

    }

    private void run() {
        printMenu();
    }

    private void printMenu() {
        System.out.println("1: add product");
        System.out.println("2: find product by name");
        System.out.println("3: delete product");
        System.out.println("1: add producd");
    }
}
