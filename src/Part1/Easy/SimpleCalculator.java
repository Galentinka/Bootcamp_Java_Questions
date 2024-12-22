package Part1.Easy;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        int fistNumber;
        int secondNumber;
        String operation;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first number: ");
        fistNumber = input.nextInt();

        System.out.println("Please enter your second number: ");
        secondNumber = input.nextInt();

        System.out.println("Please enter your operation: ");
        operation = input.next();

        if (operation.equals("+")) {
            System.out.println("The answer of this operation is: " + (fistNumber + secondNumber));
        } else if (operation.equals("-")) {
            System.out.println("The answer of this operation is: " + (fistNumber - secondNumber));

        } else if (operation.equals("*")) {
            System.out.println("The answer of this operation is: " + (fistNumber * secondNumber));

        } else if (operation.equals("/")) {
            System.out.println("The answer of this operation is: " + (fistNumber / secondNumber));

        }
    }
}
