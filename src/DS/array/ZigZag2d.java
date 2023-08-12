package DS.array;

import java.util.Scanner;

public class ZigZag2d {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int rows = scan.nextInt();
        int col = scan.nextInt();
        int arr[][] = new int[rows][col];
        for(int i= 0; i< rows; i++) {
            for(int j=0; j<col; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        for(int i = 0; i< rows;i++) {
            if (i % 2 == 0) {
                for(int j = col-1; j>0; j--) {
                    System.out.print(arr[i][j]+ " ");
                }
            } else {
                for(int j = 0; j<col; j++) {
                    System.out.print(arr[i][j]+ " ");
                }
            }
            System.out.println("");
        }


    }
}
