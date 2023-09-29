package DS.dp;
////You are climbing a staircase. It takes n steps to reach the top.
////
////        Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
//Example 1:
//
//        Input: n = 2
//        Output: 2
//        Explanation: There are two ways to climb to the top.
//        1. 1 step + 1 step
//        2. 2 steps
//        Example 2:
//
//        Input: n = 3
//        Output: 3
//        Explanation: There are three ways to climb to the top.
//        1. 1 step + 1 step + 1 step
//        2. 1 step + 2 steps
//        3. 2 steps + 1 step
public class Xways {
    public static void main(String[] args) {
        Xways sol = new Xways();

        System.out.println("Ways:"+ sol.climbStairs(5));
    }
    Integer arr[] ;
    public int climbStairs(int n) {
        arr = new Integer[n+1];
      return climb(n);

    }

    public Integer climb(int n) {
        if(n==0 || n==1) {
            return n;
        }
        if(n==2) {
            return 2;
        }
        if(arr[n]!=null) {
            return arr[n];
        }
        int one = climb(n-1);
        int two = climb(n-2);
        int ans = one + two;
        arr[n] = ans;
        return ans;
    }
}
