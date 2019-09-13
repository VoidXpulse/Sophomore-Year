import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class tcrando {
    public static void main(String[] args) {
        File theFile = new File("Digiovanna/src/TC.txt");//tester/coder names are in here
        try {
            Scanner theFileScanner = new Scanner(theFile);
            Scanner theScanner = new Scanner(System.in);
            Random rando = new Random();
            int notc = theFileScanner.nextInt(); //number of testers/coders
            int random = 0, stupid = 0, ui, ui2;
            String[] coders = new String[notc];
            String[] testers = new String[notc];//Arrays for the testers and coders and repeat
            boolean[] repeat = new boolean[notc];
            theFileScanner.nextLine();//moving to the next line
            for (int h = 0; h < notc; h++) {
                coders[h] = theFileScanner.nextLine();
                repeat[h] = false;
            } // setting the coders and repeat arrays

            do {//the first do loop is a failsafe for if the last person gets stuck with themselves
                for (int o = 0; o < notc; o++) {// this triggers in the beginning or if the stuck with themselves failsafe occurs
                    repeat[o] = false;
                    testers[o] = null;
                }
                for (int j = 0; j < notc; j++) {//iterates through each name on the list and matches it with another random name on the list
                    do {//checks if a name repeats or is matched with itself
                        if (stupid == 1) {
                            testers[random] = null;
                            stupid = 0;
                        }
                        random = rando.nextInt(notc);//generates a random number to match the name coders[j] with a tester[random]
                        if (repeat[random]) {//checks if the name has already been used by setting a parallel boolean array to true when a name is used. i.e. coders[0] is used, so repeat[0] is set to true and checked here
                            continue;//if the name is already used as tester, the loop is reset, and a new random number is generated
                        }
                        testers[random] = coders[j];//if the name has not been used, then it is set to the tester[random], so if we are in the first iteration where j is 0, then a random number that is not 0 is selected for the name to be a tester for
                        if (testers[notc - 1] == coders[notc - 1]) {//failsafe for the last person being stuck with themselves.
                            break;//breaks in order to get to the first do while loop and reset everything.
                        }
                        if (testers[j] == coders[j]) {//if the coder is given themselves, the loop is told to set stupid to one and jump to the condition, so it knows to continue, and then stupid is set to 0 up above, and the tester is set back to null
                            stupid = 1;
                            continue;
                        }
                    }
                    while ((testers[j] == coders[j]) || repeat[random]);
                    if (testers[notc - 1] == coders[notc - 1]) {
                        break;//second break statement for the failsafe
                    }
                    repeat[random] = true;//this sets a name to true for the repeat array when a name is used
                }
            }
            while (testers[notc - 1] == coders[notc - 1]);

            do {//looping the sorting of the arrays until the user decides they want to stop.
                System.out.println();

                do {
                    System.out.println("What would you like to sort by?");
                    System.out.println("1. Coder Last Name");
                    System.out.println("2. Tester Last Name");
                    ui = theScanner.nextInt();
                }
                while (ui < 1 || ui > 2);

                if (ui == 2) {
                    alphabetic(testers, coders);
                } else {
                    alphabetic(coders, testers);
                }
                System.out.printf("%-20s |  ", "Coders");
                System.out.printf("%-20s", "Testers");
                System.out.println("");
                for (int e = 0; e < coders.length; e++) {
                    System.out.printf("%-20s |  ", coders[e]);
                    System.out.printf("%-20s", testers[e]);
                    System.out.println("");
                }

                do {
                    System.out.println("Would you like to sort again?");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    ui2 = theScanner.nextInt();
                }
                while (ui2 < 1 || ui2 > 2);
            }
            while (ui2 != 2);
            theFileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }
    }

    public static void alphabetic(String[] words, String[] words2) {//sort method for the arrays
        String temp;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < words.length - 1; i++) {
                if ((words[i].substring(words[i].indexOf(' '), words[i].indexOf(' ') + 3).compareToIgnoreCase(words[i + 1].substring(words[i + 1].indexOf(' '), words[i + 1].indexOf(' ') + 3))) > 0) {
                    temp = words[i];
                    words[i] = words[i + 1];
                    words[i + 1] = temp;

                    temp = words2[i];
                    words2[i] = words2[i + 1];
                    words2[i + 1] = temp;
                    flag = true;
                }
            }
        }
    }
}
