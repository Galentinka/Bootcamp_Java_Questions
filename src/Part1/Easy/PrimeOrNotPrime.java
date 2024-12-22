package Part1.Easy;

import java.util.Scanner;

public class PrimeOrNotPrime {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Your number: ");
        int num = scan.nextInt();

        boolean isPrime = true;

        for (int i = 2; i <= num / 2; i++) {

            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.print("Your number is prime");
        } else {
            System.out.print("Your number is not prime");
        }

    }
}
