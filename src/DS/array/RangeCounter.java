package DS.array;

public class RangeCounter {
    public static void main(String[] args) {
        int arr[] = {2147483647,-2147483648,-1,0};
        int counter = 0;
         counter = RangeCounter.calcRangeSum(arr, 0,arr.length-1, -1,0, 0);
        System.out.println("Count is"+ counter);
    }

    public static int calcRangeSum(int nums[], int low, int high, int range1, int range2 , int totalMatchedRange) {
        int counter= 0;
        if(low == high) {
            if(nums.length>1)
            return nums[low];
            else {
                if(nums[low]>= range1 && nums[low]<= range2) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
        int mid = (low + high )/2;
        int leftSum = calcRangeSum(nums,low, mid, range1, range2, totalMatchedRange);
        if(leftSum>= range1 && leftSum<= range2) {
            counter++;
            totalMatchedRange+= counter;
        }
        int rightSum = calcRangeSum(nums,mid+1, high, range1, range2, totalMatchedRange);
        if(rightSum>= range1 && rightSum<= range2) {
            counter++;
            totalMatchedRange+= counter;
        }
        int crossSum = calcCrossSum(nums,low,mid, high);


        if(crossSum>= range1 && crossSum<= range2) {
            counter++;
            totalMatchedRange+= counter;
        }

        return totalMatchedRange;
    }
    public  static  int calcCrossSum(int nums[], int low, int mid, int high) {
        int sum = 0;
        for(int i= mid; i>=low;i--) {
            sum+=nums[i];
        }
        for(int i= mid+1; i<=high;i++) {
            sum+=nums[i];
        }
        return sum;
    }
}
