package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final int MAX_COLS = 2;
    public static void findingNumberEven() {
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        var result = "";
        String[][] rounds = new String[Engine.getMaxRounds()][MAX_COLS];
        for (int i = 0; i < Engine.getMaxRounds(); i++) {
            rounds[i] = generateRoundData();
        }
        Engine.playRounds(rules, rounds);
    }
    private static String[] generateRoundData() {
        int randomNumber = Utils.generateRandom(0, 20);
        String answer = randomNumber % 2 == 0 ? "yes" : "no";
        String question = Integer.toString(randomNumber);
        return new String[] {question, answer};
    }
}
