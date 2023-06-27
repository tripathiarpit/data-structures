package DS.searching;

public class BinarySearch {

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        System.out.println("Key is present at:"+binarySearch.searchKey(new int[]{1,2,4,7,8,9,10}, 0));
    }

    public int searchKey(int arr[], int key) {
        if (arr == null) {
            return -1;
        }

        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (key < arr[mid]) {
                end = mid -1;
            }
            if (key > arr[mid]) {
                start = mid + 1;
            }
        }
        return -1;
    }
}