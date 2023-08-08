package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static void getUserName() {
        System.out.println("Welcome to the Brain Games!");
        Scanner myObj = new Scanner(System.in);
        System.out.println("May I have your name?");
        String userName = myObj.nextLine();  // Read user input
        System.out.println("Hello, " + userName + "!");
    }
}
