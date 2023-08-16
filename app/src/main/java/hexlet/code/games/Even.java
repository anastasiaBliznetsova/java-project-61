package hexlet.code.games;
import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;

public class Even {
    public static void parityNumber() {
        Cli.greetUserName();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int count = 0;
        var result = "";
        int maxValue = 20;
        while (count < 3) {
            int randomNumber = (int) (Math.random() * ++maxValue);
            if (randomNumber % 2 == 0) {
                result = "yes";
            } else {
                result = "no";
            }
            Engine.gameEngine(Integer.toString(randomNumber), result, count);
            count++;
        }
    }

}
