package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;



public class Calc {
    static final String[] SIGNS = new String[]{"+", "-", "*"};

    public static String calculatingResult(String sign, int firstNumber, int secondNumber) {
        switch (sign) {
            case ("+"):
                return Integer.toString(firstNumber + secondNumber);
            case ("-"):
                return Integer.toString(firstNumber - secondNumber);
            default:
                return Integer.toString(firstNumber * secondNumber);
        }
    }
    public static void game() {

        String[] questions = new String[Engine.NUMBER_OF_QUESTIONS];
        String[] rightAnswers = new String[Engine.NUMBER_OF_QUESTIONS];


        Random random = new Random();

        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++)  {
            int randomNumber = random.nextInt(Utils.QUESTION_VALUE_BOUND); //в классе Utils есть метод для получения
                                                                            // случайного числа в заданном промежутке.
                                                                            // А здесь необходимо число от 0 до
                                                                            // заданного числа, с чем справляется
                                                                            // существующий метод.не понимаю
                                                                            // зачем исправлять тут
            int randomSecondNumber = random.nextInt(Utils.QUESTION_VALUE_BOUND);
            String randomSign = SIGNS[random.nextInt(SIGNS.length)];

            questions[i] = randomNumber + " " + randomSign + " " + randomSecondNumber;
            rightAnswers[i] = calculatingResult(randomSign, randomNumber, randomSecondNumber);
        }
        Engine.gameProcess("What is the result of the expression?",
                questions, rightAnswers);
    }
}
