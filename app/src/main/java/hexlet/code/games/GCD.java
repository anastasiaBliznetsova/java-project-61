package hexlet.code.games;
import java.util.HashMap;
import java.util.Map;

public class GCD {
    private static final int MAX_VALUE = 20;
    public static Map<String, String> greatestCommonDivisor() {
        Map<String, String> output = new HashMap<>();

        int randomNumberOne = (int) (Math.random() * MAX_VALUE);
        int randomNumberTwo = (int) (Math.random() * MAX_VALUE);
        int result = euclidsAlgorithm(randomNumberOne, randomNumberTwo);
        output.put("quest", randomNumberOne + " " + randomNumberTwo);
        output.put("answer", Integer.toString(result));
        return output;
    }
    public static int euclidsAlgorithm(int numberOne, int numberTwo) {
        if (numberTwo == 0) {
            return numberOne;
        }
        return euclidsAlgorithm(numberTwo, numberOne % numberTwo);
    }
}
