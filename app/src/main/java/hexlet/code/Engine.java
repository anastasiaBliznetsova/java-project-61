package hexlet.code;

import hexlet.code.games.Prime;
import hexlet.code.games.Even;
import hexlet.code.games.Progression;
import hexlet.code.games.GCD;
import hexlet.code.games.Calc;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Engine {
    public static void gameEngine(String numberGame) {
        Map<String, String> output = new HashMap<>();
        int count = 0;
        int maxIteration = 3;

        if (Integer.parseInt(numberGame) > 0 && Integer.parseInt(numberGame) < 7) {
            Cli.greetUserName();
        }
        while (count < maxIteration) {
            switch (numberGame) {
                case "0", "1":
                    System.exit(0);
                case "2":
                    System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                    output = Even.parityNumber();
                    break;
                case "3":
                    System.out.println("What is the result of the expression?");
                    output = Calc.calculator();
                    break;
                case "4":
                    System.out.println("Find the greatest common divisor of given numbers.");
                    output = GCD.greatestCommonDivisor();
                    break;
                case "5":
                    System.out.println("What number is missing in the progression?");
                    output = Progression.arithmeticProgression();
                    break;
                case "6":
                    System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
                    output = Prime.primeNumber();
                    break;
                default:
                    System.out.println("You entered an invalid request");
                    System.exit(0);
            }
            System.out.println("Question: " + output.get("quest"));
            System.out.print("Your answer: ");
            Scanner myObjGame = new Scanner(System.in);
            String answer = myObjGame.nextLine();
            if (output.get("answer").equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.print("'" + answer + "' is wrong answer ;(. ");
                System.out.println("Correct answer was '" + output.get("answer") + "'.");
                System.out.println("Let's try again, " + Cli.getUserName() + "!");
                System.exit(0);
            }
            count++;
        }
        System.out.println("Congratulations, " + Cli.getUserName() + "!");
        System.exit(0);
    }
}
