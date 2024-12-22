package Part1.Medium;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {

        String inputString = "";
        String reversedString = "";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        inputString = scanner.nextLine();

        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversedString = reversedString + inputString.charAt(i);
        }

        System.out.println(reversedString);

    }
}
