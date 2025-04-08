public class HelloWorld {

    // Main method: entry point of the Java program
    public static void main(String[] args) {
        // Call a method to print a greeting window
        greet("World");
    }

    // A simple method to print a greeting Window
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
Object env
 public static void greet(String name) {
        System.out.println("Hello, " + full name + "!");
    }
import java.util.Scanner;   

public class LoginSystem {

    public static void main(String[] args) {
        // Hardcoded username and password
        String correctUsername = "admin";
        String correctPassword = "12345";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String enteredUsername = scanner.nextLine();

        System.out.print("Enter password: ");
        String enteredPassword = scanner.nextLine();

        if (enteredUsername.equals(correctUsername) && enteredPassword.equals(correctPassword)) {
            System.out.println("Login successful! Welcome " + enteredUsername + ".");
        } else {
            System.out.println("Invalid username or password.");
        }

        scanner.close();
    }
}
