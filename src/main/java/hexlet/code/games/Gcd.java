package main.java.hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Gcd {
    public static void game() {

        int i;
        int gcdNumber = 0;
        int answerGcd = 0;
        final int numberOfAnswer = 3;
        final int bound = 100;

        String nameGcd = Cli.getName();



        Scanner in = new Scanner(System.in);
        System.out.print("Find the greatest common divisor of given numbers.\n");
        for (i = 0; i < numberOfAnswer; i++) {
            Random random = new Random();
            int randomNumberOne = random.nextInt(bound);
            int randomNumberTwo = random.nextInt(bound);

            System.out.println("Question: " + randomNumberOne + " " + randomNumberTwo);
            answerGcd = Integer.parseInt(in.nextLine());
            System.out.println("Your answer: " + answerGcd);
            if (randomNumberOne == 0) {
                gcdNumber = randomNumberTwo;
            }
            while (randomNumberTwo != 0) {
                if (randomNumberOne > randomNumberTwo) {
                    randomNumberOne = randomNumberOne - randomNumberTwo;
                } else {
                    randomNumberTwo = randomNumberTwo - randomNumberOne;
                }
                gcdNumber = randomNumberOne;
            }
            if (answerGcd == gcdNumber) {
                System.out.println("Correct!");
            } else {
                break;
            }
        }
        if (i == numberOfAnswer) {
            System.out.println("Congratulations, " + nameGcd + "!");
        } else {
            System.out.println("'" + answerGcd + "'" + "is wrong answer ;(. "
                    + "Correct answer was " + "'" + gcdNumber + "'.\n  Let's try again, " + nameGcd + "!");
        }
    }
}
