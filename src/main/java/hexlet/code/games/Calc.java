package main.java.hexlet.code;

import java.util.Scanner;
import java.util.Random;



public class Calc {
    public static void game() {

        int i;
        String sign = "+-*";
        int answerCalc = 0;
        int resultCalc = 0;
        final int numberOfAnswer = 3;
        final int boundForSecondNumber = 100;
        final int boundForFirstNumber = 76;
        final int gapForFirstNumber = -25;

        String nameCalc = Cli.getName();

        Scanner in = new Scanner(System.in);
        System.out.print("What is the result of the expression?\n");
        for (i = 0; i < numberOfAnswer; i++) {
            Random random = new Random();
            int randomNumber = gapForFirstNumber + random.nextInt(boundForFirstNumber);
            int randomSecondNumber = random.nextInt(boundForSecondNumber);
            String randomSign = Character.toString(sign.charAt(random.nextInt(sign.length())));

            System.out.println("Question: " + randomNumber + " " + randomSign + " " + randomSecondNumber);
            switch (randomSign) {
                case ("+"):
                    resultCalc = randomNumber + randomSecondNumber;
                    break;
                case ("-"):
                    resultCalc = randomNumber - randomSecondNumber;
                    break;
                default:
                    resultCalc = randomNumber * randomSecondNumber;
                    break;
            }

            answerCalc = Integer.parseInt(in.nextLine());
            System.out.println("Your answer: " + answerCalc);
            if (answerCalc == resultCalc) {
                System.out.println("Correct!");
            } else {
                break;
            }
        }
        if (i == numberOfAnswer) {
            System.out.println("Congratulations, " + nameCalc + "!");
        } else {
            System.out.println("'" + answerCalc + "'" + "is wrong answer ;(. "
                    + "Correct answer was " + "'" + resultCalc + "'.\n  Let's try again, " + nameCalc + "!");
        }
    }
}
