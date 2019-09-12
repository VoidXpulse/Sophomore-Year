import java.util.Scanner;

public class CarLab {
    //Justin Ecarma
    //9/6/2019
    //Car Lab
    //Extra: More methods that do more things
    public static void main(String[] args) {
        Scanner theScanner = new Scanner(System.in);
        int ui = 0, drivemiles = 0, fillgas = 0, drivecheck, gascheck;
        Car stingray = new Car(1, 100);//car object

        while(true){
            do{
                drivecheck = 0;
                gascheck = 0;
                System.out.println("What would you like to do?");
                System.out.println("1. See Gas Tank");
                System.out.println("2. See Miles Driven");
                if(stingray.getGasTank() > 0){
                    System.out.println("3. Drive");
                }
                else{
                    drivecheck = 1;
                }
                if(stingray.getGasTank() < stingray.getMaxTank()){
                    System.out.println("4. Fill Gas Tank");
                }
                else{
                    gascheck = 1;
                }
                ui = theScanner.nextInt();
                //User Input on what to do
                if(((ui == 4) && (gascheck == 1)) || ((ui == 3) && (drivecheck == 1))){
                    System.out.println("invalid input");
                    continue;
                }
            }
            while(((ui > 4) || (ui < 1)) || ((ui == 4) && (gascheck == 1)) || ((ui == 3) && (drivecheck == 1)));

            //switch statement for user input
            switch(ui){
                case(1): {
                    stingray.seeGasTank();
                    //see gas tank
                    break;
                }
                case(2): {
                    stingray.seeMilesDriven();
                    //see miles driven
                    break;
                }
                case(3): {
                    do{
                        //drive method takes only integer for mile input
                        System.out.println("How many miles would you like to drive?");
                        drivemiles = theScanner.nextInt();
                    }
                    while(drivemiles < 1);

                    stingray.drive(drivemiles);
                    break;
                }
                case(4): {
                    do{
                        //fill gas method
                        System.out.println("How much gas do you need?");
                        fillgas = theScanner.nextInt();
                    }
                    while(fillgas < 1);
                    stingray.fillgas(fillgas);
                    break;
                }
                case(5): {
                    stingray.seeMoney();
                }
                default: {
                    //default just shows gas and miles driven
                    stingray.seeGasTank();
                    stingray.seeMilesDriven();
                    break;
                }
            }
        }
    }
}
