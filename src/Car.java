import java.util.Random;
import java.util.Scanner;

public class Car {
    private int mpg,  md, tempdrive, mp = 1, passengers = 0, pdistance, pyn, checkgallondecrease;
    private double tank, mt = 100, money = 500;
    Random rando = new Random(); // Randomizer
    Passenger pone = new Passenger(rando.nextInt(80) + 20);
    Scanner theScanner = new Scanner(System.in);
    public Car(int milespergallon, int maxtank){
        mt = maxtank;
        mpg = milespergallon;
        System.out.println("Your car has a mileage of " + mpg + " miles per gallon.");
        tank = maxtank;
        //setting up Car 1
    }
    public void drive(int miles) {

        if(tank - (miles / mpg) < 0) {
            while(tank - (miles / mpg) < 0){
                miles--;
            }
        }
        //checking if the car has enough gas to drive that far.

        tank = tank - (miles / mpg);
        tempdrive = miles/mpg;

        //passenger/event/distance system setup
        for(int i = 0; i < tempdrive; i++){
            md++;
            if(passengers >= 1){
                money += pone.distanceadd();
                passengers--;
            }

            if((md % 10 == 0) && (rando.nextInt(5) == 1) && (passengers < mp)){
                pdistance = rando.nextInt(rando.nextInt(80) + 20);

                System.out.println("You can pick up a passenger who wants to go " + pdistance + " miles.  Do you want to pick them up?");
                do {
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    pyn = theScanner.nextInt();
                }
                while(pyn < 1 || pyn > 2);

                if(pyn == 1){
                    passengers++;
                    pone.reset(pdistance);
                }
            }
        }

        //checking if gas is below zero and moving it back up
        if(tank < 0){
            tank = 0;
            System.out.println("Your car is out of gas.");
        }
        this.seeMoney();
    }
    public void fillgas(int gallons){
        checkgallondecrease = 0;
        while(money < (2.50 * gallons)) {
            gallons--;
            checkgallondecrease = 1;
        }
        tank = tank + gallons;
        money -= 2.50 * gallons;
        //filling gas

        //making sure the tank doesn't overflow
        if(tank > mt){
            tank = mt;
            checkgallondecrease = 1;
        }
        if(checkgallondecrease == 1){
            System.out.println("You were only able to fill your gas tank up to " + tank + " gallons.");
        }
        this.seeMoney();
    }
    //seeing variable methods
    public void seeMilesDriven() {
        System.out.println("You have driven " + md + " miles.");
    }
    public void seeGasTank(){
        System.out.println("Your car is at " + tank + " gallons of gas out of " + mt + ".");
    }
    public void seeMoney() {
        System.out.println("You have $" + money + ".");
    }
    //getting variable methods
    public double getGasTank() {
        return tank;
    }
    public int getMilesDriven() {
        return md;
    }
    public double getMaxTank() {
        return mt;
    }
}
