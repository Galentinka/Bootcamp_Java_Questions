package Part1.Difficult;

public class MaxSubArrayInArray {

    public static int maxSubArray(int[] numbers) {
        int maxSum = numbers[0];
        int currentSum = 0;

        for (int num : numbers) {

            currentSum = Math.max(currentSum, 0);
            currentSum += num;
            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println("Maximum sub array sum is: " + maxSubArray(array));
    }
}
