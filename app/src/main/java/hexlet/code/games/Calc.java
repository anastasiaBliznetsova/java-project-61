package hexlet.code.games;
import java.util.HashMap;
import java.util.Map;

public class Calc {
    private static final int MAX_VALUE = 20;
    private static final int MAX_VALUE_FOR_OPERAND = 4;
    public static Map<String, String> calculator() {
        Map<String, String> output = new HashMap<>();
        int result = 0;

        int randomNumberOne = (int) (Math.random() * MAX_VALUE);
        int randomNumberTwo = (int) (Math.random() * MAX_VALUE);
        int valueForOperand = (int) (Math.random() * (MAX_VALUE_FOR_OPERAND - 1) + 1);
        String operand = randomOperand(Integer.toString(valueForOperand));
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
            default:
                break;
        }
        output.put("quest", randomNumberOne + " " + operand + " " + randomNumberTwo);
        output.put("answer", Integer.toString(result));
        return output;
    }
    public static String randomOperand(String number) {
        switch (number) {
            case "1":
                return "+";
            case "2":
                return "-";
            case "3":
                return "*";
            default:
                break;
        }
        return "";
    }
}
