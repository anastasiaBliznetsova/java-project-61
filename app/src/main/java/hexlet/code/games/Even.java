package hexlet.code.games;
import java.util.HashMap;
import java.util.Map;

public class Even {
    private static final int MAX_VALUE = 20;
    public static Map<String, String> parityNumber() {
        Map<String, String> output = new HashMap<>();
        var result = "";

        int randomNumber = (int) (Math.random() * MAX_VALUE);
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
