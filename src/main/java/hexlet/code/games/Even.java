package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class Even {
    public static void game() {

        String[] questions = new String[Engine.NUMBER_OF_QUESTIONS];
        String[] rightAnswers = new String[Engine.NUMBER_OF_QUESTIONS];


        Random random = new Random();

        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++)  {
            int value = Utils.rangeRandom(0, Engine.NUMBER_OF_QUESTIONS, random);
            questions[i] = Integer.toString(value);
            rightAnswers[i] = (value % 2 == 0) ? "yes" : "no";
        }
        Engine.gameProcess("Answer 'yes' if number even otherwise answer 'no'.",
                questions, rightAnswers, "yesno");
    }

}
