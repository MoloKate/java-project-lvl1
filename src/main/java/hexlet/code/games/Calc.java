package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;



public class Calc {
    public static void game() {
        final int numberOfQuestions = 3;
        String sign = "+-*";

        String[] questions = new String[numberOfQuestions];
        int[] rightAnswers = new int[numberOfQuestions];

        final int valueBound = 100;

        Random random = new Random();

        for (int i = 0; i < numberOfQuestions; i++)  {
            int randomNumber = random.nextInt(valueBound);
            int randomSecondNumber = random.nextInt(valueBound);
            String randomSign = Character.toString(sign.charAt(random.nextInt(sign.length())));

            questions[i] = "Question: " + randomNumber + " " + randomSign + " " + randomSecondNumber;
            switch (randomSign) {
                case ("+"):
                    rightAnswers[i] = randomNumber + randomSecondNumber;
                    break;
                case ("-"):
                    rightAnswers[i] = randomNumber - randomSecondNumber;
                    break;
                default:
                    rightAnswers[i] = randomNumber * randomSecondNumber;
                    break;
            }
        }
        Engine.gameProcess("What is the result of the expression?\n",
                questions, rightAnswers, "number");
    }
}
