package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        boolean done = false;
        while (!done) {
            System.out.println("Please enter the game number and press Enter.");
            System.out.println("1 - Greet");
            System.out.println("2 - Even");
            System.out.println("0 - Exit");
            Scanner myObj = new Scanner(System.in);
            String numberGame = myObj.nextLine();
            System.out.println("Your choice: " + numberGame);
            switch (numberGame) {
                case "1":
                    Cli.greetUserName();
                    done = true;
                    break;
                case "2":
                    Even.parityNumber();
                    done = true;
                    break;
                case "0":
                    System.exit(0);
                default:
                    System.out.println("You entered an invalid request");
            }
        }
    }
}
