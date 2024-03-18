package DS.array;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Columns");
        int col = scanner.nextInt();
        System.out.println("Enter the number of Rows");
        int row = scanner.nextInt();
        int arr[][] = new int[col][row];
        for(int i=0; i<row; i++) {
          for( int j=0;j<col;j++) {
              System.out.println("Enter Value");
              arr[i][j] = scanner.nextInt();
          }
        }
        for(int i=0; i<row; i++) {
            for( int j=0;j<col;j++) {
                System.out.print(arr[i][j]+ " ");

            }
            System.out.println("");
        }

        /* 1 2 3      1 4 7
           4 5 6      2 5 8
           7 8 9      3 6 9
         */

        for(int i=1; i<row; i++) {
            for( int j=0;j<i;j++) {
                int num = arr[i][j];
               arr[i][j]= arr[j][i];
               arr[j][i] = num;
            }
        }
        System.out.println("After Transposing");
        for(int i=0; i<row; i++) {
            for( int j=0;j<col;j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println("");
        }
    }
}
