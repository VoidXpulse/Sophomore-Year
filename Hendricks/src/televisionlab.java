import java.util.Scanner;

public class televisionlab {

/** This class demonstrates the Television class*/

            public static void main(String[] args)
            {
//create a Scanner object to read from the keyboard
                Scanner keyboard = new Scanner (System.in);
//declare variables
                int station; //the user’s channel choice
//declare and instantiate a television object
                Television bigScreen = new Television("Toshiba", 55);
//turn the power on
                bigScreen.power();
//display the state of the television
                System.out.println("A " + bigScreen.getScreenSize() +
                        bigScreen.getManufacturer() +
                        " has been turned on.");
//prompt the user for input and store into station
                System.out.print("What channel do you want? ");
                station = keyboard.nextInt();
//change the channel on the television
                bigScreen.setChannel(station);
//increase the volume of the television
                bigScreen.increaseVolume();
//display the the current channel and volume of the
//television
                System.out.println("Channel: " +
                        bigScreen.getChannel() +
                        " Volume: " + bigScreen.getVolume());
                System.out.println(
                        "Too loud!! I am lowering the volume.");
//decrease the volume of the television
                bigScreen.decreaseVolume();
                bigScreen.decreaseVolume();
                bigScreen.decreaseVolume();
                bigScreen.decreaseVolume();
                bigScreen.decreaseVolume();
                bigScreen.decreaseVolume();
//display the current channel and volume of the
//television
                System.out.println("Channel: " +
                        bigScreen.getChannel() +
                        " Volume: " + bigScreen.getVolume());
                System.out.println(); //for a blank line


            }
        }
class Television {

    private String manufacturer, e;
    private int screenSize;
    private boolean powerOn;
    private int channel, volume;

    public Television(String brand, int size) {
        manufacturer = brand;
        screenSize = size;
        powerOn = false;
        channel = 69;
        volume = 25;

    }

    public void setChannel(int channel) {
        if(powerOn && (channel >= 1) && (channel <= 100)){
            this.channel = channel;
            System.out.println("The channel is now " + getChannel());
        }
        else if((channel <= 1) || (channel >= 100)){
            System.out.println("You either need the premium package or the negative package for that channel");
        }
        else{
            System.out.println("The TV is not on.");
        }
    }
    public void power() {
        if(!powerOn){
            powerOn = true;
        }
        else{
            powerOn = false;
        }
    }
    public void increaseVolume(){
        if(powerOn) {
            volume++;
            System.out.println("The volume is now " + getVolume());
            if (volume > 100) {
                volume = 100;
            }
        }
        else{
            System.out.println("The TV is not on.");
        }
    }
    public void decreaseVolume() {
        if(powerOn) {
            volume--;
            System.out.println("The volume is now " + getVolume());
            if(volume < 0){
                volume = 0;
            }
        }
        else{
            System.out.println("The TV is not on.");
        }
    }
    public int getChannel() {
        return channel;
    }
    public int getVolume(){
        return volume;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public String getScreenSize() {
        return String.format("%d inch ", screenSize);
    }
}