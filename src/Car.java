public class Car {
    private int mpg, tank, maxtank = 100;
    public Car(int milespergallon){
        mpg = milespergallon;
    }
    public int drive(int miles) {
        tank = tank - (miles / mpg);

        if(tank < 0){
            tank = 0;
        }

        if(tank > maxtank){
            tank = maxtank;
        }

        return tank;
    }
    public int fillgas(int gallons){

    }
}
