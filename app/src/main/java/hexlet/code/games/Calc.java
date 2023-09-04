package hexlet.code.games;
import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Calc {
    public static Map<String, String> calculator() {
        Map <String, String> output = new HashMap<>();
        int result = 0;
        int maxValue = 20;
        int maxValueForOperand = 4;
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
        output.put("quest", Integer.toString(randomNumberOne) + operand + Integer.toString(randomNumberTwo));
        output.put("answer", Integer.toString(result));
        return output;
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
