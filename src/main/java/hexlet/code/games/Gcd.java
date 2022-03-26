package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;


public class Gcd {
    static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
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


        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++)  {
            int randomNumberOne = Utils.getRandomInRange(Utils.QUESTION_VALUE_BOUND);
            int randomNumberTwo = Utils.getRandomInRange(Utils.QUESTION_VALUE_BOUND);

            questions[i] = randomNumberOne + " " + randomNumberTwo;
            rightAnswers[i] = Integer.toString(findGcd(randomNumberOne, randomNumberTwo));
        }
        Engine.gameProcess(DESCRIPTION, questions, rightAnswers);
    }
}
