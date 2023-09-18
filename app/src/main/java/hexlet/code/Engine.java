package hexlet.code;
import java.util.Scanner;

public class Engine {
    private static final int MAX_ROUNDS = 3;
    public static int getMaxRounds() {
        return MAX_ROUNDS;
    }

    public static void playRounds(String rules, String[][] rounds) {
        System.out.println(rules);
        for (String[] round : rounds) {
            String correctAnswer = round[1];
            String question = round[0];
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            Scanner enteringAnswer = new Scanner(System.in);
            String userAnswer = enteringAnswer.nextLine();
            if (!correctAnswer.equals(userAnswer)) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. "
                        + "Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + Cli.getUserName() + "!");
                enteringAnswer.close();
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + Cli.getUserName() + "!");
        System.exit(0);
    }
}
