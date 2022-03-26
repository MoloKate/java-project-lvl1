package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Even {
    static final String DESCRIPTION = "Answer 'yes' if number even otherwise answer 'no'.";
    public static void game() {

        String[] questions = new String[Engine.NUMBER_OF_QUESTIONS];
        String[] rightAnswers = new String[Engine.NUMBER_OF_QUESTIONS];


        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++)  {
            int value = Utils.getRandomInRange(0, Engine.NUMBER_OF_QUESTIONS);
            questions[i] = Integer.toString(value);
            rightAnswers[i] = (value % 2 == 0) ? "yes" : "no";
        }
        Engine.gameProcess(DESCRIPTION, questions, rightAnswers);
    }

}
