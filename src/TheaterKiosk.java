import java.util.Scanner;

public class TheaterKiosk {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;

        System.out.println("--- Theater Kiosk Entry ---");
        System.out.print("Please enter your age: ");

        try {
            age = scanner.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter a whole number for your age.");
            scanner.close();
            return;
        }

        if (age >= 21) {
            System.out.println("\n*** VALID ***");
            System.out.println("Since you are " + age + " or older, you receive a **paper wrist band**.");
        }

        scanner.close();
    }
}
