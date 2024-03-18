package DS.array;

import java.util.Scanner;

public class Rotate90DegreeAntiClock {
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
        transpose(arr);
        exchangeRows2(arr);
        for(int i=0; i<row; i++) {
            for( int j=0;j<row;j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println("");
        }
    }

    public static void transpose(int arr[][]) {
        for(int i=1; i<arr.length; i++) {
            for( int j=0;j<i;j++) {
                int temp = arr[i][j];
                arr[i][j]= arr[j][i];
                arr[j][i]= temp;
            }
        }
    }

    public static void exchangeRows(int arr[][]) {
        for(int i=0; i<arr.length/2; i++) {


            int temp[] =   arr[i];
            arr[i] =  arr[(arr.length-1)-i];
            arr[(arr.length-1)-i] = temp;
            System.out.println("");

        }
        }


    public static void exchangeRows2(int arr[][]) {
        for(int i=0; i<arr.length/2;i++) {
            // 1 2 3 77
            // 4 5 6 54
            // 7 8 9 23
            // 10 11 12 22
            // TRASPOSE
            // 1 4 7 10
            // 2 5 8 11
            // 3 6 9 12
            // 77 54 23 22
            int row[] = arr[arr.length-1-i];
            arr[arr.length-1-i]= arr[i];
            arr[i] = row;

        }
    }
}

