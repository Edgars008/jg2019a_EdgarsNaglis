package Homework_5.TV;

public class TVTest {
    public static void main(String[] args) {
        TV tv = new TV("Samsung");
        System.out.println(tv.toString());
        tv.turnOn();
        System.out.println(tv.toString());
        tv.decreaseVolume();
        tv.nextChannel();
        tv.nextChannel();
        System.out.println(tv.toString());
        tv.decreaseVolume();
        tv.previousChannel();
        System.out.println(tv.toString());
        tv.decreaseVolume();
        System.out.println(tv.toString());
        tv.increaseVolume();
        tv.previousChannel();
        System.out.println(tv.toString());
        tv.turnOff();
        System.out.println(tv.toString());
        tv.increaseVolume();
        tv.previousChannel();
        System.out.println(tv.toString());




    }
}
