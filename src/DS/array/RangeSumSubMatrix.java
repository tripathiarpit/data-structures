package DS.array;

import java.util.Scanner;

/*
Given a 2D matrix and Q queries, for each query find the sub-mtrix sum.
Each Query represents the 2 elements. A: Top Left Index Of Element in matrix, B: Bottom Right Index Of Element in matrix
 */
public class RangeSumSubMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Queries");
        int queries = scanner.nextInt();

        int arr[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        //
        for (int i = 0; i < queries; i++) {
            int topLeft[] = new int[2];
            System.out.println("Enter the X coordinate of Top Left");
            topLeft[0] = scanner.nextInt();
            System.out.println("Enter the Y coordinate  Top Left");
            topLeft[1] = scanner.nextInt();
            int bottomRight[] = new int[2];
            System.out.println("Enter the X coordinate of Bottom Right");
            bottomRight[0] = scanner.nextInt();
            System.out.println("Enter the Y coordinate  Bottom Right");
            bottomRight[1] = scanner.nextInt();
            System.out.println("Sum is:"+calculateSubMatrixSumInGivenRange(arr, topLeft, bottomRight));
        }
    }

        public static int calculateSubMatrixSumInGivenRange ( int arr[][], int topLeft[], int bottomRight[]){
        int sum = 0;
            for(int row = topLeft[0]; row<=bottomRight[0];row++) {
                for(int col = topLeft[1]; col <= bottomRight[1]; col++) {
                    sum+=arr[row][col];
                }

        }
            return sum;
    }
}