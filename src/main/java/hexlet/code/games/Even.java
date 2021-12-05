package main.java.hexlet.code;

import java.util.Scanner;


import java.util.Random;

public class Even {
    public static void game() {

        int i;
        String answerEven = "";
        boolean evenOrNot = false;
        final int numberOfAnswer = 3;
        final int bound = 100;

        String nameEven = Cli.getName();


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
                System.out.println("Correct!");
            } else {
                break;
            }
        }
        if (i == numberOfAnswer) {
            System.out.println("Congratulations, " + nameEven + "!");
        } else if (evenOrNot) {
            System.out.println("'" + answerEven + "'" + "is wrong answer ;(. "
                    + "Correct answer was 'yes'.\n  Let's try again, " + nameEven + "!");
        } else {
            System.out.println("'" + answerEven + "'" + "is wrong answer ;(. "
                    + "Correct answer was 'no'.\n  Let's try again, " + nameEven + "!");
        }
    }
}
