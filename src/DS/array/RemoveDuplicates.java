package DS.array;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int count = 0;
        int [] nums = {0,0,1,1,2};
        for(int i=1; i < nums.length; i++) {
            if(nums[i] != nums[count]) {
                count++;
                nums[count] = nums[i];
            }
        }
        Arrays.stream(nums).forEach(System.out::println);
        System.out.println(count+1);
    }
}
