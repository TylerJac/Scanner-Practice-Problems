import java.util.Scanner;
public class Superhero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter superhero's name: ");
        String superheroName = scanner.nextLine();
        System.out.print("Enter superhero's power: ");
        String superheroPower = scanner.nextLine();
        System.out.print("There was a superhero named "+superheroName+" who had the power of "+superheroPower+
                ".\n As they grew older, "+superheroName+" saw that the world needed them. \n" + superheroName +
                " used their ability to " + superheroPower + " to save the world.");
    }
}
