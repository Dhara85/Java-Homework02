package homework_week_8;

import java.util.Scanner;

/**
 * Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 * The method needs to find the first and the last digit of the parameter number passed to the method,
 * using a loop and return the sum of the first and the last digit of that number.
 * If the number is negative then the method needs to return -1 to indicate an invalid value.
 */

public class Programme_7FirstAndLastDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int result = sumFirstAndLastDigit(number);
        System.out.println("Sum of the first and last digit is: " + result);
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1; // Return -1 for negative numbers
        }

        // Handle the case where the number has only one digit
        if (number >= 0 && number <= 9) {
            return number * 2;
        }

        int lastDigit = number % 10; // Get the last digit

        // Loop to find the first digit
        while (number >= 10) {
            number /= 10;
        }
        int firstDigit = number;

        return firstDigit + lastDigit;
    }
}