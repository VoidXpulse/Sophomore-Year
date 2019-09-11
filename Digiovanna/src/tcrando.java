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
            int fail = 1 ;
            int i;
            String[] coders = new String[notc];
            String[] testers = new String[notc];//Arrays for the testers and coders
            theFileScanner.nextLine();
            for (int h = 0; h < notc; h++) {
                coders[h] = theFileScanner.nextLine();
            }
            for(int v = 0; v < coders.length; v++){
                testers[v] = coders[rando.nextInt(coders.length)];
            }
                do {
                    fail = 0;
                    for (i = 0; i < coders.length; i++) {
                        for(int g = 0; g < i; g++) {
                            System.out.println(g);
                            do{
                                fail = 0;
                                if(testers[i - g].equals(coders[i])){
                                    fail = 1;
                                    System.out.println("Fail 1");
                                    testers[i] = coders[rando.nextInt((coders.length - i))+ i];
                                }
                                if(testers[i - (g + 1)].equals(testers[i])){
                                    fail = 1;
                                    System.out.println("Fail 2");
                                    testers[i] = coders[rando.nextInt((coders.length - i))+ i];
                                }
                                for (int e = 0; e < coders.length; e++) {
                                    System.out.println(coders[e] + " | " + testers[e]);
                                }
                            }
                            while(fail == 1);
                        }
                    }
                    for (int e = 0; e < coders.length; e++) {
                        System.out.println(coders[e] + " | " + testers[e]);
                    }
                }
                while (fail == 1);
            for (int e = 0; e < coders.length; e++) {
                System.out.println(coders[e] + " | " + testers[e]);
            }

            theFileScanner.close();
        } catch (FileNotFoundException e) {

        }

    }
}