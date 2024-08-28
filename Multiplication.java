// Import the Scanner class from the java.util package to read user input
import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of columns and read the input
        System.out.println("Enter number of columns: ");
        int columns = input.nextInt();

        // Prompt the user to enter the number of rows and read the input
        System.out.println("Enter number of rows: ");
        int rows = input.nextInt();

        // Loop through each row
        for (int i = 1; i <= rows; i++) {
            // For each row, loop through each column
            for (int j = 1; j <= columns; j++) {
                // Print the product of the current row and column indices, formatted with a width of 3 characters
                System.out.printf(" %3d", i * j);
            }
            // Move to the next line after printing all columns in the current row
            System.out.println();
        }

        // Close the Scanner to free up resources
        input.close();
    }
}
