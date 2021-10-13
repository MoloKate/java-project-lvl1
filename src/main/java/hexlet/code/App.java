package hexlet.code;

import java.util.Scanner;
import main.java.hexlet.code.Even;
import main.java.hexlet.code.Cli;
import main.java.hexlet.code.Calc;
import main.java.hexlet.code.Gcd;
import main.java.hexlet.code.Progression;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "0 - Exit");
        int gameNumber = Integer.parseInt(in.nextLine());
        System.out.println("Your choice: " + gameNumber + " ");

        if (gameNumber == 1) {
            Cli.welcomeName();
        }
        else if (gameNumber == 2) {
            Even.game();
        }
        else if (gameNumber == 3) {
            Calc.game();
        }
        else if (gameNumber == 4) {
            Gcd.game();
        }
        else if (gameNumber == 5) {
            Progression.game();
        }
    }
}
