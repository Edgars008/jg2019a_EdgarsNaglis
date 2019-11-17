package HomeWork_4.CreditCard;

//kods nekompilējas, salabo
public class CreditCard {
    private String cardNumber;
    private String cardPIN;
    private double balanceAccount;
    private double maxCreditLimit;
    private double usedCreditLimit;


    public CreditCard(String cardNumber, String cardPIN, double balanceAccount, double balanceCredit) {
        this.cardNumber = cardNumber;
        this.cardPIN = cardPIN;
        this.balanceAccount = balanceAccount;
        this.maxCreditLimit = balanceCredit;
        this.usedCreditLimit = 0;
    }

    public double getBalanceAccount() {
        return balanceAccount;
    }

    public double getMaxCreditLimit() {
        return maxCreditLimit;
    }

    public boolean toup(double amount, String pinCode){
        if (this.cardPIN.equals(pinCode)){
            if (usedCreditLimit > 0){
              usedCreditLimit -= amount; // 50 -150 = -100
                double creditlefOvers = usedCreditLimit;
                if (creditlefOvers <= 0 ){
                    usedCreditLimit = 0;
                    balanceAccount -= creditlefOvers;
                }
                System.out.println("Money toup " + amount + " Account = " +balanceAccount
                + " Credit " + usedCreditLimit);
            }else {
                balanceAccount += amount;
                System.out.println("Money toup " + amount);
            }
        }else {
            System.out.println("Wrong PIN!");
        }

       return true;
    }

    public boolean withdraw(double amount, String pinCode){
        if (this.cardPIN.equals(pinCode)){
            double availableAmount = balanceAccount +(maxCreditLimit - usedCreditLimit);
            if (availableAmount>= amount){
                balanceAccount -= amount;
                if (balanceAccount < 0){
                    usedCreditLimit -= balanceAccount;
                    balanceAccount = 0;
                }
                System.out.println("Money withdraw " + amount);
            } else {
                System.out.println("Cant withdraw the money, " +
                        "balance available:  " + balanceAccount + " credit " + maxCreditLimit);
            }

        }else {
            System.out.println("Wrong PIN!");
        }
        return true;
    }

    public void balanceActions(){
        System.out.println("Debeta bilance = " + balanceAccount);
        System.out.println("Kredita limits = " + maxCreditLimit);
        if (balanceAccount > maxCreditLimit){
            System.out.println("Izmantots kredits = " + 0);
        }else {
            System.out.println("Izmantots kredits = " + usedCreditLimit);
        }
    }
}
