package hexlet.code;

public class Engine {

    public static void printTextIfUserCorrect() {
        System.out.println("Correct!");
    }

    public static void printCongratulationsToUser(String nameUser) {
        System.out.println("Congratulations, " + nameUser + "!");
    }

    public static void printFalseAnswerEven(boolean evenOrNot, String answerEven, String nameUser) {
        if (evenOrNot) {
            System.out.println("'" + answerEven + "'" + "is wrong answer ;(. "
                    + "Correct answer was 'yes'.\n  Let's try again, " + nameUser + "!");
        } else {
            System.out.println("'" + answerEven + "'" + "is wrong answer ;(. "
                    + "Correct answer was 'no'.\n  Let's try again, " + nameUser + "!");
        }
    }

    public static void printFalseAnswerCalc(int answerCalc, int resultCalc,String nameUser) {
        System.out.println("'" + answerCalc + "'" + "is wrong answer ;(. "
                + "Correct answer was " + "'" + resultCalc + "'.\n  Let's try again, " + nameUser + "!");
    }

    public static void printFalseAnswerGcd(int answerGcd, int gcdNumber, String nameUser) {
        System.out.println("'" + answerGcd + "'" + "is wrong answer ;(. "
                + "Correct answer was " + "'" + gcdNumber + "'.\n  Let's try again, " + nameUser + "!");
    }

    public static void printFalseAnswerPrime(boolean probablePrime, String answerPrime, String nameUser) {
        if (probablePrime) {
            System.out.println("'" + answerPrime + "'" + "is wrong answer ;(. "
                    + "Correct answer was 'yes'.\n  Let's try again, " + nameUser + "!");
        } else {
            System.out.println("'" + answerPrime + "'" + "is wrong answer ;(. "
                    + "Correct answer was 'no'.\n  Let's try again, " + nameUser + "!");
        }
    }

    public static void printFalseAnswerProgression(int answerProg, int progNumber, String nameUser) {
        System.out.println("'" + answerProg + "'" + "is wrong answer ;(. "
                + "Correct answer was " + "'" + progNumber + "'.\n  Let's try again, " + nameUser + "!");
    }

}
