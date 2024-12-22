package Part1.Easy;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {

        double number;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        number = input.nextDouble();

        number = (number - 32) * 5/9;
        System.out.print("Temperature in Celsius is: " + Math.round(number * 100.0) / 100.0);
    }
}
