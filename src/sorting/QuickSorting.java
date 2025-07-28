package sorting;

public class QuickSorting {
    public static void main(String[] args) {
        int arr[] = {10,6,7,4,9,15,18,16,17,-2};

//        rearrange(arr,0, arr.length-1);
        quickSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
    }

//    public static void quickSort(int arr[], int start, int end) {
//        if(start>=end) {
//            return;
//        }
//        int position = rearrange(arr,start,end);
//        quickSort(arr,start,position-1);
//        quickSort(arr,position+1,end);
//    }
//    private static int rearrange(int arr[], int start, int end) {
//        int p1 = start +1;
//        int p2 = end;
//        while(p1<=p2) {
//                    if(arr[start]>= arr[p1]) {
//                        p1++;
//                    } else if(arr[start]< arr[p2]) {
//                        p2--;
//                    }
//                    else {
//                        int temp = arr[p1];
//                        arr[p1] = arr[p2];
//                        arr[p2] = temp;
//                        p1++;
//                        p2--;
//                    }
//                }
//        int temp = arr[start];
//        arr[start] = arr[p2];
//        arr[p2] = temp;
//        return p2;
//    }

    public static void quickSort(int arr[], int start, int end) {
        if(start >= end){
            return;
        }
        int pivotIndex = findThePivotIndex(arr, start, end);
        quickSort(arr,start, pivotIndex);
        quickSort(arr, pivotIndex+1, end);
    }

    // 1 2 6 4 0 9 8 7
    // 0 1 2 3 4 5 6 7
    // start 0 end 7
    public static int findThePivotIndex(int arr[], int start, int end) {
                int pivotElement = arr[start];
                int low = start + 1;
                int high = end;

                while(low <= high) {

                    if(pivotElement > arr[low]) {
                        low ++;
                    } else if(pivotElement < arr[high]){
                        high --;
                    } else {
                        int temp = arr[low];
                        arr[low] = arr[high];
                        arr[high] = temp;
                        low ++;
                        high --;
                    }
                }
                int temp  = arr[high];
                arr[high] = arr[start];
                arr[start] = temp;
                return  high;
    }
}
