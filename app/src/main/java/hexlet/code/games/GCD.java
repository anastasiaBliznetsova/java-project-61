package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final int MAX_COLS = 2;
    public static void findGreatestCommonDivisor() {
        String rules = "Find the greatest common divisor of given numbers.";
        String[][] rounds = new String[Engine.getMaxRounds()][MAX_COLS];
        for (int i = 0; i < Engine.getMaxRounds(); i++) {
            rounds[i] = generateRoundData();
        }
        Engine.playRounds(rules, rounds);
    }

    private static String[] generateRoundData() {
        int randomNumberOne = Utils.generateRandom(1, 20);
        int randomNumberTwo = Utils.generateRandom(1, 20);
        String answer = Integer.toString(calculateEuclidAlg(randomNumberOne, randomNumberTwo));
        String question = randomNumberOne + " " + randomNumberTwo;
        return new String[] {question, answer};
    }
    public static int calculateEuclidAlg(int numberOne, int numberTwo) {
        if (numberTwo == 0) {
            return numberOne;
        }
        return calculateEuclidAlg(numberTwo, numberOne % numberTwo);
    }
}
