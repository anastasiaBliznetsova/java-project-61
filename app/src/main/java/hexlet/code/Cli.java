package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static String userName;
    public static void greetUserName() {
        System.out.println("Welcome to the Brain Games!");
        Scanner myObj = new Scanner(System.in);
        System.out.println("May I have your name?");
        userName = myObj.nextLine();  // Read user input
        System.out.println("Hello, " + userName + "!");
    }
    public static String getUserName() {
        return userName;
    }

}
