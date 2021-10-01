package cli;
import java.util.Scanner;

public class Cli {
    public static void welcomeName () {
        Scanner in = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!");
        System.out.println("May I have your name?" + " ");
        String name = in.nextLine();
        System.out.println("Hello, " + name);
    }
}
