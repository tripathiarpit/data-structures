package DS.dp;
/*
iven an integer n, return the least number of perfect square numbers that sum to n.

A perfect square is an integer that is the square of an integer; in other words, it is the product of some integer with itself.
For example, 1, 4, 9, and 16 are perfect squares while 3 and 11 are not.
 */
public class MinSquares {
    public static void main(String[] args) {
        MinSquares minSquares = new MinSquares();
        System.out.println("Min Squares"+minSquares.numSquares(12));
    }
        Integer arr[];
        public int calc( Integer arr[],int n) {
            if(n ==0 || n==1) {
                return n;
            }
            if(arr[n]!= null) {
                return arr[n];
            }
            int small = Integer.MAX_VALUE;
            for(int i=1; i*i<=n;i++) {
                int result = calc(arr, n-i*i);
                small = Math.min(result,small);
            }
            arr[n] = small +1;
            return small+1;
        }
        public int numSquares(int n) {
            arr = new Integer[n+1];
            arr[0] = 0;
            arr[1] =1;
            return calc(arr, n);
        }
}
