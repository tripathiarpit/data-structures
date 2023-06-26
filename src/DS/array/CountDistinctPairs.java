package DS.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Given an array arr[] of size N and an integer K,
 * the task is to find the count of distinct pairs in the array whose sum is equal to K.
 */

//Input: nums = [1, 5, 1, 5, 7, 8, 9,2,4], target = 6
//        Output: 2
//        Explanation:
//        [1, 5] and [5, 1] are considered the same.


public class CountDistinctPairs {
    public int countOfDistinctPairs(int arr[], int K) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> seen = new HashSet<>();
        int counter = 0;
        for (Integer data: arr) {
            if(!seen.contains(data) && set.contains(K-data)) {
                    counter++;
                    seen.add(data);
                    seen.add(K-data);

            }
            set.add(data);
        }
    return counter;
    }
    public static void main(String[] args) {
CountDistinctPairs distinctPairs =  new CountDistinctPairs();
   int count = distinctPairs.countOfDistinctPairs(new int[]{1, 5, 1, 5, 7, 8, 9, 2, 4}, 6);
        System.out.println("Count"+ count);
    }
}
