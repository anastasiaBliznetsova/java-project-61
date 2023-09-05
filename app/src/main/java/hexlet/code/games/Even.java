package hexlet.code.games;
import java.util.HashMap;
import java.util.Map;

public class Even {
    private static boolean printQ = true;
    public static Map<String, String> parityNumber() {
        Map<String, String> output = new HashMap<>();
        var result = "";
        int maxValue = 20;

        int randomNumber = (int) (Math.random() * ++maxValue);
        if (randomNumber % 2 == 0) {
            result = "yes";
        } else {
            result = "no";
        }
        output.put("quest", Integer.toString(randomNumber));
        output.put("answer", result);
        return output;
    }

}
