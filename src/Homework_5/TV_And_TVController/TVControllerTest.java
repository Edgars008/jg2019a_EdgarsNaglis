package Homework_5.TV_And_TVController;

public class TVControllerTest {
    public static void main(String[] args) {

        TVController tvController = new TVController();
        TV tv = new TV("Samsung");
        tvController.connect(tv);

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
