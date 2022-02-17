package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;



public class Calc {
    public static void game() {
        String[] sign = new String[]{"+", "-", "*"};

        String[] questions = new String[Engine.NUMBER_OF_QUESTIONS];
        String[] rightAnswers = new String[Engine.NUMBER_OF_QUESTIONS];


        Random random = new Random();

        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++)  {
            int randomNumber = random.nextInt(Utils.QUESTION_VALUE_BOUND);
            int randomSecondNumber = random.nextInt(Utils.QUESTION_VALUE_BOUND);
            String randomSign = sign[random.nextInt(sign.length)];

            questions[i] = randomNumber + " " + randomSign + " " + randomSecondNumber;
            switch (randomSign) {
                case ("+"):
                    rightAnswers[i] = Integer.toString(randomNumber + randomSecondNumber);
                    break;
                case ("-"):
                    rightAnswers[i] = Integer.toString(randomNumber - randomSecondNumber);
                    break;
                default:
                    rightAnswers[i] = Integer.toString(randomNumber * randomSecondNumber);
                    break;
            }
        }
        Engine.gameProcess("What is the result of the expression?",
                questions, rightAnswers, "number");
    }
}
