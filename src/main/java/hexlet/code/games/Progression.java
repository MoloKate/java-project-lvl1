package hexlet.code.games;

import java.util.Random;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    static final int MAX_LENGTH = 5;
    static final int MIN_LENGTH = 5;
    static final int MIN_STEP = 1;
    static final int BOUND_STEP = 9;
    static final int BOUND_FOR_PROGRESS_ZERO = 9;

    public static void game() {
        String[] questions = new String[Engine.NUMBER_OF_QUESTIONS];
        String[] rightAnswers = new String[Engine.NUMBER_OF_QUESTIONS];

        Random random = new Random();

        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++)  {

            int randomLengthProg = Utils.rangeRandom(MIN_LENGTH, MIN_LENGTH + MAX_LENGTH, random);
            int[] progress = new int[randomLengthProg];
            int step = Utils.rangeRandom(MIN_STEP, MIN_STEP + BOUND_STEP, random);
            progress[0] = random.nextInt(BOUND_FOR_PROGRESS_ZERO);
            for (int j = 1; j < progress.length; j++) {
                progress[j] = progress[0] + step * j;
            }

            int replacedItemNumber = random.nextInt(randomLengthProg - 1);
            String replaceElementProgress = "";
            for (int k = 0; k < randomLengthProg; k++) {
                if (k == replacedItemNumber) {
                    replaceElementProgress += ".." + " ";
                } else {
                    replaceElementProgress += progress[k] + " ";
                }
            }
            questions[i] =  replaceElementProgress;
            rightAnswers[i] = Integer.toString(progress[replacedItemNumber]);
        }
        Engine.gameProcess("What number is missing in the progression?",
                questions, rightAnswers, "number");
    }
}
