package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {
    public static void game() {
        final int numberOfQuestions = 3;
        String[] questions = new String[numberOfQuestions];
        int[] rightAnswers = new int[numberOfQuestions];

        final int valueBound = 100;

        Random random = new Random();

        for (int i = 0; i < numberOfQuestions; i++)  {
            int value = random.nextInt(valueBound);
            questions[i] = "Question: " + value;
            rightAnswers[i] = (value % 2 == 0) ? 1 : 0;
        }
        Engine.gameProcess("Answer 'yes' if number even otherwise answer 'no'.\n",
                questions, rightAnswers, "yesno");
    }

}
