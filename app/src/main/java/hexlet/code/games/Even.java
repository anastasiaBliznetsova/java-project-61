package hexlet.code.games;
import hexlet.code.Engine;

public class Even {
    private static final int MAX_VALUE = 20;
    private static final int MAX_ITERATION = 3;
    public static void parityNumber() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        var result = "";
        String[][] output = new String[MAX_ITERATION][2];
        int count = 0;
        while (count < MAX_ITERATION) {
            int randomNumber = (int) (Math.random() * MAX_VALUE);
            result = randomNumber % 2 == 0 ? "yes" : "no";
            output[count][0] = Integer.toString(randomNumber);
            output[count][1] = result;
            count++;
        }
        Engine.gameEngine(output);
    }

}
