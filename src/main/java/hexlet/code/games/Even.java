package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;
import java.util.Random;

public class Even {
    public static void game() {

        int i;
        String answerEven = "";
        boolean evenOrNot = false;
        final int numberOfAnswer = 3;
        final int bound = 100;

        String nameUser = Cli.getName();


        Scanner in = new Scanner(System.in);
        System.out.print("Answer 'yes' if number even otherwise answer 'no'.\n");
        for (i = 0; i < numberOfAnswer; i++) {
            evenOrNot = false;
            Random random = new Random();
            int randomNumber = random.nextInt(bound);
            if (randomNumber % 2 == 0) {
                evenOrNot = true;
            }
            System.out.println("Question: " + randomNumber);
            answerEven = in.nextLine();
            System.out.println("Your answer: " + answerEven);
            if ((evenOrNot && answerEven.equals("yes")) || (!evenOrNot && answerEven.equals("no"))) {
                Engine.printTextIfUserCorrect();
            } else {
                break;
            }
        }
        if (i == numberOfAnswer) {
            Engine.printCongratulationsToUser(nameUser);
        } else {
            Engine.printFalseAnswerEvenOrPrime(evenOrNot, answerEven, nameUser);
        }
    }
}
