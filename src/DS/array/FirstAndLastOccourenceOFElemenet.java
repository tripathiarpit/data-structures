package DS.array;

public class FirstAndLastOccourenceOFElemenet {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,6,6,6,6,7,8,10};
        FirstAndLastOccourenceOFElemenet code = new FirstAndLastOccourenceOFElemenet();
        int target = 102;
        int lb = code.findLowerBound(arr, target);
        int ub = code.findUpperBound(arr, target);
        if(lb== arr.length || arr[lb]!= target){
            System.out.println("{-1,-1}");
        } else {
            System.out.println("{"+lb+","+(ub-1)+"}");
        }

    }
    /* Agar element mil gaya to uska index return hoga , else usse just ek bade element ka index return hoga
    * The small value of index sunch that arr[index]>= target
    * */

    public int findLowerBound(int arr[], int target) {
        int low = 0;
        int high = arr.length -1;
        int answer = arr.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] >= target) {
                answer = mid;
                high = mid -1;
            }
            else {
                low = mid +1;
            }
        }
        return answer;

    }

    public  int findUpperBound(int arr[], int target) {
        int low = 0;
        int high = arr.length -1;
        int answer = arr.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] > target) {
                answer = mid;
                high = mid -1;
            }
            else {
                low = mid +1;
            }
        }
        return answer;
    }
}
