package hexlet.code.games;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class Prime {
    public static void game() {

        int i;
        boolean probablePrime = false;
        int progNumber = 0;
        String answerPrime = "";
        final int numberOfAnswer = 3;
        final int bound = 100;


        String nameUser = Cli.getName();
        Random random = new Random();


        Scanner in = new Scanner(System.in);
        System.out.print("Answer 'yes' if given number is prime. Otherwise answer 'no'.\n");
        for (i = 0; i < numberOfAnswer; i++) {
            probablePrime = false;
            int randomNumber = random.nextInt(bound);

            BigInteger bigInteger = BigInteger.valueOf(randomNumber);
            probablePrime = bigInteger.isProbablePrime((int) Math.log(randomNumber));

            System.out.println("Question: " + randomNumber);
            answerPrime = in.nextLine();
            System.out.println("Your answer: " + answerPrime);
            if ((probablePrime && answerPrime.equals("yes")) || (!probablePrime && answerPrime.equals("no"))
                    || randomNumber == 0) {
                Engine.printTextIfUserCorrect();
            } else {
                break;
            }
        }
        if (i == numberOfAnswer) {
            Engine.printCongratulationsToUser(nameUser);
        } else {
            Engine.printFalseAnswerPrime(probablePrime, answerPrime, nameUser);
        }
    }
}
