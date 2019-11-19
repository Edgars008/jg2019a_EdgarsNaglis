package Homework_5.LightBulb_and_Switcher;

public class Switcher {

    private LightBulb lightBulb;
    private boolean turnedOn;

    public void connect(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }


    public boolean switchOnOff(boolean switchOnOff){
        if (switchOnOff == true){
                System.out.println("Slēdzis ieslekts!");
            lightBulb.turnOnLight(true);
        }else {
            System.out.println("Slēdzis izslēgts!");
            lightBulb.turnOffLight(false);
        }
        return false;
    }
}
