package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    private static final int MAX_ITERATION = 3;
    private static final int VALUE_FOR_NUMBER = 20;
    private static final int VALUE_FOR_STEP = 8;
    private static final int PROGRESSION_COUNT = 10;
    public static void arithmeticProgression() {
        System.out.println("What number is missing in the progression?");
        String[][] output = new String[MAX_ITERATION][2];
        int count = 0;
        while (count < MAX_ITERATION) {
            int firstNumber = (int) (Math.random() * VALUE_FOR_NUMBER);
            int step = (int) (Math.random() * VALUE_FOR_STEP) + 2;
            String[] progression = generateProgression(firstNumber, step);
            int missingNumber = (int) (Math.random() * PROGRESSION_COUNT);
            String result = progression[missingNumber];
            progression[missingNumber] = "..";
            var question = String.join(" ", progression);
            output[count][0] = question;
            output[count][1] = result;
            count++;
        }

        Engine.gameEngine(output);
    }
    public static String[] generateProgression(int firstNumber, int step) {
        String[] progression = new String[PROGRESSION_COUNT];
        for (int i = 0; i < progression.length; i++) {
            progression[i] = Integer.toString((step * (i + 1)) + firstNumber);
        }
        return progression;
    }
}
