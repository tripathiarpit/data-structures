package DS.array;

import java.util.Scanner;

public class Rotate90Degree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Dimension");
        int row = scanner.nextInt();

        int arr[][] = new int[row][row];
        for(int i=0; i<row; i++) {
            for( int j=0;j<row;j++) {
                System.out.println("Enter Value");
                arr[i][j] = scanner.nextInt();
            }
        }

        for(int i=1; i<row; i++) {
            for( int j=0;j<i;j++) {
                int temp = arr[i][j];
            arr[i][j]= arr[j][i];
            arr[j][i]= temp;

            }
        }

        System.out.println("After Transposing");
        for(int i=0; i<row; i++) {
            for( int j=0;j<row;j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println("");
        }
        for(int i=0; i<row; i++) {
            arr[i]= reverse(arr[i]);
        }





        System.out.println("After Rotating");
        for(int i=0; i<row; i++) {
            for( int j=0;j<row;j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println("");
        }



    }
    public static int[] reverse(int arr[]) {
        int rev[] = new int[arr.length];
        for(int i=arr.length-1;i>-1;i--) {
            rev[(arr.length-1)-i]=arr[i];
        }
        return rev;
    }
}
