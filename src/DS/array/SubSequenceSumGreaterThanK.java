package DS.array;
import java.util.*;
public class SubSequenceSumGreaterThanK {
    public static void main(String[] args) {
        int arr[]  ={14,4,6,6,20,8,5,6,8,12,6,10,14,9,17,16,9,7,14,11,14,15,13,11,10,18,13,17,17,14,17,7,9,5,10,13,8,5,18,20,7,5,5,15,19,14};
        int result  = numSubseq(arr, 9);
        System.out.println("result is::"+ result);

    }

    public static int numSubseq(int[] nums, int target) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<Integer> result2 = new ArrayList<Integer>();
         findSubSeq(nums, target,0,result, result2);
         return result2.size();
    }

    public static void findSubSeq(int [] nums, int target, int currentIndex, ArrayList<Integer> res, ArrayList<Integer> res2){
        if (currentIndex >= nums.length) {
            //printSubArray(res);
           // System.out.println("");
            int currentElementCount  = calculateSumMinMax(res);
            if (currentElementCount<=target && res.size()>0) {
                 res2.add(1);
                 return;
            } else {
                return;
            }
        }

        findSubSeq(nums, target, currentIndex+1,res, res2);
        res.add(nums[currentIndex]);
        findSubSeq(nums, target, currentIndex+1,res, res2);
        res.remove(res.size()-1);
    }

    public static int calculateTheSumOfArray( ArrayList<Integer> input){
        int count = 0;
        for(Integer num: input) {
            count+=num;
        }
        return count;
    }
    public static void printSubArray(ArrayList<Integer> input) {
        for(Integer num: input) {
            System.out.print(num+",");
        }
    }

    public static int calculateSumMinMax(ArrayList<Integer> input) {
        return calculateMin(input) + calculateMax(input);
    }
    public static int calculateMin(ArrayList<Integer> input) {
        int min = Integer.MAX_VALUE;
        for(Integer num: input) {
          min = Math.min(num, min);
        }
        return min;
    }
    public static int calculateMax(ArrayList<Integer> input) {
        int max = Integer.MIN_VALUE;
        for(Integer num: input) {
            max = Math.max(num, max);
        }
        return max;
    }
}
