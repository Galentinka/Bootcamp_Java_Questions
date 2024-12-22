package Part1.Medium;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] array = {5, 12, 7, 3, 1};

        System.out.print("Original array ");
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {

            int minValue = array[i];
            int minIndex = i;

            for (int j = i; j < array.length; j++) {
                if (array[j] < minValue) {
                    minValue = array[j];
                    minIndex = j;
                }
            }

            if (minValue < array[i]) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }

        System.out.print("Sorted array ");
        System.out.println(Arrays.toString(array));

    }
}
