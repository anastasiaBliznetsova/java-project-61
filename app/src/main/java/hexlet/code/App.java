package hexlet.code;
import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    private static final int MAX_MENU_COUNT = 7;
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner myObj = new Scanner(System.in);
        String numberGame = myObj.nextLine();
        if (Integer.parseInt(numberGame) > 0 && Integer.parseInt(numberGame) < MAX_MENU_COUNT) {
            Cli.greetUserName();
        }
        switch (numberGame) {
            case "0", "1":
                System.exit(0);
            case "2":
                Even.parityNumber();
                break;
            case "3":
                Calc.calculator();
                break;
            case "4":
                GCD.greatestCommonDivisor();
                break;
            case "5":
                Progression.arithmeticProgression();
                break;
            case "6":
                Prime.primeNumber();
                break;
            default:
                System.out.println("You entered an invalid request");
                System.exit(0);
        }


    }
}
