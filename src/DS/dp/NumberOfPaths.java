package DS.dp;

public class NumberOfPaths {

    public static void main(String[] args) {
        NumberOfPaths numberOfPaths = new NumberOfPaths();
        System.out.println("Total paths"+ numberOfPaths.numberOfPaths(2,2));
    }
    Integer dp[][];

    long numberOfPaths(int m, int n) {
        dp = new Integer[m][n];
        return calc(m,n,dp);

    }

    public int calc(int m , int n, Integer dp[][]) {
        if(m==0 || n==0) {
            return 1;
        }
        if(dp[m-1][n-1]!=null) {
            return dp[m-1][n-1];
        }

        int pathx = calc(m,n-1, dp);
        int pathy = calc(m-1,n, dp);
        dp[m-1][n-1] = pathx + pathy;
        return pathx +pathy;
    }
}


