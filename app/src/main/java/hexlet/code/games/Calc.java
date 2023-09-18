package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final int MAX_COLS = 2;
    public static void calculateExpression() {
        String rules = "What is the result of the expression?";
        String[][] rounds = new String[Engine.getMaxRounds()][MAX_COLS];
        for (int i = 0; i < Engine.getMaxRounds(); i++) {
            rounds[i] = generateRoundData();
        }
        Engine.playRounds(rules, rounds);
    }

    private static String[] generateRoundData() {
        int randomNumberOne = Utils.generateRandom(1, 20);
        int randomNumberTwo = Utils.generateRandom(1, 20);
        String operand = getRandomOperand();
        String question = generateQuestion(operand, randomNumberOne, randomNumberTwo);
        String answer = Integer.toString(generateAnswer(operand, randomNumberOne, randomNumberTwo));
        return new String[] {question, answer};
    }

    public static String generateQuestion(String operand, int numberOne, int numberTwo) {
        return numberOne + " " + operand + " " + numberTwo;
    }

    public static int generateAnswer(String operand, int numberOne, int numberTwo) {
        switch (operand) {
            case "-":
                return numberOne - numberTwo;
            case "+":
                return numberOne + numberTwo;
            case "*":
                return numberOne * numberTwo;
            default:
                return 0;
        }
    }
    public static String getRandomOperand() {
        String[] operators = {"+", "-", "*"};
        int valueForOperand = Utils.generateRandom(0, 2);
        return operators[valueForOperand];
    }
}
