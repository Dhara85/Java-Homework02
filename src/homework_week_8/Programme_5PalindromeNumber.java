package homework_week_8;

import java.util.Scanner;

/**
 * Write a method called isPalindrome with one int parameter called number.
 * The method needs to return a boolean.
 * It should return true if the number is a palindrome number otherwise it should return false.
 * Check the tips below for more info about palindromes.
 * Example Input/Output
 * isPalindrome(-1221); → should return true
 * isPalindrome(707); → should return true
 * isPalindrome(11212); → should return false because the reverse is 21211 and that is not equal to 11212.
 */
public class Programme_5PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");

        if(scanner.hasNextInt()) {
            int number = scanner.nextInt();
            boolean isPalindrome = isPalindromenumber(number);

            if (isPalindrome) {
                System.out.println(number + " is a palindrome number.");
            } else {
                System.out.println(number + "is not a palindrome number.");
            }
        }else {
            System.out.println("Invalid input. Please enter a valid number.");
        }
        scanner.close();
        }
    public static boolean isPalindromenumber(int number){
        int originalNumber = number;
        int reversedNumber = 0;

        while(number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return originalNumber == reversedNumber;
    }
}
