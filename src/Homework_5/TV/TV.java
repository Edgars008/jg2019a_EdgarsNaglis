package Homework_5.TV;

import java.util.Objects;

//Ok
public class TV {
    private int currentChannel;
    private int currentVolumeLevel;
    private String manufacturer;
    private boolean turnedOn;

    public TV(String manufacturer) {
        this.currentChannel = 1;
        this.currentVolumeLevel = 50;
        this.manufacturer = manufacturer;
        this.turnedOn = false;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        this.currentChannel = currentChannel;
    }

    public int getCurrentVolumeLevel() {
        return currentVolumeLevel;
    }

    public void setCurrentVolumeLevel(int currentVolumeLevel) {
        this.currentVolumeLevel = currentVolumeLevel;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }

    public void nextChannel(){
        if (this.turnedOn == true){ //izmanto: if (this.turnedOn){
            this.currentChannel += 1; //lieot this.currentChannel++
        }else {
            System.out.println("TV ir izslegts!");
        }

    }

    public void previousChannel(){
        if (this.turnedOn == true){ //izmanto: if (this.turnedOn){
            this.currentChannel -= 1; //lieot this.currentChannel--
        }else {
            System.out.println("TV ir izslegts!");
        }

    }

    public void increaseVolume(){

        if (this.turnedOn == true){ //izmanto: if (this.turnedOn){
            this.currentVolumeLevel += 1; //lieot this.currentChannel++
        }else {
            System.out.println("TV ir izslegts!");
        }
    }
    public void decreaseVolume(){

        if (this.turnedOn == true){ //izmanto: if (this.turnedOn){
            this.currentVolumeLevel -= 1;  //lieot this.currentChannel--
        }else {
            System.out.println("TV ir izslegts!");
        }
}

    public void turnOn(){
        this.turnedOn = true;
    }

    public void turnOff(){
        this.turnedOn = false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TV)) return false;
        TV tv = (TV) o;
        return currentChannel == tv.currentChannel &&
                currentVolumeLevel == tv.currentVolumeLevel &&
                turnedOn == tv.turnedOn &&
                Objects.equals(manufacturer, tv.manufacturer);
    }

    @Override
    public String toString() {
        return "TV{" +
                "currentChannel=" + currentChannel +
                ", currentVolumeLevel=" + currentVolumeLevel +
                ", manufacturer='" + manufacturer + '\'' +
                ", turnedOn=" + turnedOn +
                '}';
    }
}
