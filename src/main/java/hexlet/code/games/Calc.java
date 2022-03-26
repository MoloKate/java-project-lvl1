package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Calc {
    static final String[] SIGNS = new String[]{"+", "-", "*"};
    static final String DESCRIPTION = "What is the result of the expression?";

    public static String calculatingResult(String sign, int firstNumber, int secondNumber) {
        switch (sign) {
            case ("+"):
                return Integer.toString(firstNumber + secondNumber);
            case ("-"):
                return Integer.toString(firstNumber - secondNumber);
            case ("*"):
                return Integer.toString(firstNumber * secondNumber);
            default:
                return "Error: operation '" + sign + "' is not supported";
        }
    }
    public static void game() {

        String[] questions = new String[Engine.NUMBER_OF_QUESTIONS];
        String[] rightAnswers = new String[Engine.NUMBER_OF_QUESTIONS];


        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++)  {
            int randomNumber = Utils.getRandomInRange(Utils.QUESTION_VALUE_BOUND);
            int randomSecondNumber = Utils.getRandomInRange(Utils.QUESTION_VALUE_BOUND);
            String randomSign = SIGNS[Utils.getRandomInRange(SIGNS.length)];

            questions[i] = randomNumber + " " + randomSign + " " + randomSecondNumber;
            rightAnswers[i] = calculatingResult(randomSign, randomNumber, randomSecondNumber);
        }
        Engine.gameProcess(DESCRIPTION, questions, rightAnswers);
    }
}
