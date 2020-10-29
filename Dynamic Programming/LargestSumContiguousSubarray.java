class LargestSumContiguousSubarray {

    //Kadane's algorithm is used to find the sum of contiguous subarray within a one-dimensional array of numbers which has the largest sum.
    static int maxSubArraySum(int array[], int size) {

        int maxSoFar = array[0];
        int currMax = array[0];

        for (int i = 1; i < size; i++) {
            currMax = max(array[i], currMax + array[i]);
            maxSoFar = max(maxSoFar, currMax);
        }
        return maxSoFar;
    }

    static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        int array[] = {-2, -3, 4, -1, -2, 1, 5, -3, 10, -11, 4};
        int n = array.length;
        int maximumSum = maxSubArraySum(array, n);
        System.out.println("Maximum contiguous sum is " + maximumSum);
    }
} 