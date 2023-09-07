package hexlet.code;
import java.util.Scanner;

public class Engine {
    public static void gameEngine(String[][] output) {
        int count = 0;
        while (count < output.length) {
            System.out.println("Question: " + output[count][0]);
            System.out.print("Your answer: ");
            Scanner myObjGame = new Scanner(System.in);
            String answer = myObjGame.nextLine();
            if (output[count][1].equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.print("'" + answer + "' is wrong answer ;(. ");
                System.out.println("Correct answer was '" + output[count][1] + "'.");
                System.out.println("Let's try again, " + Cli.getUserName() + "!");
                System.exit(0);
            }
            count++;
        }
        System.out.println("Congratulations, " + Cli.getUserName() + "!");
        System.exit(0);
    }
}
