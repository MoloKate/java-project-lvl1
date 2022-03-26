package hexlet.code.games;

import java.math.BigInteger;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static boolean isPrime(int value) {
        BigInteger bigInteger = BigInteger.valueOf(value);
        return bigInteger.isProbablePrime((int) Math.log(value)) && value > 1;
    }
    public static void game() {
        String[] questions = new String[Engine.NUMBER_OF_QUESTIONS];
        String[] rightAnswers = new String[Engine.NUMBER_OF_QUESTIONS];


        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++) {
            int value = Utils.getRandomInRange(Utils.QUESTION_VALUE_BOUND);

            questions[i] = Integer.toString(value);
            rightAnswers[i] = isPrime(value) ? "yes" : "no";
        }
        Engine.gameProcess(DESCRIPTION, questions, rightAnswers);
    }
}
