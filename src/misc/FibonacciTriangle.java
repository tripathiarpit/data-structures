package misc;
import java.util.*;
public class FibonacciTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num of Rows:");
        int rows = scanner.nextInt();
        int sum=0;
        int prev = 0;
        int next =1;
        for(int i = 0; i < rows; i++) {
            for(int j=0; j <= i; j++) {
                if(i==0){
                    System.out.print("0 ");
                } else if(i==1 && j==0) {
                    System.out.print("1 ");
                } else {
                    sum = prev +next;
                    System.out.print(sum+" ");
                    prev = next;
                    next = sum;
                }
            }
            System.out.println("");
        }
    }
}
