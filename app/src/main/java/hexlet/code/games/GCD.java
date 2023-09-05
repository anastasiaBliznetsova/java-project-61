package hexlet.code.games;
import java.util.HashMap;
import java.util.Map;

public class GCD {

    public static Map<String, String> greatestCommonDivisor() {
        Map<String, String> output = new HashMap<>();
        int maxValue = 20;
        int randomNumberOne = (int) (Math.random() * ++maxValue);
        int randomNumberTwo = (int) (Math.random() * ++maxValue);
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
