package hexlet.code.games;
import hexlet.code.Engine;

public class Prime {
    private static final int MAX_ITERATION = 3;
    private static final int MAX_VALUE = 30;
    public static void primeNumber() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        String[][] output = new String[MAX_ITERATION][2];
        int count = 0;
        while (count < MAX_ITERATION) {
            int randomNumber = (int) (Math.random() * MAX_VALUE);
            output[count][0] = Integer.toString(randomNumber);
            output[count][1] = isPrimeNumber(randomNumber) ? "yes" : "no";
            count++;
        }
        Engine.gameEngine(output);
    }
    public static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
