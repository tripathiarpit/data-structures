package DS.array;
/*Given an Array A[N]

************************KADEN'S ALGO****************************8
Find the maximum Sub Array SUM.

*/

public class MaxSubArray {

    public static void main(String[] args) {
        int arr[] = {-2,3,-9};

        System.out.println("Maximum Sum of Sub Array is:"+ MaxSubArray.findMaxSubArraySum(arr));

    }
    public static int findMaxSubArraySum(int arr[]) {
        int totalSum = Integer.MIN_VALUE;
        int sumTillIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            sumTillIndex = sumTillIndex + arr[i];
            if (totalSum < sumTillIndex) {
                totalSum = sumTillIndex;
            }
            if (sumTillIndex < 0) {
                sumTillIndex = 0;
            }

        }
        return totalSum;
    }
}
