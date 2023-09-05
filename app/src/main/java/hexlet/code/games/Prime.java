package hexlet.code.games;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.ArrayUtils;

public class Prime {
    private static final int MAX_VALUE = 30;
    private static final int[] ARRAY_PRIME = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
    public static Map<String, String> primeNumber() {
        Map<String, String> output = new HashMap<>();
        var result = "";
        int randomNumber = (int) (Math.random() * MAX_VALUE);

        int indexPrimeNumber = ArrayUtils.indexOf(ARRAY_PRIME, randomNumber);
        if (indexPrimeNumber != -1) {
            result = "yes";
        } else {
            result = "no";
        }
        output.put("quest", Integer.toString(randomNumber));
        output.put("answer", result);
        return output;
    }
}
