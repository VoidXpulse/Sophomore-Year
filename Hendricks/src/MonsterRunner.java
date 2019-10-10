import java.util.Scanner;

public class MonsterRunner {
    //Justin Ecarma
    //10/9/2019
    //MonsterRunnerLab
    //Extra:The program also has a method to check whether the monsters are the same size.
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter 1st monster's name : ");
        String name = keyboard.next();
        System.out.print("Enter 1st monster's size : ");
        int size=keyboard.nextInt();
        Monster mOne = new Monster(name, size);
        System.out.print("Enter 2nd monster's name : ");
        name = keyboard.next();
        System.out.print("Enter 2nd monster's size : ");
        size=keyboard.nextInt();
        Monster mTwo = new Monster(name, size);
        if(mOne.isBigger(mTwo.size))
        {
            System.out.println("Monster one is bigger than Monster two.");
        }
        else if(mOne.isSmaller(mTwo.size))
        {
            System.out.println("Monster one is smaller than Monster two.");
        }
        else {
            System.out.println("Monster one is the same size as Monster two.");
        }
        if(mOne.namesTheSame(mTwo.name))
        {
            System.out.println("Monster one has the same name as Monster two.");
        }
        else{
            System.out.println("Monster one has a different name than Monster two.");
        }
    }
}
class Monster{
    public String name, sizeString;
    public int size, othersize;
    public Monster(String first, int howbig) {
        name = first;
        size = howbig;
    }
    public boolean isBigger(int howbig){
        if(size > howbig){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isSmaller(int howbig){
        if(size < howbig){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean sizesTheSame(int howbig){
        if(size == howbig){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean namesTheSame(String othername){
        if(name.equals(othername)){
            return true;
        }
        else {
            return false;
        }
    }
    public String toString(){
        return Integer.toString(size);
    }
}
