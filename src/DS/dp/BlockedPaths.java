package DS.dp;

import java.util.Scanner;

public class BlockedPaths {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int col = scan.nextInt();
        int arr[][] = new int[rows][col];
        for(int i=0; i <rows;i++) {
            for(int j=0; j<col; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

    }

    public static int countPaths(int[][] arr, int i, int j, Integer[][] dp) {
        if(arr[i][j] == 0) {
            return 0;
        }
        if(i ==0 || j==1) {
            return 1;
        }
        if( dp[i][j]!=null) {
            return  dp[i][j];
        }
        dp[i][j] = countPaths(arr,i-1, j, dp) + countPaths(arr, i, j-1, dp);
        return  dp[i][j];
    }

    public static int cal(int[][] arr, int rows, int cols) {
        Integer[][] dp = new Integer[rows+1][cols+1];
        return countPaths(arr,rows-1, cols-1,dp);
    }
}
