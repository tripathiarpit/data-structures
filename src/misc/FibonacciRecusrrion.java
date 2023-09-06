package misc;

import java.util.Scanner;

public class FibonacciRecusrrion {
    public static void main(String[] args) {
        System.out.println("Enter position");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for(int i=0; i< number;i++) {
            System.out.print(FibonacciRecusrrion.printFibonacci(i)+ " ");
        }

    }
    public static int printFibonacci(int num) {
        if(num <=1)
            return num;

       return printFibonacci(num-1) + printFibonacci(num -2);
    }
}
