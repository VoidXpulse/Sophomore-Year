import java.util.Scanner;

public class Grades {
    //Justin Ecarma
    //9/15/2019
    //Grades Lab
    //Uses an object array to scale the program
    public static void main(String[] args) {

        Scanner theScanner = new Scanner(System.in);
        int numofs;//declaring variables
        String name, average;
        do {
            System.out.println("How many students do you have?");
            numofs = theScanner.nextInt();
        }//gets size of array
        while(numofs < 1);

        Student obj[] = new Student[numofs];//making array

        for(int i = 0; i < numofs; i++){
            System.out.println("What is student " + (i + 1) + "'s name?");
            name = theScanner.next();//getting name and input and making each object in the array
            obj[i] = new Student(name);
            obj[i].inputGrades();
        }

        for(int i = 0; i < numofs; i++){
            if(i == 0){//printing out everything with the format
                System.out.printf("%-10s |  ", "Name");
                System.out.printf("%-10s |  ", "Test 1");
                System.out.printf("%-10s |  ", "Test 2");
                System.out.printf("%-10s", "Average");
                System.out.println("");
            }
            for (int j = 0; j < 3; j++) {
                System.out.printf("%-10s |  ", obj[i].toString(j));
            }
            average = obj[i].getAverage();
            System.out.printf("%-10s  ", average);
            System.out.println("");
        }
    }
}
