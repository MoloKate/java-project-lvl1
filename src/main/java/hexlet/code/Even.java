package main.java.hexlet.code;
import java.util.Scanner;
import main.java.hexlet.code.Cli;
import java.util.Random;

public class Even {
    public static void game() {
        Cli.welcomeName();

        int i;
        String answerEven = "";
        boolean evenOrNot;
        Cli nameUser = new Cli();
        String nameEven = nameUser.nameGlobal;



        Scanner in = new Scanner(System.in);
        System.out.print("Answer 'yes' if number even otherwise answer 'no'.");
        for (i = 0; i < 3; i++){
            evenOrNot = false;
            Random random = new Random();
            int randomNumber = random.nextInt(1000);
            if (randomNumber % 2 == 0) {
                evenOrNot = true;
            }
            System.out.println("Question: " + randomNumber);
            answerEven = in.nextLine();
            System.out.println("Your answer: " + answerEven);
            if ((evenOrNot && answerEven.equals("yes")) || (!evenOrNot && answerEven.equals("no"))) {
                System.out.println("Correct!");
            }
            else {break;}
        }
        if (i == 3) {
            System.out.println("Congratulations, " + nameEven + "!");
        }
        else if (evenOrNot = true) {
            System.out.println ("'" + answerEven + "'" + "is wrong answer ;(. " +
                    "Correct answer was 'yes'.\n  Let's try again, " + nameEven + "!");
        }
        else {
            System.out.println ("'" + answerEven + "'" + "is wrong answer ;(. " +
                    "Correct answer was 'no'.\n  Let's try again, " + nameEven + "!");
        }
    }
}