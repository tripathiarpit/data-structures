package DS.array;

public class ArrayUtility {
    public static int prefixSumRecursion(int arr[], int index, int prefixSum[]) {
        if (index != 0) {
            int sum = prefixSumRecursion(arr, index - 1, prefixSum);
            sum = sum + arr[index];
            prefixSum[index] = sum;
            return sum;
        } else {
            prefixSum[0] = arr[0];
            return arr[0];
        }
    }
}
