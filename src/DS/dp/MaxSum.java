package DS.dp;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//You are given three integers X, Y and Z and two arrays A and B both of length N. You are also
//        given an integer sum which is initially equal to 0.
//        You must perform N operations and in each ith operation you must do only one of the
//        following:
//
//        1. Subtract B[i] from sum.
//        2. Decrease both of X and Y by 1, then add A[i] * X * Y *Z to sum.
//        3. Decrease both of Y and Z by 1, then add A[i] * X * Y *Z to sum.
//
//        However, after each operation, X, Y and Z must all remain greater than or equal to 0.
//
//        Find the maximum sum you can obtain after performing all operations..
//
//Sample output:
//        0
//
//        Explanation:
//        Here, N = 2, X = 1, Y = 2, Z = 2
//        A = [0, 0]
//        B = [10, 5]
//        It is given that in starting, sum = 0
//
//        operation 1:
//        Apply type 2 operation (i.e. Decrease both of X and Y by 1, then
//        add A[1]*X*Y*Z to sum)
//        X = 0, Y = 1, Z = 2
//        sum = sum + 0*0*1*2 = 0
//
//        operation 2:
//        Apply type 3 operation (i.e. Decrease both of Y and Z by 1,
//        then add A[2]*X*Y*Z to sum)
//        X = 0, Y = 0, Z = 1
//        sum = sum + 0*0*0*1 = 0
//
//        Hence, answer is the final value of sum i.e. sum = 0
public class MaxSum {
    static Map<String, Integer> memo = new HashMap<>();
    public static void main(String[] args) {
        int x=4,y=4,z =4;
        int sum = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int arrayLength = scan.nextInt();
        int array1[] = new int[arrayLength];
        int array2[] = new int[arrayLength];
        System.out.println("Enter Elements into Array");
        for(int i = 0; i< arrayLength; i++) {
            array1[i] = scan.nextInt();
            array2[i] = scan.nextInt();
        }
        MaxSum test = new MaxSum();
        System.out.println("Max Sum is::" +test.maxSum(array1,array2,x,y,z,sum,0));

    }
    public  int maxSum(int arr1[], int arr2[], int x, int y, int z, int sum, int opsNum) {

        if(opsNum == arr1.length)
            return sum;
        if( x <0 || y<0 || z<0)
            return sum;
        String key =x+","+y+","+z+","+opsNum;

         if(memo.containsKey(key)) {
             return memo.get(key);
         }
        //        1. Subtract B[i] from sum.
//        2. Decrease both of X and Y by 1, then add A[i] * X * Y *Z to sum.
//        3. Decrease both of Y and Z by 1, then add A[i] * X * Y *Z to sum.


         int tempArray[] = arr2.clone();
        tempArray[opsNum]=sum - tempArray[opsNum];
        int ops1 = maxSum(arr1,tempArray,x,y,z,sum,opsNum+1);
        int ops2 = maxSum(arr1,arr2,x-1,y-1,z, sum+arr1[opsNum] * x-1 * y-1 *z,opsNum+1);
        int ops3 = maxSum(arr1,arr2,x,y-1,z-1,sum + arr1[opsNum] * x * y-1 *z-1,opsNum+1);
        int result = Math.max(Math.max(ops1,ops2),ops3);
        memo.put(key,result);
        return result;
    }
}
