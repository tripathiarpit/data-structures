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
    int arr[] = {-1,-1,0,1,1,0};
    static int prefixSum[];

    public static void main(String[] args) {
        EqulibriumIndex equlibriumIndex = new EqulibriumIndex();
        System.out.println(pivotIndex(equlibriumIndex.arr));
    }
    public static int  pivotIndex(int[] nums) {
        int prefixSum[] = new int[nums.length];
        calcprefixSum(nums,prefixSum,prefixSum.length-1);
        if(prefixSum[0] - (prefixSum[prefixSum.length-1])== 0) {
            return 0;
        }
        if((prefixSum[prefixSum.length-1]-prefixSum[prefixSum.length-2])== 0 && nums[nums.length-1] !=0) {
            return prefixSum.length-1;
        }
        for(int i = 1; i<=prefixSum.length-1;i++) {
            int leftSum = prefixSum[i-1];
            int rightSum =  (prefixSum[prefixSum.length-1]) - (prefixSum[i]);
            if(leftSum==rightSum) {
                return i;
            }
        }
        return -1;
    }
    public static void calcprefixSum(int arr[], int prefixSumA[],int index) {
        if(index ==0) {
            prefixSumA[index] = arr[0];
            return;
        }
        calcprefixSum(arr,prefixSumA,index-1);
        prefixSumA[index] = prefixSumA[index-1]+ arr[index];
        return;
    }
}
