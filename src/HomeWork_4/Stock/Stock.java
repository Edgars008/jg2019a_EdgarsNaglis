package HomeWork_4.Stock;

//Ok
public class Stock {
    private String company;
    private double currentValue;
    private double max;
    private double min;

    public Stock(String company, double currentValue) {
        this.company = company;
        this.currentValue = currentValue;
        this.max = currentValue;
        this.min = currentValue;
    }

    public String getCompany() {
        return company;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public double getMax() {
        return max;
    }

    public double getMin() {
        return min;
    }

    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }

    public void updatePrice(double updatePrice){
        if (updatePrice > this.max){
            this.max = updatePrice;
        }
        if (updatePrice < this.min){
           this.min = updatePrice;
        }
        this.currentValue = updatePrice;
    }

    public void printInformation(){
        System.out.println("currentValue = " + currentValue);
        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
}
