package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final int MAX_COLS = 2;
    private static final int PROGRESSION_COUNT = 10;
    public static void calculateArithmeticProgression() {
        String rules = "What number is missing in the progression?";
        String[][] rounds = new String[Engine.getMaxRounds()][MAX_COLS];
        for (int i = 0; i < Engine.getMaxRounds(); i++) {
            rounds[i] = generateRoundData();
        }
        Engine.playRounds(rules, rounds);
    }

    public static String[] generateRoundData() {
        int firstNumber = Utils.generateRandom(0, 20);
        int step = Utils.generateRandom(2, 8);
        String[] progression = generateProgression(firstNumber, step);
        int missingNumber = Utils.generateRandom(0, PROGRESSION_COUNT);
        String answer = progression[missingNumber];
        progression[missingNumber] = "..";
        var question = String.join(" ", progression);
        return new String[] {question, answer};
    }
    public static String[] generateProgression(int firstNumber, int step) {
        String[] progression = new String[PROGRESSION_COUNT];
        for (int i = 0; i < progression.length; i++) {
            progression[i] = Integer.toString((step * (i + 1)) + firstNumber);
        }
        return progression;
    }
}
