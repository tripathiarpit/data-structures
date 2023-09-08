package DS.array;

import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int prefixSum[] = new int[arr.length];
        int sum=0;
//        for(int i=0; i<arr.length; i++) {
//            sum+= arr[i];
//            prefixSum[i]= sum;
//        }
        System.out.print("Array Elements:");
        Arrays.stream(arr).forEach(data-> System.out.print(data+","));
        System.out.print("\nPrefix Sum Elements:");
       // Arrays.stream(prefixSum).forEach(data-> System.out.print(data+","));
        prefixSumRecursion(arr, arr.length-1,prefixSum);
        Arrays.stream(prefixSum).forEach(data-> System.out.print(data+","));
    }

    public static int prefixSumRecursion(int arr[], int index, int prefixSum[]) {
        if(index == 0) {
            prefixSum[0] = arr[0];
            return arr[0];
        }
       int sum = prefixSumRecursion(arr,  index-1, prefixSum);
        sum = sum + arr[index];
        prefixSum[index] = sum;
        return sum;
    }
}
