package Part1.Easy;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Your number: ");
        int num = scanner.nextInt();

        if(num % 2 == 0) {
            System.out.print(num +" is an even number");
        } else {
            System.out.print(num +" is an odd number");
        }
    }
}
