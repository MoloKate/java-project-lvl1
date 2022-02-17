package hexlet.code.games;

public class Utils {
    public static final int QUESTION_VALUE_BOUND = 100;
    public static final int QQ_Q = 100;

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
}
