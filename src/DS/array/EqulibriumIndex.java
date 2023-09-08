package DS.array;
/*

Given a sequence arr[] of size n, Write a function int equilibrium(int[] arr, int n) that returns
an equilibrium index (if any) or -1 if no equilibrium index exists.
Input: A[] = {-7, 1, 5, 2, -4, 3, 0}
Output: 3
3 is an equilibrium index, because:
A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
 */
public class EqulibriumIndex {
    int arr[] = {-7, 1, 5, 2, -4, 3, 0};
    static int prefixSum[];

    public static void main(String[] args) {
        EqulibriumIndex equlibriumIndex = new EqulibriumIndex();
        System.out.println(findEquilibriumIndex(equlibriumIndex.arr));
    }
    public static int findEquilibriumIndex(int arr[]) {
        prefixSum = new int[arr.length];
        ArrayUtility.prefixSumRecursion(arr,arr.length-1,prefixSum);
        // Prefix Sum {1 3 5 2 2}
        int totalSum = prefixSum[prefixSum.length-1];
        int leftSum = 0;
        for(int i=0; i< arr.length; i++) {
            totalSum = totalSum - arr[i];

            if(totalSum == leftSum) {
                return i;
            }
            leftSum = leftSum + arr[i];

        }
        return -1;
    }
}
