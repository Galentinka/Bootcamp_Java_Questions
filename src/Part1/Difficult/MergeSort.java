package Part1.Difficult;

public class MergeSort {

    public static void merge(int[] array, int lowIndex, int midIndex, int hghIndex) {

        int leftArrayLength = midIndex - lowIndex + 1;
        int rightArrayLength = hghIndex - midIndex;

        int[] leftArray = new int[leftArrayLength];
        int[] rightArray = new int[rightArrayLength];

        System.arraycopy(array, lowIndex, leftArray, 0, leftArrayLength);
        System.arraycopy(array, midIndex + 1, rightArray, 0, rightArrayLength);

        int i = 0, j = 0;
        int k = lowIndex;

        while (i < leftArrayLength && j < rightArrayLength) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < leftArrayLength) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rightArrayLength) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // Find the midpoint
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {

        int[] arr = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
