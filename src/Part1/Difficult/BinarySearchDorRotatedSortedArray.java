package Part1.Difficult;

public class BinarySearchDorRotatedSortedArray {

    public static int binarySearch(int[] array, int target) {

        int firstIndex = 0;
        int lastIndex = array.length - 1;

        while (firstIndex <= lastIndex) {
            int midIndex = firstIndex + (lastIndex - firstIndex) / 2;

            if (array[midIndex] == target) {
                return midIndex;
            }

            if (array[firstIndex] <= array[midIndex]) {
                if (target >= array[firstIndex] && target < array[midIndex]) {
                    lastIndex = midIndex - 1;
                } else {
                    firstIndex = midIndex + 1;
                }
            } else {
                if (target > array[midIndex] && target <= array[lastIndex]) {
                    firstIndex = midIndex + 1;
                } else {
                    lastIndex = midIndex - 1;
                }

            }

        }
        return -1;
    }

    public static void main(String[] args) {

        int[] array = {6, 7, 9, 15, 19, 2, 3};
        int target = 7;

        int result = binarySearch(array, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
