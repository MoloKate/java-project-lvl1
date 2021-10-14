package main.java.hexlet.code;

import java.util.Random;
import java.util.Scanner;


public class Progression {
    public static void game() {


        int i;
        int progNumber = 0;
        int answerProg = 0;
        final int numberOfAnswer = 3;
        final int bound = 5;
        final int gapForRandom = 5;
        final int gapForRandomStep = 1;
        final int boundStep = 9;
        final int boundForProgressZero = 9;


        Cli nameUser = new Cli();
        String nameProg = nameUser.getName();
        Random random = new Random();


        Scanner in = new Scanner(System.in);
        System.out.print("What number is missing in the progression?\n");
        for (i = 0; i < numberOfAnswer; i++) {

            int randomLengthProg = gapForRandom + random.nextInt(bound);
            int[] progress = new int[randomLengthProg];
            int step = gapForRandomStep + random.nextInt(boundStep);
            progress[0] = random.nextInt(boundForProgressZero);
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
            System.out.println("Question: " + replaceElementProgress);
            answerProg = Integer.parseInt(in.nextLine());
            progNumber = progress[replacedItemNumber];

            if (progress[replacedItemNumber] == answerProg) {
                System.out.println("Correct!");
            } else {
                break;
            }
        }
        if (i == numberOfAnswer) {
            System.out.println("Congratulations, " + nameProg + "!");
        } else {
            System.out.println("'" + answerProg + "'" + "is wrong answer ;(. "
                    + "Correct answer was " + "'" + progNumber + "'.\n  Let's try again, " + nameProg + "!");

        }

    }
}
