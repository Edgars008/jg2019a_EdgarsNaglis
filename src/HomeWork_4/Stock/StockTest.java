package HomeWork_4.Stock;

//Ok
public class StockTest {
    public static void main(String[] args) {
        Stock ibm = new Stock("IBM",150);
        ibm.updatePrice(150.37);
        ibm.printInformation();
        ibm.updatePrice(149.82);
        ibm.printInformation();
        ibm.updatePrice(150.12);

        ibm.printInformation();
    }
}
