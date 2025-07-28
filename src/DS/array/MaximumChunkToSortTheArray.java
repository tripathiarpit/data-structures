package DS.array;

import java.util.Arrays;

/*
Given an Array of size N, having distinct integers from 0 to N-1.
We need to split the array into maximum possible CHUNKS ,such that sorting each chunk, makes the array Sorted.
Array[5] = {1,0,2,3,4}.
{ [1,0], [2], [3], [4]}  , Ans =4 Chunks

{-2,-3,1,4,3,6,7,-5,8}



2nd Part:
Given an Array of size N, having  integers from -infinity to InfinityCalculate Chunks
 */
public class MaximumChunkToSortTheArray {
    public static void main(String[] args) {
        int unsortedArray[] = {1,0,2,3,4};
//        System.out.println("Maximum Required Chunks are:"+
//                new MaximumChunkToSortTheArray().calculateMaxChunksToSort(unsortedArray));
        int unsortedArray2[] =   {-2,-3,1,4,3,6,7,-5,8};
        System.out.println("Maximum Required Chunks are:"+
                new MaximumChunkToSortTheArray().calculateMaxChunksToSortFromAnyIntegers(unsortedArray2));
    }

    public int calculateMaxChunksToSort(int arr[]){
        //{2,0,1,4,3,6,7,5,8}
        int maxRequiredChunks = 0;
        int maxFromRange = -1;
        for (int i = 0; i < arr.length; i++) {
            maxFromRange= Math.max(maxFromRange,arr[i]);
                  if(maxFromRange == i) {
                      maxRequiredChunks++;
                  }
        }
        return  maxRequiredChunks;
    }

    public int calculateMaxChunksToSortFromAnyIntegers(int arr[]){

        int maxRequiredChunks = 0;
        int maxFromRange = Integer.MIN_VALUE;
        int intMinFromRange = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            maxFromRange = Math.max(maxFromRange,arr[i]);
            intMinFromRange = findMinTillIndex(i+1, arr.length, arr);
            if(maxFromRange <intMinFromRange) {
                maxRequiredChunks++;
            }
        }
        return  maxRequiredChunks;
    }





    public int findMinTillIndex(int startIndex, int endIndex, int arr[]) {
            // {2,0,1,4,3,6,7,5,8}
        int minFromRange = Integer.MAX_VALUE;
        for(int start = startIndex; start<endIndex; start++) {
            if(arr[start] < minFromRange) {
                minFromRange = arr[start];
            }
        }
        return minFromRange;
    }
}
