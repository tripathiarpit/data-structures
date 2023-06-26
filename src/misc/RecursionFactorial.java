package misc;

public class RecursionFactorial {


    public int calculateFactorial2(int number) {
        if(number ==1 || number ==0) {
            System.out.println("yamini");
            return 1;
        }
        else {
            int res = number * calculateFactorial2(number-1);
            System.out.println(res);
           return  res;
        }
    }
    public void showMyName() {
        System.out.println("Hello Arpit We are callin recursion");
        System.out.println("Factorial Is"+this.calculateFactorial2(6));
    }

    public static void main(String[] args) {
        RecursionFactorial recursionFactorial = new RecursionFactorial();
        //System.out.println("ONE"+ recursionFactorial.calculateFactorial(5));
        recursionFactorial.showMyName();

    }
}


