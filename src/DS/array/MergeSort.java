package DS.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
Given Two Sorted Array A[] and B[], Merge them and sort
 */
public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {1,3,2};
        //int arr2[] = {};
         mergerSort(arr,0, arr.length-1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
    }
//    public static int [] mergeSort(int array1[], int array2[]) {
//        if(array1.length ==0){
//            return  array2;
//        } else if(array2.length ==0) {
//            return  array1;
//        }
//        int sortedArray[] = new int[array1.length+array2.length];
//        int array1Pointer = 0;
//        int array2Pointer = 0;
//        int sortedPointer = 0;
//        // [7,10,12,14]: 4
//        // [3,8,9]: 3
//        int smallLength = array1.length < array2.length? array1.length: array2.length;
//
//          while (array1Pointer < array1.length && array2Pointer< array2.length){
//              if(array1[array1Pointer]< array2[array2Pointer]) {
//                  sortedArray[sortedPointer] = array1[array1Pointer];
//                  array1Pointer++;
//              } else {
//                  sortedArray[sortedPointer] = array2[array2Pointer];
//                  array2Pointer++;
//              }
//              sortedPointer++;
//          }
//          while (array1Pointer<array1.length) {
//              sortedArray[sortedPointer] = array1[array1Pointer];
//              array1Pointer++;
//              sortedPointer++;
//          }
//        while (array2Pointer<array2.length) {
//            sortedArray[sortedPointer] = array2[array2Pointer];
//            array2Pointer++;
//            sortedPointer++;
//        }
//        return sortedArray;
//    }
//    public static int [] mergerSort(int arr[], int start, int end, int mid){
//        int arrayStart[] = arr.
//    }

    // 3 4 5 6 100
    // 0 1 2 3
//    public static int[] mergeSort(int[] array, int low, int high) {
//        if(low >= high) {
//            int []  ans = new int[1];
//            ans[0] = array[low];
//            return  ans;
//        } else {
//            int mid = low + ((high - low) / 2);
//            int numberOne[] = mergeSort(array,low, mid);
//            int numberTwo[] = mergeSort(array,mid+1,high);
//            return mergeTwoArray(numberOne, numberTwo);
//        }
//    }
//    public static int [] mergeTwoArray(int[] array1, int array2[]) {
//        int array1Length = 0;
//        int array2Length = 0;
//        int finalArrayLength = array1.length + array2.length;
//        int mergedArray[]  = new int [finalArrayLength];
//        int mergedArrayIndex = 0;
//        while(array1Length < array1.length && array2Length < array2.length) {
//            if(array1[array1Length] <= array2[array2Length]) {
//                mergedArray[mergedArrayIndex] = array1[array1Length];
//                array1Length++;
//
//            } else {
//                mergedArray[mergedArrayIndex] = array2[array2Length];
//                array2Length++;
//            }
//            mergedArrayIndex++;
//        }
//        while(array1Length < array1.length) {
//            mergedArray[mergedArrayIndex] = array1[array1Length];
//            array1Length++;
//            mergedArrayIndex++;
//        }
//        while(array2Length < array2.length) {
//            mergedArray[mergedArrayIndex] = array2[array2Length];
//            array2Length++;
//            mergedArrayIndex++;
//        }
//        return mergedArray;
//    }


    public static void mergerSort(int array[], int low, int high) {
        if(low>=high) {
            return;
        }
        int mid = ((high + low) /2);
        mergerSort(array, low, mid);
        mergerSort(array, mid +1, high);
        mergerArray(array, low, mid, high);
    }

    public static void mergerArray(int[]  array, int low , int mid, int high) {
        // {3,34,60,6, 2,100,0,0};
        int left = low;
        int right = mid + 1;

        ArrayList<Integer> al = new ArrayList<>();


        while(left <= mid && right <= high) {
            if(array[left]<= array[right]) {
                al.add(array[left]);
                left++;
            } else {
                al.add(array[right]);
                right++;
            }

        }
        while(left<= mid) {
            al.add(array[left]);
            left++;

        }
        while(right<=high) {
            al.add(array[right]);
            right++;
        }


        for(int i = low; i<= high; i++) {
            array[i] = al.get(i- low);
        }
    }

}
