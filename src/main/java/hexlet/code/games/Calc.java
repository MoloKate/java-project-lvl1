package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

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

        String nameUser = Cli.getName();

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
                Engine.printTextIfUserCorrect();
            } else {
                break;
            }
        }
        if (i == numberOfAnswer) {
            Engine.printCongratulationsToUser(nameUser);
        } else {
            Engine.printFalseAnswerCalc(answerCalc, resultCalc, nameUser);
        }
    }
}
