package DS.searching;

public class FirstLastPosOfElement {
    public static void main(String[] args) {
        FirstLastPosOfElement firstLastPosOfElement = new FirstLastPosOfElement();
        System.out.println("First Occurrence:" +
                firstLastPosOfElement.findFirstOccurrence(new int[]{10,11,12,12,24,25,25,49,50}, 25));
        System.out.println("Last Occurrence:" +
                firstLastPosOfElement.findLastOccurrence(new int[]{10,11,12,12,24,25,25,49,50}, 25));
    }

    public int findFirstOccurrence(int arr [], int key){
        int start = 0;
        int end = arr.length;
        int mid  = start + (end - start)/2;
        int answer = -1;
        while(start <=end) {

            if(arr[mid] == key) {
                answer = mid;
                end = mid -1;
            } else if (key < arr[mid]) {
                end = mid -1;
            }else {
                start = mid +1;
            }
            mid = start + (end - start)/2;
        }
        return answer;
    }
    public int findLastOccurrence(int arr [], int key){
        int start = 0;
        int end = arr.length;
        int mid  = start + (end - start)/2;
        int answer = -1;
        while(start <=end) {

            if(arr[mid] == key) {
                answer = mid;
                start = mid + 1;
            } else if (key < arr[mid]) {
                end = mid -1;
            }else {
                start = mid +1;
            }
            mid = start + (end - start)/2;
        }
        return answer;
    }
}
