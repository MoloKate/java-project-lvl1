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

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit");
        String gameNumber = in.nextLine();
        System.out.println("Your choice: " + gameNumber + " ");

        switch (gameNumber) {
            case "1":
                nameUser.getName();
                break;
            case "2":
                Even.game();
                break;
            case "3":
                Calc.game();
                break;
            case "4":
                Gcd.game();
                break;
            case "5":
                Progression.game();
                break;
            case "6":
                Prime.game();
                break;
        }
    }
}
