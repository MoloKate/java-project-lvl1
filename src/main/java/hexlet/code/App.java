package hexlet.code;

import java.util.Scanner;

import main.java.hexlet.code.Even;
import main.java.hexlet.code.Cli;
import main.java.hexlet.code.Calc;
import main.java.hexlet.code.Gcd;
import main.java.hexlet.code.Progression;
import main.java.hexlet.code.Prime;

public class App {
    public static void main(String[] args) {
        final int gameOne = 1;
        final int gameTwo = 2;
        final int gameThree = 3;
        final int gameFour = 4;
        final int gameFive = 5;
        final int gameSix = 6;

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit");
        int gameNumber = Integer.parseInt(in.nextLine());
        System.out.println("Your choice: " + gameNumber + " ");

        if (gameNumber == gameOne) {
            Cli nameUser = new Cli();
            nameUser.getName();
        } else if (gameNumber == gameTwo) {
            Even.game();
        } else if (gameNumber == gameThree) {
            Calc.game();
        } else if (gameNumber == gameFour) {
            Gcd.game();
        } else if (gameNumber == gameFive) {
            Progression.game();
        } else if (gameNumber == gameSix) {
            Prime.game();
        }
    }
}
