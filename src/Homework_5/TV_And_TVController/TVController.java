package Homework_5.TV_And_TVController;

public class TVController {
    private TV televizors;


    public void connect(TV televizors){
        this.televizors = televizors;
        this.televizors.nextChannel();
        this.televizors.previousChannel();
        this.televizors.increaseVolume();
        this.televizors.decreaseVolume();
        this.televizors.turnOn();
        this.televizors.turnOff();

    }

}
