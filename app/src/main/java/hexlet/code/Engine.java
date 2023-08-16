package hexlet.code;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.Integer.toString;

public class Engine {
    public static void gameEngine(String quest, String result, int count) {
        System.out.println("Question: " + quest);
        System.out.println("Your answer: ");
        Scanner myObjGame = new Scanner(System.in);
        String answer = myObjGame.nextLine();
        if (result.equals(answer)) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result + "'.");
            System.out.println("Let's try again, " + Cli.getUserName() + "!");
            System.exit(0);
        }
        if (count == 2) {
            System.out.println("Congratulations, " + Cli.getUserName() + "!");
            System.exit(0);
        }
    }
}
