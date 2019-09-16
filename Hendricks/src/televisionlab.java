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
                //Code Listing 6.1 continued on next page.
                //58 Lab Manual to Accompany Starting Out with Java 5: From Control Structures to Objects
               // Gaddis_516907_Java 4/10/07 2:10 PM Page 58
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
//HERE IS WHERE YOU DO TASK #5
            }
        }
class Television {

    private String manufacturer;
    private int screenSize;
    private boolean powerOn;
    private int channel, volume;

    public Television(String brand, int size) {
        manufacturer = brand;
        screenSize = size;
        powerOn = false;
        channel = 0;
        volume = 25;

    }

    public void setChannel(int channel) {
        this.channel = channel;
    }
    public void power() {
        if(powerOn){
            powerOn = true;
        }
        else{
            powerOn = false;
        }
    }
    public void increaseVolume(){
        volume++;

        if(volume > 100){
            volume = 100;
        }
    }
    public void decreaseVolume() {
        volume--;

        if(volume < 0){
            volume = 0;
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
    public int getScreenSize() {
        return String.format("%d inches", screenSize);
    }
}