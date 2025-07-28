package sorting;

import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
       MergeSort ms = new MergeSort();
        int arr[] =  {1,3,2};
        ms.mergeSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
    }
    public void mergeSort(int arr[]) {
       sort(arr, 0, arr.length-1);
    }

    public void sort(int arr[], int start , int end){
        if(start >= end) {
            return;
        }
        int mid = ((start + end) /2);
        sort(arr, start,mid);
        sort(arr, mid+1, end);
        mergeArrays(arr, start, mid,end);
    }
    public void mergeArrays(int arr[], int start, int mid, int end) {
        int left = start;
        int right = mid+1;
        ArrayList<Integer> al = new ArrayList<>();
        while (left <= mid && right <= end) {
            if(arr[left]>= arr[right]) {
                al.add(arr[left]);
                left++;
            } else {
                al.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            al.add(arr[left]);
            left++;
        }
        while (right <= end) {
            al.add(arr[right]);
            right++;
        }
        for(int i = start; i <= end; i++){
            arr[i] = al.get(i - start);
        }
    }
}
