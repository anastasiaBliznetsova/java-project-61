package hexlet.code.games;
import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Calc {
    public static void calculator() {
        Cli.greetUserName();
        System.out.println("What is the result of the expression?");
        int count = 0;
        int result = 0;
        int maxValue = 20;
        int maxValueForOperand = 4;
            while (count < 3) {
                int randomNumberOne = (int) (Math.random() * ++maxValue);
                int randomNumberTwo = (int) (Math.random() * ++maxValue);
                int valueForOperand = (int) (Math.random() * (maxValueForOperand - 1) + 1);
                String operand = randomOperand(valueForOperand);
                switch (operand) {
                    case "-":
                        result = randomNumberOne - randomNumberTwo;
                        break;
                    case "+":
                        result = randomNumberOne + randomNumberTwo;
                        break;
                    case "*":
                        result = randomNumberOne * randomNumberTwo;
                        break;
                }
                Engine.gameEngine(randomNumberOne + operand + randomNumberTwo, Integer.toString(result), count);
                count++;
            }
        }
    public static String randomOperand (int number) {
        switch (number) {
            case 1:
                return "+";
            case 2:
                return "-";
            case 3:
                return "*";
        }
        return "";
    }
}
