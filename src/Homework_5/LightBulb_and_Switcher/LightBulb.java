package Homework_5.LightBulb_and_Switcher;

public class LightBulb {
    private boolean turnedOn;
    private static int currentTurnOnCount = 0;
    public static final int MAX_TURN_ON_COUNT = 5;



    public boolean turnOnLight(boolean turnedOn){
        if (currentTurnOnCount < MAX_TURN_ON_COUNT){
            this.turnedOn = turnedOn;
            currentTurnOnCount++;
            System.out.println("Spuldzīte ieslēgta!");

        }else {
            System.out.println("Sasniegts maksimalais iesleguma skaits 5," +
                    " spuldzite izslegta!");
            this.turnedOn = false;
        }

        return turnedOn;
    }
    public boolean turnOffLight(boolean turnedOn){
        System.out.println("Spuldzīte izslēgta!");
        this.turnedOn=turnedOn;
        return turnedOn;
    }

}
