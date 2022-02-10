package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Random;

public class Gcd {
    public static void game() {
        final int numberOfQuestions = 3;


        String[] questions = new String[numberOfQuestions];
        int[] rightAnswers = new int[numberOfQuestions];

        final int valueBound = 100;

        Random random = new Random();

        for (int i = 0; i < numberOfQuestions; i++)  {
            int gcdNumber = 0;
            int randomNumberOne = random.nextInt(valueBound);
            int randomNumberTwo = random.nextInt(valueBound);

            questions[i] = "Question: " + Integer.toString(randomNumberOne) + " " + Integer.toString(randomNumberTwo);
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
            rightAnswers[i] = gcdNumber;
        }
        Engine.gameProcess("Find the greatest common divisor of given numbers.\n",
                questions, rightAnswers, "number");
    }
}
