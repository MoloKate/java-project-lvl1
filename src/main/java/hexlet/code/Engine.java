package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void gameProcess(String description, String[] questions, int[] rightAnswers, String answerType) {
        String nameUser = Cli.getName();

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            int answerInt = 0;
            String answer = in.nextLine();
            switch (answerType) {
                case "yesno":
                    if (answer.equals("yes")) {
                        answerInt = 1;
                    } else {
                        answerInt = 0;
                    }
                    break;
                default:
                    answerInt = Integer.parseInt(answer);
                    break;
            }
            System.out.println("Your answer: " + answer);
            if (answerInt == rightAnswers[i]) {
                System.out.println("Correct!");
            } else {
                switch (answerType) {
                    case "yesno":
                        System.out.println("'" + answer + "'" + "is wrong answer ;(. "
                            + "Correct answer was "
                            + ((rightAnswers[i] == 1) ? "yes" : "no")
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
