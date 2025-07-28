package DS.array;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
            int arr[ ] = {10,12,3,4,5,112,34,54,23};
            QuickSort quickSort = new QuickSort();
            quickSort.quickSort(arr, 0, arr.length-1);
            System.out.println(Arrays.stream(arr).iterator().next());
    }
    public void quickSort(int [] num, int low, int high){
        if(low >= high) {
                return;
        }
        int partitionIndex = partitionIndex(num, low, high);
        quickSort(num, low, partitionIndex -1);
        quickSort(num, partitionIndex +1, high);

    }
    public int partitionIndex(int nums[], int low, int high) {
        int pivotElement = nums[low];
        int start = low;
        int end = high;
        // 3,4,5,112,2,77,23
        while (start < end) {
        while (start <=high && nums[start] <= pivotElement) {
               start++;
          }
        while (end >= low && nums[end] > pivotElement) {
               end--;
        }
        if(start<end)
        swapElementsOfArray(nums, start, end);
        }
        swapElementsOfArray(nums,low,end);
        return end;
    }
    public void swapElementsOfArray(int [] nums, int source, int destination) {
        int temp = nums[source];
        nums[source] = nums[destination];
        nums[destination] = temp;
    }
}
