package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int NUMBER_OF_QUESTIONS = 3;


    public static void gameProcess(String description, String[] questions, String[] rightAnswers) {
        Scanner in = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!");
        System.out.println("May I have your name?" + " ");
        String userName = in.nextLine();
        System.out.println("Hello, " + userName + "!");

        System.out.println(description);

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question: " + questions[i]);
            String answer = in.nextLine();

            System.out.println("Your answer: " + answer);
            if (answer.equals(rightAnswers[i])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'" + "is wrong answer ;(. "
                        + "Correct answer was "
                        + rightAnswers[i]
                        + ".\n  Let's try again, " + userName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + userName + "!");
    }
}
