package DS.array;
/*Given an Array A[N]

************************KADEN'S ALGO****************************8
Find the maximum Sub Array SUM.

*/

public class MaxSubArray {

    public static void main(String[] args) {
        int arr[] = {2,3,-9,4,8,-10,34};

        System.out.println("Maximum Sum of Sub Array is:"+ MaxSubArray.findMaxSubArraySum(arr));

    }
    public static int findMaxSubArraySum(int arr[]) {
        int totalSum = 0;
        int answer =  Integer.MIN_VALUE;
        for(int i= 0; i<arr.length; i++) {
            if(answer>=0) {
                answer = answer + arr[i];
            } else {
                answer = arr[i];
            }
            answer = Math.max(totalSum, answer);
        }
        return  answer;
    }

}
