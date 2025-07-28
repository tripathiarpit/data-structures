package DS.array;
/*
ou are given an array nums of non-negative integers. nums is considered special if there exists a number x such that there are exactly x numbers in nums that are greater than or equal to x.

Notice that x does not have to be an element in nums.

Return x if the array is special, otherwise, return -1. It can be proven that if nums is special, the value for x is unique.



Example 1:

Input: nums = [3,5]
Output: 2
Explanation: There are 2 values (3 and 5) that are greater than or equal to 2.
Example 2:

Input: nums = [0,0]
Output: -1
Explanation: No numbers fit the criteria for x.
If x = 0, there should be 0 numbers >= x, but there are 2.
If x = 1, there should be 1 number >= x, but there are 0.
If x = 2, there should be 2 numbers >= x, but there are 0.
x cannot be greater since there are only 2 numbers in nums.
Example 3:

Input: nums = [0,4,3,0,4]
Output: 3
Explanation: There are 3 values that are greater than or equal to 3.

**/

import java.util.Arrays;

public class SpecialArray {
    public static void main(String[] args) {
        int nums[] = {0,4,3,0,4};
       int answer =  specialArray2(nums);
        System.out.println("Array is special::"+ answer);
    }
    public static int specialArray(int[] nums) {
        int minNumbers = 0;
        int maxNumbers = nums.length;
        int counter = 0;
        int answer = -1;
        for(int i= minNumbers;i<=maxNumbers;i++){
            for(int j=0; j<nums.length;j++) {
                if(nums[j]>=i){
                    counter++;
                }
            }
            if(counter == i) {
                answer = i;
                break;
            } else {
                answer = -1;
                counter = 0;
                continue;
            }
        }
        return answer;
    }
    public static int specialArray2(int[] nums) {
        //Arrays.sort(nums);
        int minNumbers = 1;
        int maxNumbers = nums.length;
        int answer = -1;
        // 0,0,1,1,4,4,4,5,5,6
        // 0 0 1 2 5 9 13 18 23 29
        while(minNumbers <= maxNumbers) {
            int mid = minNumbers + ((maxNumbers - minNumbers)/2);
           int counter =  checkIfTheArrayIsSpecialForGivenNumber(nums, mid);
           if(counter == mid) {
               return  mid;
           } else if (counter < mid) {
               maxNumbers = mid -1;
           } else {
               minNumbers = mid + 1;
           }

        }
        return answer;
    }
    public static int checkIfTheArrayIsSpecialForGivenNumber(int nums[], int target) {
        int counter = 0;
        for(int i = 0; i< nums.length; i++) {
            if(nums[i] >= target) {
                counter++;
            }
        }
       return counter;
    }

}
