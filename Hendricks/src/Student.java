import java.util.Scanner;

public class Student {

    private String name;
    Scanner theScanner = new Scanner(System.in);
    private int test1, test2, average;

    public Student(String studentName){
        name = studentName;
    }
    public void inputGrades(){
        do{
            System.out.println("Enter " + name + "'s score for Test One.");
            test1 = theScanner.nextInt();
        }
        while(test1 < 0 || test1 > 100);

        do{
            System.out.println("Enter " + name + "'s score for Test Two.");
            test2 = theScanner.nextInt();
        }
        while(test2 < 0 || test2 > 100);
    }
    public int getAverage() {
        average = (test1 + test2)/2;
        return average;
    }
    public String getName() {
        return name;
    }
    public void printName(){
        System.out.println(name);
    }
}
