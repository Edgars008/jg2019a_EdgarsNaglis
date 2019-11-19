package Homework_5.LightBulb_and_Switcher;

public class SwitcherTest {
    public static void main(String[] args) {
        Switcher switcher = new Switcher();
        LightBulb lightBulb = new LightBulb();

        switcher.connect(lightBulb);

     switcher.switchOnOff(true);
     switcher.switchOnOff(true);
     switcher.switchOnOff(true);
     switcher.switchOnOff(true);
     switcher.switchOnOff(true);
     switcher.switchOnOff(true);
     switcher.switchOnOff(false);


    }
}
