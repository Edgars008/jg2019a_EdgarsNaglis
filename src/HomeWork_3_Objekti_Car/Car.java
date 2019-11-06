public class Car {
    private  String color;
    private  String manufacturer;
    private int year;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void printcar(){
        System.out.println("Mašīnas krāsa: " + color);
        System.out.println("Mašīnas ražotājs: " + manufacturer);
        System.out.println("Mašīnas gads: " + year);
    }
}
