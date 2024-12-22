package Part1.Medium;

public class BinarySearch {


    public static void main(String[] args) {

        int array[] = {10, 12, 14, 15, 16, 20, 24, 30};
        int searchNumber = 24;
        int startIndex = 0;
        int endIndex = array.length - 1;

        binarySearch(array, startIndex, endIndex, searchNumber);
    }

    public static void binarySearch(int array[], int startIndex, int endIndex, int searchNumber) {

        if (startIndex > endIndex) {
            return;
        }

        int midIndex = (startIndex + endIndex) / 2;

        if (array[midIndex] == searchNumber) {
            System.out.println(midIndex);
        } else if (searchNumber > array[midIndex]) {
            binarySearch(array, midIndex + 1, endIndex, searchNumber);
        } else {
            binarySearch(array, startIndex, midIndex - 1, searchNumber);
        }
    }

}
