public class Car {
    private int mpg, tank, mt = 100, md;

    public Car(int milespergallon){
        mpg = milespergallon;
        System.out.println("Your car has a mileage of " + mpg);
        tank = mt;
    }
    public Car(int milespergallon, int maxtank){
        mt = maxtank;
        mpg = milespergallon;
        System.out.println("Your car has a mileage of " + mpg);
        tank = maxtank;
    }
    public void drive(int miles) {

        if(tank - (miles / mpg) < 0) {
            while(tank - (miles / mpg) < 0){
                miles--;
                System.out.println("e");
            }
        }

        tank = tank - (miles / mpg);
        md = md + miles;
        if(tank < 0){
            tank = 0;
            System.out.println("Your car is out of gas.");
        }
    }
    public void fillgas(int gallons){
        tank = tank + gallons;

        if(tank > mt){
            tank = mt;
        }
    }
    public void getMilesDriven() {
        System.out.println("You have driven " + md + " miles.");
    }
    public void getGasTank(){
        System.out.println("Your car is at " + tank + " gallons of gas.");
    }
}
