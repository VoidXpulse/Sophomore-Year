import java.util.Scanner;

public class CarLab {
    //Justin Ecarma
    //9/6/2019
    //Car Lab
    //Extra: More methods that do more things
    public static void main(String[] args) {
        Scanner theScanner = new Scanner(System.in);
        int ui = 0, drivemiles;

        Car stingray = new Car(1, 100);

        while(true){
            do{
                System.out.println("What would you like to do?");
                System.out.println("1. See Gas Tank");
                System.out.println("2. See Miles Driven");
                if(stingray.getGasTank() < 1){
                    System.out.println("3. Drive");
                }

                System.out.println("4. Fill Gas Tank");
                ui = theScanner.nextInt();
            }
            while((ui > 4) || (ui < 1));


            switch(ui){
                case(1): {
                    stingray.getGasTank();
                }
                case(2): {
                    stingray.getMilesDriven();
                }
                case(3): {
                    do{

                    }
                    while()

                    stingray.drive();
                }
                case(4): {
                    stingray.getGasTank();
                }
                default: {
                    stingray.getGasTank();
                    stingray.getMilesDriven();
                    break;
                }
            }
        }
    }
}
