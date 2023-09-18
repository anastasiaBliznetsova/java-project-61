package hexlet.code;
import java.util.Scanner;

public class Cli {
    private static String userName;
    public static void greetUserName() {
        System.out.println("Welcome to the Brain Games!");
        Scanner userNameScanner = new Scanner(System.in);
        System.out.println("May I have your name?");
        userName = userNameScanner.nextLine();  // Read user input
        System.out.println("Hello, " + userName + "!");
    }
    public static String getUserName() {
        return userName;
    }

}
