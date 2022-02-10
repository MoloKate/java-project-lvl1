package hexlet.code.games;

import java.math.BigInteger;
import java.util.Random;
import hexlet.code.Engine;

public class Prime {
    public static void game() {
        final int numberOfQuestions = 3;
        String[] questions = new String[numberOfQuestions];
        int[] rightAnswers = new int[numberOfQuestions];

        final int valueBound = 100;

        Random random = new Random();

        for (int i = 0; i < numberOfQuestions; i++) {
            int value = random.nextInt(valueBound);

            BigInteger bigInteger = BigInteger.valueOf(value);
            questions[i] = "Question: " + value;
            rightAnswers[i] = (bigInteger.isProbablePrime((int) Math.log(value))) ? 1 : 0;
        }
        Engine.gameProcess("Answer 'yes' if given number is prime. Otherwise answer 'no'.\n",
                questions, rightAnswers, "yesno");
    }
}
