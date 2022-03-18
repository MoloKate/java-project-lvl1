package hexlet.code;

import java.util.Random;

public class Utils {
    public static final int QUESTION_VALUE_BOUND = 100;
    static final  Random RANDOM = new Random();

    public static int getRandomInRange(int start, int end) {
        int range = end - start;
        return start + RANDOM.nextInt(range);

    }
}
