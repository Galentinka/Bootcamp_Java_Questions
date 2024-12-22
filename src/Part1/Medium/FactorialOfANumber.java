package Part1.Medium;

import java.util.Scanner;

public class FactorialOfANumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int number = scanner.nextInt();

        long result = factorial(number);

        System.out.println("The factorial of " + number + " is: " + result);  // Output: 120
    }

    public static long factorial(int n) {

        if (n == 0 || n == 1) {  // Base case
            return 1;
        } else {  // Recursive case
            return n * factorial(n - 1);
        }
    }
}
