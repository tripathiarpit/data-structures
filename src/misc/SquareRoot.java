package misc;

public class SquareRoot {
    public static void main(String[] args) {

//        int a = -10;
//        int n = -2;
//        if(n>=0) {
//            System.out.println("Square"+SquareRoot.calculateUnderRoot(a,n));
//        } else {
//            n = n - n - n;
//            System.out.println("Square"+(double)1/SquareRoot.calculateUnderRoot(a,n));
//        }
        System.out.println("Power::"+SquareRoot.calculatePower(2,4));

    }

    public static int calculateUnderRoot(int a, int num) {

        if(num ==1 ) {
            return a;
        }
        if(num == 0) {
            return 1;
        }

        int answer = SquareRoot.calculateUnderRoot(a,num/2);
        if(num % 2 == 0) {
            return answer * answer;
        } else {
            return answer * answer * a;
        }

    }
    public static int calculatePower(int number, int power) {

      // BASE CASE
        if(power == 0) {
            return 1;
        } else if( power == 1) {
            return number;
        }
       int answer =  calculatePower(number, power-1);
        answer*= number;
        return  answer;

    }
}



