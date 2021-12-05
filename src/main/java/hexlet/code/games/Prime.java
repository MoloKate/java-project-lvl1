package main.java.hexlet.code;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;


public class Prime {
    public static void game() {

        int i;
        boolean probablePrime = false;
        int progNumber = 0;
        String answerPrime = "";
        final int numberOfAnswer = 3;
        final int bound = 100;


        Cli nameUser = new Cli();
        String namePrime = nameUser.getName();
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
            if ((probablePrime && answerPrime.equals("yes")) || (!probablePrime && answerPrime.equals("no"))) {
                System.out.println("Correct!");
            } else {
                break;
            }
        }
        if (i == numberOfAnswer) {
            System.out.println("Congratulations, " + namePrime + "!");
        } else if (probablePrime) {
            System.out.println("'" + answerPrime + "'" + "is wrong answer ;(. "
                    + "Correct answer was 'yes'.\n  Let's try again, " + namePrime + "!");
        } else {
            System.out.println("'" + answerPrime + "'" + "is wrong answer ;(. "
                    + "Correct answer was 'no'.\n  Let's try again, " + namePrime + "!");
        }
    }
}
