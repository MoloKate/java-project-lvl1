package hexlet.code;
import java.util.Scanner;

import main.java.hexlet.code.Even;
import main.java.hexlet.code.Cli;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "0 - Exit");
        int gameNumber = Integer.parseInt(in.nextLine());
        System.out.println("Your choice: " + gameNumber + " ");

        if (gameNumber == 1) {
            Cli.welcomeName();
        }
        else if (gameNumber == 2) {
            Even.game();
        }
    }
}
