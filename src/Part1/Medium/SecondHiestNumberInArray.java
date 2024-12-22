package Part1.Medium;

public class SecondHiestNumberInArray {

    public static void main(String[] args) {

        int[] array = {2, 5, 7, 9, 11, 11, 10};
        int largestNumber = 0;
        int secondLargestNumber = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] > largestNumber) {
                secondLargestNumber = largestNumber;
                largestNumber = array[i];
            } else if(array[i] > secondLargestNumber && array[i] != largestNumber) {
                secondLargestNumber = array[i];
            }
        }


        System.out.println("Second largest number is: " + secondLargestNumber);
    }
}
