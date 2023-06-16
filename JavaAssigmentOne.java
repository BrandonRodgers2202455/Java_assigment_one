import java.util.Scanner;

public class SurnameAndAge {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their surname
        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();

        // Prompt the user to enter their age
        System.out.print("Enter your current age: ");
        int age = scanner.nextInt();

        // Calculate the number of characters in the surname
        int surnameLength = surname.length();

        // Print the number of characters in the surname
        System.out.println("The number of characters in your surname is: " + surnameLength);

        // Check if the age is even or odd and print the result
        String ageType = (age % 2 == 0) ? "even" : "odd";
        System.out.println("Your current age is an " + ageType + " number");

        // Close the scanner
        scanner.close();
    }
}
