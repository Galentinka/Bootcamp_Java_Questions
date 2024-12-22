package Part1.Medium;

import java.util.Scanner;

public class PalindromeOrNotNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        int originalNumber = number;
        int reverseNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reverseNumber = reverseNumber * 10 + digit;
            number /= 10;
        }

        if (originalNumber == reverseNumber) {
            System.out.print(originalNumber + " is a palindrome.");
        } else {
            System.out.print(originalNumber + " is not a palindrome.");
        }

    }
}
