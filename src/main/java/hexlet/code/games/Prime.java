package hexlet.code.games;

import java.math.BigInteger;
import java.util.Random;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static void game() {
        String[] questions = new String[Engine.NUMBER_OF_QUESTIONS];
        String[] rightAnswers = new String[Engine.NUMBER_OF_QUESTIONS];


        Random random = new Random();

        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++) {
            int value = random.nextInt(Utils.QUESTION_VALUE_BOUND);

            BigInteger bigInteger = BigInteger.valueOf(value);
            questions[i] = Integer.toString(value);
            rightAnswers[i] = (bigInteger.isProbablePrime((int) Math.log(value)) && value > 1) ? "yes" : "no";
        }
        Engine.gameProcess("Answer 'yes' if given number is prime. Otherwise answer 'no'.",
                questions, rightAnswers, "yesno");
    }
}
