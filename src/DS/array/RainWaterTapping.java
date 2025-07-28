package DS.array;

import java.util.Arrays;

//Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
//Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
//        Output: 6
//        Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
//        Example 2:
//
//        Input: height = [4,2,0,3,2,5]
//        Output: 9
public class RainWaterTapping {
    public int trap(Integer [] height) {
        int tappedWater = 0;
        int prefixMax[] = calculatePrefixMax(height);
        int suffixMax[] = calculateSuffixMax(height);
        for (int i = 0; i < height.length; i++) {
            tappedWater = tappedWater + (Math.min(prefixMax[i],suffixMax[i]) - height[i]);
        }
        return tappedWater;
    }

    public  int [] calculatePrefixMax( Integer [] input) {
        int prefixMax[] = new int[input.length];
        int currentMax =   input[0];
        prefixMax[0] =currentMax;
        for (int pr = 1; pr < input.length; pr++) {
            prefixMax[pr] = Math.max(input[pr], currentMax);
            currentMax = prefixMax[pr];
        }
        return  prefixMax;
    }
    public  int [] calculateSuffixMax( Integer [] input) {
        int suffixMax[] = new int[input.length];
        int currentMax =  input[input.length-1];
        suffixMax[input.length-1] = currentMax;
        for (int pr = input.length -2; pr > -1; pr--) {
            suffixMax[pr] = Math.max(input[pr], currentMax);
            currentMax = suffixMax[pr];
        }
        return  suffixMax;
    }

    public static void main(String[] args) {
        RainWaterTapping rainWaterTapping = new RainWaterTapping();
        Integer[] arr = {4,2,0,3,2,5};

        System.out.println(rainWaterTapping.trap(arr));
    }
}
