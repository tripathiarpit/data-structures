package DS.array;

import java.util.Arrays;

/*
Given an Array having N elements. Given Q queries, for each query calculate the sum of elements in the given Range
 */
public class NElementsQqueries {
    public static void main(String[] args) {
        NElementsQqueries nElementsQqueries = new NElementsQqueries();
        int arr[]= {1,2,3,4,5,6,7};

        calculateSumInGivenRange(arr,5,6);
    }
    public static int calculateSumInGivenRange(int arr[], int startIndex, int endIndex) {
        int prefixSum[] = new int[arr.length];
        prefixSumCalculator(arr,arr.length-1,prefixSum);
        if(startIndex<0 || endIndex > prefixSum.length-1) {
            System.out.println("Not a valid Range");
            return 0;
        }
        if(startIndex == 0 && endIndex <= prefixSum.length-1) {
            System.out.println("Sum of Elements in the Range from "+startIndex+" to "+endIndex+ " is : "+ prefixSum[endIndex]);
            return prefixSum[endIndex];
        }
        System.out.println("Sum of Elements in the Range from "+startIndex+" to "+endIndex+ " is: "+( prefixSum[endIndex]-prefixSum[startIndex-1]));
        return prefixSum[endIndex]-prefixSum[startIndex-1];

    }
    public static void prefixSumCalculator(int arr[], int index,int prefixSum[]) {
        if(prefixSum == null) {
            prefixSum = new int[arr.length];
        }
        if(index == 0) {
            prefixSum[index] = arr[index];
            return;
        }
        prefixSumCalculator(arr,index -1, prefixSum);
        prefixSum[index] = prefixSum[index-1]+ arr[index];
    }
}
