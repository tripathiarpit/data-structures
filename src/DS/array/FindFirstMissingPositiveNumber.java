package DS.array;
/*
We have given an Array of length N, find the first missing positive number
arr[5]:  -4,-2,5,7,8
 */
public class FindFirstMissingPositiveNumber {


    public static void main(String[] args) {
        int arr[]= {1,2,0};
        System.out.println("The missing +ve number is ::"+findTheFirstMissingPositiveNumber(arr));
    }
    public static  int findTheFirstMissingPositiveNumber(int nums[]) {
        int lastPossibleAnswer = nums.length+1;
        int answer = lastPossibleAnswer;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]<=0 || nums[i]>=nums.length+1) {
                nums[i] = lastPossibleAnswer;
            }
        }
        for(int i=0; i<nums.length; i++) {
            if(Math.abs(nums[i]) == lastPossibleAnswer) {

                continue;
            }
            int indexOfElement = Math.abs(nums[i])-1;
            if(nums[indexOfElement]>0){
                nums[indexOfElement]= - nums[indexOfElement];
            }
        }
        for(int i=0; i<nums.length; i++) {
            if(nums[i]>0){
                answer = i+1;
                break;
            }
        }
        return answer;
    }
}
