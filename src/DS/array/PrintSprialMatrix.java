package DS.array;

import tree.TreeNode;

import java.util.*;

public class PrintSprialMatrix {

    public static void main(String[] args) {


        int arr[][] = {
                {1, 2, 3, 4,77},
                {5, 6, 7, 8,34},
                {9, 10, 11, 12,32}
        };
        printSprial(arr);

    }

    public static void printSprial(int arr[][]) {
        int i =0, j=0;
        int rows = arr.length-1;
        int cols =  arr[1].length-1;
        while(rows >=1 && cols>=1) {
            for(int x=0 ;x<cols; x++) {
                System.out.print(arr[i][j]+",");
                j++;
            }
            System.out.println("");
            for(int x=0 ;x<rows; x++) {
                System.out.print(arr[i][j]+",");
                i++;
            }
            System.out.println("");
            for(int x=0 ;x<cols; x++) {
                System.out.print(arr[i][j]+",");
                j--;
            }
            System.out.println("");
            for(int x=0 ;x<rows; x++) {
                System.out.print(arr[i][j]+",");
                i--;
            }
            i++;
            j++;
            rows-=2;
            cols -=2;
            System.out.println("");
        }
        System.out.println("");
        if(rows ==0 ) {
            for(int x=0 ;x<=cols; x++) {
                System.out.print(arr[i][j]+",");
                j++;
            }
        }
        else if(cols ==0 ) {

            for(int x=0 ;x<=rows; x++) {
                System.out.print(arr[i][j]+",");
                i++;
            }
        }
    }
}
