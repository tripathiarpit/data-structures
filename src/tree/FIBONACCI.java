package tree;

public class FIBONACCI {
    public static void main(String[] args) {
        FIBONACCI fb = new FIBONACCI();
        int counter =5;
        while(counter>0){
            System.out.println(fb.printFibonacci(counter));
            counter--;
        }

    }
    public int  printFibonacci(int number){
        if(number==0 ) {
            return 0;
        }
        if(number ==1) {
            return 1;
        }
        int fib1= printFibonacci(number-1);
        int fib12 = printFibonacci(number-2);
        return fib1+fib12;
    }
}
