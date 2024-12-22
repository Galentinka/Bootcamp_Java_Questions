package Part1.Easy;

import java.util.Random;

public class RandomNumberFrom1To100 {

    public static void main(String[] args) {

        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;

        System.out.println(randomNumber);
    }
}
