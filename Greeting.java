import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        // Create the Scanner for reading user input
        Scanner scanner = new Scanner(System.in);

        // Read the user's name and display a greeting message
        System.out.println("Enter your name: ");
        // Use nextLine() to read the entire line of input, including spaces and punctuation
        String name = scanner.nextLine();

        // Display the greeting message with the user's name
        System.out.printf("Hello, %s", name);
        scanner.close();
    }
}
