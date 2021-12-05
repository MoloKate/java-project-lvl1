package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String getName() {
        Scanner in = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!");
        System.out.println("May I have your name?" + " ");
        String name = in.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }
}
