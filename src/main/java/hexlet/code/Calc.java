package main.java.hexlet.code;

import java.util.Scanner;
import java.util.Random;
import main.java.hexlet.code.Cli;



public class Calc {
    public static void game() {
        Cli.welcomeName();

        int i;
        String sign = "+-*";
        int answerCalc = 0;
        int resultCalc = 0;
        Cli nameUser = new Cli();
        String nameCalc = nameUser.nameGlobal;

        Scanner in = new Scanner(System.in);
        System.out.print("What is the result of the expression?");
        for (i = 0; i < 3; i++){
            Random random = new Random();
            int randomNumber = -25 + random.nextInt((100 - 25 + 1));
            int randomSecondNumber = random.nextInt(100);
            String randomSign = Character.toString(sign.charAt(random.nextInt(sign.length())));

            System.out.println("Question: " + randomNumber + randomSign + randomSecondNumber);
            switch (randomSign) {
                case ("+"):
                    resultCalc = randomNumber + randomSecondNumber;
                    break;
                case("-"):
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
            }
            else {break;}
        }
        if (i == 3) {
            System.out.println("Congratulations, " + nameCalc + "!");
        }
        else {
            System.out.println ("'" + answerCalc + "'" + "is wrong answer ;(. " +
                    "Correct answer was " + "'" + resultCalc + "'.\n  Let's try again, " + nameCalc + "!");
        }
    }
}
