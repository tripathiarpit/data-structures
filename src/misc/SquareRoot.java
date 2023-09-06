package misc;

public class SquareRoot {
    public static void main(String[] args) {

        int a = -10;
        int n = -2;
        if(n>=0) {
            System.out.println("Square"+SquareRoot.calculatePow(a,n));
        } else {
            n = n - n - n;
            System.out.println("Square"+(double)1/SquareRoot.calculatePow(a,n));
        }

    }

    public static int calculatePow(int a, int num) {

        if(num ==1 ) {
            return a;
        }
        if(num == 0) {
            return 1;
        }

        int answer = SquareRoot.calculatePow(a,num/2);
        if(num % 2 == 0) {
            return answer * answer;
        } else {
            return answer * answer * a;
        }

    }
}



