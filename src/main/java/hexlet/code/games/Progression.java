package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    static final String DESCRIPTION = "What number is missing in the progression?";

    static final int MAX_LENGTH = 5;
    static final int MIN_LENGTH = 5;
    static final int MIN_STEP = 1;
    static final int BOUND_STEP = 9;
    static final int BOUND_FOR_PROGRESS_ZERO = 9;

    public static void game() {
        String[] questions = new String[Engine.NUMBER_OF_QUESTIONS];
        String[] rightAnswers = new String[Engine.NUMBER_OF_QUESTIONS];


        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++)  {

            int randomLengthProg = Utils.getRandomInRange(MIN_LENGTH, MIN_LENGTH + MAX_LENGTH);
            int[] progress = new int[randomLengthProg];
            int step = Utils.getRandomInRange(MIN_STEP, MIN_STEP + BOUND_STEP);
            progress[0] = Utils.getRandomInRange(BOUND_FOR_PROGRESS_ZERO);
            for (int j = 1; j < progress.length; j++) {
                progress[j] = progress[0] + step * j;
            }

            int replacedItemNumber = Utils.getRandomInRange(randomLengthProg - 1);
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
        Engine.gameProcess(DESCRIPTION, questions, rightAnswers);
    }
}
