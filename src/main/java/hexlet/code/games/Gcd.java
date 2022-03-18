package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class Gcd {
    public static int findGcd(int numberOne, int numberTwo) {


        if (numberOne == 0) {
            return numberTwo;
        } else if (numberTwo == 0) {
            return numberOne;
        }
        int gcdNumber = 0;
        while (numberTwo != 0) {
            if (numberOne > numberTwo) {
                numberOne = numberOne - numberTwo;
            } else {
                numberTwo = numberTwo - numberOne;
            }
            gcdNumber = numberOne;
        }

        return gcdNumber;
    }

    public static void game() {
        String[] questions = new String[Engine.NUMBER_OF_QUESTIONS];
        String[] rightAnswers = new String[Engine.NUMBER_OF_QUESTIONS];


        Random random = new Random();

        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++)  {
            int randomNumberOne = random.nextInt(Utils.QUESTION_VALUE_BOUND);
            int randomNumberTwo = random.nextInt(Utils.QUESTION_VALUE_BOUND);

            questions[i] = randomNumberOne + " " + randomNumberTwo;
            rightAnswers[i] = Integer.toString(findGcd(randomNumberOne, randomNumberTwo));
        }
        Engine.gameProcess("Find the greatest common divisor of given numbers.",
                questions, rightAnswers);
    }
}
