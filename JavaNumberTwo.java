import java.util.Scanner;

public class JavaNumberTwo {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the student to enter the marks for each unit
        System.out.println("Enter the marks for each of the five units:");

        // Variables to store the total marks and individual unit marks
        double totalMarks = 0;
        double[] unitMarks = new double[5];

        // Loop to read the marks for each unit
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for unit " + (i + 1) + ": ");
            unitMarks[i] = scanner.nextDouble();
            totalMarks += unitMarks[i];
        }

        // Calculate the average marks
        double averageMarks = totalMarks / 5;

        // Display the average marks with two decimal places
        System.out.printf("Average marks: %.2f%n", averageMarks);

        // Close the scanner
        scanner.close();
    }
}
