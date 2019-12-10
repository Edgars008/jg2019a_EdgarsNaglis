package HomeWork_11.Shopping_list;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();


        product.addProduct("Tomats",3.25,Category.FRUIT);
        product.addProduct("Tomats",3.75,Category.FRUIT);
        product.addProduct("Candy King",5.0,Category.CANDY);
        product.addProduct("Chicken",10,Category.MEAT);
        product.addProduct("Carrot",1,Category.VEGETABLE);

        product.printProducts();
        System.out.println("Printed list=====>");

        product.deleteProduct("Chicken");
        product.printProducts();
        System.out.println("Printed list=====>");

       product.getCategory();
    }
}
