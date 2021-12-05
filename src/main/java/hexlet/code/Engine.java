package hexlet.code;

public class Engine {

    public static void printTextIfUserCorrect() {
        System.out.println("Correct!");
    }

    public static void printCongratulationsToUser(String nameUser) {
        System.out.println("Congratulations, " + nameUser + "!");
    }

    public static void printFalseAnswer(int answer, int result, String nameUser) {
        System.out.println("'" + answer + "'" + "is wrong answer ;(. "
                + "Correct answer was " + "'" + result + "'.\n  Let's try again, " + nameUser + "!");
    }

    public static void printFalseAnswerEvenOrPrime(boolean flag, String answer, String nameUser) {
        if (flag) {
            System.out.println("'" + answer + "'" + "is wrong answer ;(. "
                    + "Correct answer was 'yes'.\n  Let's try again, " + nameUser + "!");
        } else {
            System.out.println("'" + answer + "'" + "is wrong answer ;(. "
                    + "Correct answer was 'no'.\n  Let's try again, " + nameUser + "!");
        }
    }
}
