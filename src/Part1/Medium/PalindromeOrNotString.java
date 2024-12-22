package Part1.Medium;

import java.util.Scanner;

public class PalindromeOrNotString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your text: ");

        String text = scan.nextLine();

        int start = 0;
        int end = text.length() - 1;
        boolean isPalindrome = true;

        while (start < end) {

            if (text.charAt(start) != text.charAt(end)) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("Your text is Palindrome");
        } else {
            System.out.println("Your text is Not Palindrome");
        }

    }
}
