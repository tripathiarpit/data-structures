package DS.array;
/*
Given an Array A[N] and Two Integers A and B, find the number of subarray, such that the value of the maximum number in the
Sub-array lies in the Range A to B. COUNT VALID = 0;
For Example : arr[4]: {2,1,4,3} , A=3 B=4
2---- MAX =2 , which is not in the Range
2 1  MAX =2 , which is not in the Range
2 1 4  MAX =4 , which is in the Range, COUNT VALID++
2 1 4 3 MAX =4 , which is in the Range, COUNT VALID++

1 MAX =1 , which is not in the Range
1 4 MAX =4 , which is in the Range, COUNT VALID++
1 4 3 MAX =4 , which is in the Range, COUNT VALID++
4 MAX =4 , which is in the Range, COUNT VALID++
4 3 MAX =4 , which is in the Range, COUNT VALID++
3 MAX =3 , which is in the Range, COUNT VALID++

 */
public class SubArrayMaximumCount {
    public static void main(String[] args) {
        int arr[] = {2,1,4,3};
        int lowerBound = 3, upperBound = 4;
        int totalValidSubArray = new SubArrayMaximumCount().countSubArray(arr,lowerBound,upperBound);
        System.out.println("Total number of Valid Sub Arrays are ::"+ totalValidSubArray);
    }
    public int countSubArray(int arr[], int lowerBound, int upperBound) {
        // BRUT-FORCE METHOD, TC O(n^3), SC: 1/ CONSTANT
       int  totalValidSubArray = 0;
        for(int start= 0; start < arr.length; start++) {
            // N
            for(int end=start; end< arr.length; end++) {
                // N
                int subArrayMax = Integer.MIN_VALUE;
                for(int count=start; count<=end; count++) {
                    // N
                   // System.out.print(arr[count]);
                    if(arr[count]>subArrayMax) {
                        subArrayMax = arr[count];
                    }
                }
               // System.out.println("");
                if(subArrayMax >=lowerBound && subArrayMax <=upperBound) {
                    totalValidSubArray+=1;
                }

            }
        }
        return totalValidSubArray;
    }

    public int countSubArrayOptimize(int arr[], int lowerBound, int upperBound) {
        // BRUT-FORCE METHOD, TC O(n^3), SC: 1/ CONSTANT
        int  totalValidSubArray = 0;
        for(int start= 0; start < arr.length; start++) {
            // N
            for(int end=start; end< arr.length; end++) {
                // N
                int subArrayMax = Integer.MIN_VALUE;
                for(int count=start; count<=end; count++) {
                    // N
                    // System.out.print(arr[count]);
                    if(arr[count]>subArrayMax) {
                        subArrayMax = arr[count];
                    }
                }
                // System.out.println("");
                if(subArrayMax >=lowerBound && subArrayMax <=upperBound) {
                    totalValidSubArray+=1;
                }

            }
        }
        return totalValidSubArray;
    }

}
