package main.java.hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Gcd {
    public static void game() {
        Cli.welcomeName();

        int i;
        int gcdNumber = 0;
        int answerGcd = 0;
        int numberOfAnswer = 3;

        Cli nameUser = new Cli();
        String nameGcd = nameUser.nameGlobal;



        Scanner in = new Scanner(System.in);
        System.out.print("Find the greatest common divisor of given numbers.");
        for (i = 0; i < numberOfAnswer; i++){
            Random random = new Random();
            int randomNumberOne = random.nextInt(100);
            int randomNumberTwo = random.nextInt(100);

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
            }
            else {break;}
        }
        if (i == numberOfAnswer) {
            System.out.println("Congratulations, " + nameGcd + "!");
        } else {
            System.out.println ("'" + answerGcd + "'" + "is wrong answer ;(. " +
                    "Correct answer was " + "'" + gcdNumber + "'.\n  Let's try again, " + nameGcd + "!");
        }
    }
}
