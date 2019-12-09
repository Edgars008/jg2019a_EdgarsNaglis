package HomeWork_4.CreditCard;

import HomeWork_4.CreditCard.CreditCard; //leks imports

//lietojam "ctrl + alt + l"
public class Main {
    public static void main(String[] args) {

        CreditCard creditCardEN = new CreditCard("400-300-400-500", "1789", 100, 200);
        creditCardEN.withdraw(150, "1789");

        creditCardEN.balanceActions();

        System.out.println("====================================");

        creditCardEN.toup(30, "1789");
        creditCardEN.balanceActions();

        System.out.println("====================================");

        creditCardEN.toup(21, "1789");
        creditCardEN.balanceActions();
    }
}
