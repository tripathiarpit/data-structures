package DS.array;

import java.lang.reflect.Array;
import java.util.*;

public class Subsets {
    public static void main(String[] args) {
        char arr[] = {1,2,3};
        subsets(arr);
    }
    public static List<List<String>> subsets(char[] nums) {
        List<List<String>> al = new ArrayList<>();
        List<String> output = new ArrayList<>();
        findValues(nums, 0,output, al);
        al.forEach(data->{
                System.out.println("Data"+ data);
        });
        return  null;
    }
    public static  void   findValues(char nums[], int start, List<String> output, List<List<String>> result) {
        // 1 2 3

        if(start >= nums.length) {
            result.add(new ArrayList<>(output));
            return ;
        }

        findValues(nums,start+1,output,result);

        output.add( String.valueOf((int)nums[start]));
        findValues(nums,start+1,output,result);
        output.remove(output.size()-1);

    }
    public static  void   findValuesWithPalindrome(char nums[], int start, List<String> output, List<List<String>> result) {
        // 1 2 3

        if(start >= nums.length) {
            if(output.size() != 0)
            result.add(new ArrayList<>(output));
            return ;
        }


        if(output.size()>0 && checkIftheStringIsPalindrome(output.get(start)+nums[start])) {
            output.set(start,output.get(start)+nums[start]);
        } else {
            output.add(String.valueOf(nums[start]));
        }
        findValues(nums,start+1,output,result);
        output.remove(output.size()-1);
        findValues(nums,start+1,output,result);
    }
    public static boolean checkIftheStringIsPalindrome(String input){
        for (int i = 0; i < input.length()/2; i++) {
            char first = input.charAt(i);
            char last = input.charAt(input.length() - i);
            if(first != last) {
                return  false;
            }
        }
        return true;
    }
}
