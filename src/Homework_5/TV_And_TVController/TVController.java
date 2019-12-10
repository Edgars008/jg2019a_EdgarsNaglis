package Homework_5.TV_And_TVController;

//šai klasei bija jāsatur metodes, kuras izsauc TV metdes
// piemēram,  nextChannel(), kuras izsauc tv.nextChannel() utt.
public class TVController {
    private TV televizors;  //atribūtiem ir jābūt angļu valodā


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
