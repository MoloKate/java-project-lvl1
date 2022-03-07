package hexlet.code;

import java.util.Random;

public class Utils {
    public static final int QUESTION_VALUE_BOUND = 100;
    public static final int QQ_Q = 100;

    public static int rangeRandom(int start, int end, Random random) {
        int range = end - start;
        return start + random.nextInt(range);
    }
}
