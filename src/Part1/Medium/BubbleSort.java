package Part1.Medium;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] array = {5, 12, 7, 3, 1};

        System.out.print("Original array ");
        System.out.println(Arrays.toString(array));

        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted array ");
        System.out.println(Arrays.toString(array));

    }
}
