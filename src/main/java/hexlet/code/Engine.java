package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int NUMBER_OF_QUESTIONS = 3;

    public static void gameProcess(String description, String[] questions, String[] rightAnswers, String answerType) {
        String nameUser = Cli.getName();

        Scanner in = new Scanner(System.in);

        System.out.println(description);

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question: " + questions[i]);
            int answerInt = 0;
            String answer = in.nextLine();

            System.out.println("Your answer: " + answer);
            if (answer.equals(rightAnswers[i])) {
                System.out.println("Correct!");
            } else {
                switch (answerType) {
                    case "yesno":
                        System.out.println("'" + answer + "'" + "is wrong answer ;(. "
                            + "Correct answer was "
                            + rightAnswers[i]
                            + ".\n  Let's try again, " + nameUser + "!");
                        break;
                    default:
                        System.out.println("'" + answer + "'" + "is wrong answer ;(. "
                                + "Correct answer was " + "'"
                                + rightAnswers[i] + "'.\n  Let's try again, " + nameUser + "!");
                        break;
                }

                return;
            }
        }

        System.out.println("Congratulations, " + nameUser + "!");
    }
}
