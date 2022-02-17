package hexlet.code.games;

import java.util.Random;

import hexlet.code.Engine;

public class Progression {
    public static void game() {
        String[] questions = new String[Engine.NUMBER_OF_QUESTIONS];
        String[] rightAnswers = new String[Engine.NUMBER_OF_QUESTIONS];

        Random random = new Random();

        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++)  {
            final int bound = 5;
            final int gapForRandom = 5;
            final int gapForRandomStep = 1;
            final int boundStep = 9;
            final int boundForProgressZero = 9;

            int randomLengthProg = gapForRandom + random.nextInt(bound);
            int[] progress = new int[randomLengthProg];
            int step = gapForRandomStep + random.nextInt(boundStep);
            progress[0] = random.nextInt(boundForProgressZero);
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
