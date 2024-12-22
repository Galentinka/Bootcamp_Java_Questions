package Part1.Medium;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] array = {5, 12, 7, 3, 1};

        System.out.print("Original array ");
        System.out.println(Arrays.toString(array));

        for (int i = 1; i < array.length; i++) {
            int j = i;

            while (j > 0 && array[j - 1] > array[j]) {

                int temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
                j--;
            }

        }

        System.out.print("Sorted array ");
        System.out.println(Arrays.toString(array));

    }
}
