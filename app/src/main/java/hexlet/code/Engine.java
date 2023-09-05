package hexlet.code;

import hexlet.code.games.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Engine {
    public static void gameEngine(String numberGame) {
        Map<String, String> output = new HashMap<>();
        int count = 0;
        if (numberGame.equals("0")) {
            System.exit(0);
        } else if (Integer.parseInt(numberGame) > 6) {
            System.out.println("You entered an invalid request");
            System.exit(0);
        }
        Cli.greetUserName();
        while (count < 3) {
            switch (numberGame) {
                case "1":
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
                    output = Prime.PrimeNumber();
                    break;
                default:
                    break;
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
