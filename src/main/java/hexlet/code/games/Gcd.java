package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Random;

public class Gcd {
    public static void game() {
        String[] questions = new String[Engine.NUMBER_OF_QUESTIONS];
        String[] rightAnswers = new String[Engine.NUMBER_OF_QUESTIONS];


        Random random = new Random();

        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++)  {
            int randomNumberOne = random.nextInt(Utils.QUESTION_VALUE_BOUND);
            int randomNumberTwo = random.nextInt(Utils.QUESTION_VALUE_BOUND);

            questions[i] = Integer.toString(randomNumberOne) + " " + Integer.toString(randomNumberTwo);
            rightAnswers[i] = Integer.toString(Utils.findGcd(randomNumberOne, randomNumberTwo));
        }
        Engine.gameProcess("Find the greatest common divisor of given numbers.",
                questions, rightAnswers, "number");
    }
}
