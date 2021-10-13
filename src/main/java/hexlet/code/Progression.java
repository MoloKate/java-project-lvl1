package main.java.hexlet.code;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Progression {
    public static void game() {
        Cli.welcomeName();

        int i;
        int progNumber = 0;
        int answerProg = 0;


        Cli nameUser = new Cli();
        String nameProg = nameUser.nameGlobal;



        Scanner in = new Scanner(System.in);
        System.out.print("What number is missing in the progression?");
        for (i = 0; i < 3; i++){
            Random random = new Random();
            int randomLengthProg = 5 + random.nextInt(5);
            int[] Progress = new int[randomLengthProg];
            int step = 1 + random.nextInt(9);
            Progress[0] = random.nextInt(10);
            for (int j = 1; j < randomLengthProg; j++) {
                Progress[j] = Progress[0] + step * j;
            }

            int replacedItemNumber = random.nextInt(randomLengthProg - 1);
            String replaceElementProgress = "";
            for (int k = 0; k < randomLengthProg; k++) {
                if (k == replacedItemNumber) {
                    replaceElementProgress += ".." + " ";
                } else {
                replaceElementProgress += Integer.toString(Progress[k]) + " ";
                }
            }
            System.out.println(replaceElementProgress);
            answerProg = Integer.parseInt(in.nextLine());
            progNumber = Progress[replacedItemNumber];

            if (Progress[replacedItemNumber] == answerProg) {
                System.out.println("Correct!");
            }
            else {break;}
        }
        if (i == 3) {
            System.out.println("Congratulations, " + nameProg + "!");
        } else {
            System.out.println ("'" + answerProg + "'" + "is wrong answer ;(. " +
                   "Correct answer was " + "'" + progNumber + "'.\n  Let's try again, " + nameProg + "!");

        }

    }
}
