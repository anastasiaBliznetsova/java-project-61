package hexlet.code.games;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.ArrayUtils;

public class Prime {
    public static Map<String, String> PrimeNumber() {
        Map<String, String> output = new HashMap<>();
        var result = "";
        int maxValue = 30;
        int randomNumber = (int) (Math.random() * ++maxValue);
        int[] arrayPrime = {2, 3, 5, 7,	11, 13, 17, 19, 23, 29};
        int indexPrimeNumber = ArrayUtils.indexOf(arrayPrime, randomNumber);
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
