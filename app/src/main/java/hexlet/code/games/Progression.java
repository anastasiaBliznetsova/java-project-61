package hexlet.code.games;

import java.util.HashMap;
import java.util.Map;

public class Progression {
    private static final int valueForRirstNumber = 20;
    private static final int valueForStep = 8;
    private static final int valueForMissingNumber = 9;
    public static Map<String, String> arithmeticProgression() {
        Map<String, String> output = new HashMap<>();

        int firstNumber = (int) (Math.random() * valueForRirstNumber);
        int step = (int) (Math.random() * valueForStep) + 2;
        int missingNumber = (int) (Math.random() * valueForMissingNumber);
        String quest = "";
        String result = "";

        for (int i = 0; i < 10; i++) {
            if (i == missingNumber) {
                quest += ".. ";
                result = Integer.toString((step * (i + 1)) + firstNumber);
            } else {
                quest += (step * (i + 1)) + firstNumber + " ";
            }
        }
        output.put("quest", quest);
        output.put("answer", result);

        return output;
    }
}
