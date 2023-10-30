package homework_week_8;
/**
 * Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number
 */

import java.util.Scanner;

public class Programme_2MinMax {
    public static void main(String[] args) {


        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);


        // Initialize a counter variable to count the number of valid numbers entered by the user
        int count = 0;


        // Initialize a variable to store the sum of the numbers entered by the user
        int sum = 0;


        // Continue reading numbers until the user has entered 10 valid numbers
        while (count < 10) {


            // Print a message to the user asking them to enter a number
            System.out.println("Enter number #" + (count + 1) + ": ");


            // Check if the user has entered a valid integer
            if (scanner.hasNextInt()) {


                // Get the number entered by the user
                int number = scanner.nextInt();


                // Add the number to the sum
                sum += number;


                // Increment the counter
                count++;
            } else {
                // Print a message to the user indicating that they have entered an invalid number
                System.out.println("Invalid Number");
                // Consume the invalid input
                scanner.next();
            }
        }
        // Close the Scanner object
        scanner.close();
        // Print the sum of the numbers entered by the user
        System.out.println("The sum of the numbers entered is: " + sum);

    }
}
