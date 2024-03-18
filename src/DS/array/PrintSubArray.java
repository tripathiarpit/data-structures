package DS.array;

import java.util.Arrays;
import java.util.Scanner;

/*
Given an Array of Length N, print all the sub Array from Range Start and End
 */
public class PrintSubArray {
    int arr[];
    public static void main(String[] args) {
        PrintSubArray printSubArray = new PrintSubArray();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the Array");
        int length = scanner.nextInt();
        printSubArray.arr = new int[length];
        for (int i = 0; i < length; i++) {
            printSubArray.arr[i] = scanner.nextInt();
        }
        System.out.println("Enter Start Index");
        int startIndex = scanner.nextInt();
        System.out.println("Enter End Index");
        int endIndex = scanner.nextInt();
        printSubArray.returnSubArray(printSubArray.arr, startIndex, endIndex);

    }

    public void returnSubArray(int arr[], int startIndex, int endIndex) {
        if(startIndex<0 || endIndex >= arr.length) {
            System.out.println("Invalid Range");

        } else {
            int sumofAll = 0;
            for (int i = startIndex; i <= endIndex; i++) {

                for (int j = i; j <=endIndex; j++) {
                    int sumSub = 0;
                    for (int k = i; k <= j; k++) {
                        sumSub+=arr[k];
                      //  System.out.print(arr[k]+",");
                    }
                    System.out.println("SubArray Sum from:"+i+" to: " + j+" is ="+ sumSub);
                    sumofAll+=sumSub;
                }
            }
            System.out.println("Sum of all Sub Array is:"+sumofAll);

        }

    }
}
