package DS.array;

public class MaxSumSubArray {
    public static void main(String[] args) {
        int arr[]= {-5,4,-1,7,8};
        MaxSumSubArray maxSubArray = new MaxSumSubArray();
        System.out.println("Maximum Sub Array SUm is"+ maxSubArray.maxSubArray(arr));
    }

    public int maxSubArray(int[] nums) {
        return  findMaxBetweenRange(nums,0,nums.length-1);
    }
    public int findMaxBetweenRange(int[] nums, int start, int end) {
        if(start == end) {
            return nums[start];
        }
        int mid = (start + end )/2;
        int leftMax = findMaxBetweenRange(nums, start, mid);
        int rightMax = findMaxBetweenRange(nums,mid+1, end);
        int crossMax = findMaxOfCross(nums,start, end, mid);
        return leftMax>rightMax? (leftMax>crossMax? leftMax: crossMax): (rightMax>crossMax? rightMax: crossMax);
    }
    public int findMaxOfCross(int[] nums, int left,int right,int mid) {
        int rightMax = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = mid; i >=left ; i--) {
            currentSum+= nums[i];
            rightMax = Math.max(rightMax,currentSum);
        }
        currentSum= 0;
        int leftMax = Integer.MIN_VALUE;
        for (int i = mid+1; i <= right ; i++) {
            currentSum+= nums[i];
            leftMax = Math.max(leftMax,currentSum);
        }
        return rightMax + leftMax;
    }
}

