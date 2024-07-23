import java.util.Scanner;
public class VariableInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of text: ");
        String inputString = scanner.nextLine();
        System.out.println("Enter an integer: ");
        int inputInteger = scanner.nextInt();
        System.out.println("Enter a double: ");
        double inputDouble = scanner.nextDouble();
        System.out.println("Enter a boolean: ");
        boolean inputBoolean = scanner.nextBoolean();

        System.out.printf("\n Your string is: %s", inputString);
        System.out.printf("\n Your integer is: %s", inputInteger);
        System.out.printf("\n Your double is: %s",inputDouble);
        System.out.printf("\n Your boolean is: %s", inputBoolean);
    }
}
