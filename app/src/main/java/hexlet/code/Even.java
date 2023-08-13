package hexlet.code;
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
            System.out.println("Question: " + randomNumber);
            System.out.println("Your answer: ");
            Scanner myObjGame = new Scanner(System.in);
            String answer = myObjGame.nextLine();
            if (randomNumber % 2 == 0) {
                result = "yes";
            } else {
                result = "no";
            }
            if (answer.equals(result)) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result + "'.");
                System.out.println("Let's try again, " + Cli.getUserName() + "!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + Cli.getUserName() + "!");
        System.exit(0);
    }

}
