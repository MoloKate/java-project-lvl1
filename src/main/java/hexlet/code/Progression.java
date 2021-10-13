package main.java.hexlet.code;

import java.util.Random;
import java.util.Scanner;


public class Progression {
    public static void game() {
        Cli.welcomeName();

        int i;
        int progNumber = 0;
        int answerProg = 0;
        int numberOfAnswer = 3;


        Cli nameUser = new Cli();
        String nameProg = nameUser.nameGlobal;
        Random random = new Random();


        Scanner in = new Scanner(System.in);
        System.out.print("What number is missing in the progression?");
        for (i = 0; i < numberOfAnswer; i++){

            int randomLengthProg = 5 + random.nextInt(5);
            int[] progress = new int[randomLengthProg];
            int step = 1 + random.nextInt(9);
            progress[0] = random.nextInt(10);
            for (int j = 1; j < progress.length; j++) {
                progress[j] = progress[0] + step * j;
            }

            int replacedItemNumber = random.nextInt(randomLengthProg - 1);
            String replaceElementProgress = "";
            for (int k = 0; k < randomLengthProg; k++) {
                if (k == replacedItemNumber) {
                    replaceElementProgress += ".." + " ";
                } else {
                replaceElementProgress += progress[k] + " ";
                }
            }
            System.out.println(replaceElementProgress);
            answerProg = Integer.parseInt(in.nextLine());
            progNumber = progress[replacedItemNumber];

            if (progress[replacedItemNumber] == answerProg) {
                System.out.println("Correct!");
            }
            else {break;}
        }
        if (i == numberOfAnswer) {
            System.out.println("Congratulations, " + nameProg + "!");
        } else {
            System.out.println ("'" + answerProg + "'" + "is wrong answer ;(. " +
                   "Correct answer was " + "'" + progNumber + "'.\n  Let's try again, " + nameProg + "!");

        }

    }
}
