package Part1.Easy;

import java.util.Scanner;

public class ReverseAString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your text: ");
        String text = scan.nextLine();

        StringBuilder reverse = new StringBuilder();
        reverse.append(text);
        reverse.reverse();

        System.out.println(text);
        System.out.println(reverse);
    }
}
