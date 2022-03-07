package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class Gcd {
    public static int findGcd(int randomNumberOne, int randomNumberTwo) {
        int gcdNumber = 0;
        if (randomNumberOne == 0) {
            gcdNumber = randomNumberTwo;
        }
        while (randomNumberTwo != 0) {
            if (randomNumberOne > randomNumberTwo) {
                randomNumberOne = randomNumberOne - randomNumberTwo;
            } else {
                randomNumberTwo = randomNumberTwo - randomNumberOne;
            }
            gcdNumber = randomNumberOne;
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

            questions[i] = Integer.toString(randomNumberOne) + " " + Integer.toString(randomNumberTwo);
            rightAnswers[i] = Integer.toString(findGcd(randomNumberOne, randomNumberTwo));
        }
        Engine.gameProcess("Find the greatest common divisor of given numbers.",
                questions, rightAnswers, "number");
    }
}
