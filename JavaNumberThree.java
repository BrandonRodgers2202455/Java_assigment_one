import java.util.Scanner;

public class JavaNumberThree {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Check divisibility for integers in the range of 0-9
        for (int divisor = 0; divisor <= 9; divisor++) {
            // Check if the number is divisible by the current divisor
            if (number % divisor == 0) {
                // Print the divisibility statement
                System.out.println("The number is divisible by " + divisor);
            }
        }

        // Close the scanner
        scanner.close();
    }
}
