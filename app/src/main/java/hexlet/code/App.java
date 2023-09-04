package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
            System.out.println("Please enter the game number and press Enter.");
            System.out.println("1 - Greet");
            System.out.println("2 - Even");
            System.out.println("3 - Calc");
            System.out.println("4 - GCD");
            System.out.println("0 - Exit");
            Scanner myObj = new Scanner(System.in);
            String numberGame = myObj.nextLine();
            System.out.println("Your choice: " + numberGame);
            Engine.gameEngine(numberGame);
    }
}
