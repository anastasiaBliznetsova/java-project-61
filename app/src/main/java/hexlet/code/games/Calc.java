package hexlet.code.games;
import hexlet.code.Engine;

public class Calc {
    private static final int MAX_VALUE = 20;
    private static final int MAX_VALUE_FOR_OPERAND = 4;
    private static final int MAX_ITERATION = 3;
    public static void calculator() {
        System.out.println("What is the result of the expression?");
        String[][] output = new String[MAX_ITERATION][2];

        int count = 0;
        while (count < MAX_ITERATION) {
            int randomNumberOne = (int) (Math.random() * MAX_VALUE);
            int randomNumberTwo = (int) (Math.random() * MAX_VALUE);
            String operand = randomOperand();
            output[count][0] = randomNumberOne + " " + operand + " " + randomNumberTwo;
            output[count][1] = resultCalcGame(operand, randomNumberOne, randomNumberTwo);
            count++;
        }
        Engine.gameEngine(output);
    }

    public static String resultCalcGame(String operand, int numberOne, int numberTwo) {
        switch (operand) {
            case "-":
                return Integer.toString(numberOne - numberTwo);
            case "+":
                return Integer.toString(numberOne + numberTwo);
            case "*":
                return Integer.toString(numberOne * numberTwo);
            default:
                return "";
        }
    }
    public static String randomOperand() {
        char[] operators = {'+', '-', '*'};
        int valueForOperand = (int) (Math.random() * (MAX_VALUE_FOR_OPERAND - 1));
        return Character.toString(operators[valueForOperand]);
    }
}
