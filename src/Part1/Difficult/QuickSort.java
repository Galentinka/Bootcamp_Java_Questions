package Part1.Difficult;

public class QuickSort {

    public static void quickSort(int[] array, int low, int high) {

        if (low < high) {

            int pivotIndex = partition(array, low, high);

            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {

        int pivotIndex = array[high];

        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] < pivotIndex) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, high);
        return i + 1;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {

        int array[] = {1, 20, 8, 6, 9, 32, 14, 18};
        quickSort(array, 0, array.length - 1);

        for (int num : array) {
            System.out.println(num + " ");
        }
    }
}
