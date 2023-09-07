package hexlet.code.games;
import hexlet.code.Engine;

public class GCD {
    private static final int MAX_VALUE = 20;
    private static final int MAX_ITERATION = 3;
    public static void greatestCommonDivisor() {
        System.out.println("Find the greatest common divisor of given numbers.");
        String[][] output = new String[MAX_ITERATION][2];
        int count = 0;
        while (count < MAX_ITERATION) {
            int randomNumberOne = (int) (Math.random() * MAX_VALUE);
            int randomNumberTwo = (int) (Math.random() * MAX_VALUE);
            int result = euclideanAlgorithm(randomNumberOne, randomNumberTwo);
            output[count][0] = randomNumberOne + " " + randomNumberTwo;
            output[count][1] = Integer.toString(result);
            count++;
        }
        Engine.gameEngine(output);
    }
    public static int euclideanAlgorithm(int
                                               numberOne, int numberTwo) {
        if (numberTwo == 0) {
            return numberOne;
        }
        return euclideanAlgorithm(numberTwo, numberOne % numberTwo);
    }
}
