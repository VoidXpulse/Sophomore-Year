import java.util.Scanner;

public class Student {

    private String name;
    private String[] data = new String[3];
    Scanner theScanner = new Scanner(System.in);
    private int test1, test2, average;//making the variables

    public Student(String studentName){
        //setting the name
        name = studentName;
    }
    public void inputGrades(){//gets input for grades
        do{
            System.out.println("Enter " + name + "'s score for Test One. Note: If this message repeats, your input was invalid.");
            test1 = theScanner.nextInt();
        }
        while(test1 < 0 || test1 > 100);
        //error traps
        do{
            System.out.println("Enter " + name + "'s score for Test Two. Note: If this message repeats, your input was invalid.");
            test2 = theScanner.nextInt();
        }
        while(test2 < 0 || test2 > 100);
    }
    public String getAverage() {
        average = (test1 + test2)/2;
        return average + "";
    }
    public String getName() {
        return name;
    }
    public void printName(){
        System.out.println(name);
    }
    public String toString(int piece) {//return specific output for input.
        data[0] = name + "";
        data[1] = test1 + "";
        data[2] = test2 + "";
        return data[piece];
    }
}
