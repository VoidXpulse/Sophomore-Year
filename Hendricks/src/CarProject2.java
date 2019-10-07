import java.util.Random;
import java.util.Scanner;

public class CarProject2 {
    //Justin Ecarma
    //10/7/2019
    //CarClass2
    //Extra: I added most of the methods from the other Car lab.
    public static void main(String[] args) {
        Car2 c = new Car2(9000, 3000,1, 10000); //single constructor that takes in miles

//driven and when to change the oil
//assumes car has never had an oil change
//sets last oil change mileage to 0
        System.out.println( c.timeForOilChange( ) ); //checks if it is time to change oil
//returns true as 9000 is &gt;= 3000
//resets last oil change mileage to 0
        c.drive( 2000 ); //add 2000 miles to miles driven
        System.out.println( c.timeForOilChange( ) ); //checks if it is time to change oil
//car has driven 2000 miles since
//last oil change – returns false
        c.drive( 2000 ); //add 2000 miles to miles driven
        System.out.println( c.timeForOilChange( ) ); //checks if it is time to change oil
//car has now driven 4000 miles since
//last oil change – return true
//4000 is &gt;= 3000 so time to change oil
        c.drive(8000);
        c.fillgas(4000);
        System.out.println(c.timeForOilChange());
        System.out.println("The car has " + c.getGasTank() + " gallons of gas.");
        System.out.println("The car has " + c.getMilesDriven() + " miles driven.");
    }
}
class Car2 {
    private int milesdrivenoil, oiltime, milesdriven;
    private int mpg,  md, tempdrive, mp = 1, passengers = 0, pdistance, pyn;
    private double tank, mt = 100;
    Random rando = new Random(); // Randomizer
    Scanner theScanner = new Scanner(System.in);

    public Car2(int miles, int oilchangetime, int milespergallon, int maxtank) {
        milesdriven = miles;
        oiltime = oilchangetime;
        mt = maxtank;
        mpg = milespergallon;
        System.out.println("Your car has a mileage of " + mpg + " miles per gallon.");
        tank = maxtank;
    }
    public boolean timeForOilChange() {
        if(milesdrivenoil >= oiltime){
            milesdrivenoil = 0;
            return true;
        }
        return false;
    }
    public void drive(int miles) {
        if(tank - (miles / mpg) < 0) {
            while(tank - (miles / mpg) < 0){
                miles--;
            }
        }
        //checking if the car has enough gas to drive that far.
        tank = tank - (miles / mpg);
        milesdriven += miles;
        milesdrivenoil += miles;
        if(tank <= 0){
            tank = 0;
            System.out.println("Your car is out of gas.");
        }
    }
    public void fillgas(int gallons){
        tank = tank + gallons;
        //filling gas

        //making sure the tank doesn't overflow
        if(tank > mt){
            tank = mt;
        }
    }
    //seeing variable methods
    public void seeMilesDriven() {
        System.out.println("You have driven " + md + " miles.");
    }
    public void seeGasTank(){
        System.out.println("Your car is at " + tank + " gallons of gas out of " + mt + ".");
    }
    //getting variable methods
    public double getGasTank() {
        return tank;
    }
    public int getMilesDriven() {
        return milesdriven;
    }
    public double getMaxTank() {
        return mt;
    }
}
