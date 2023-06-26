package misc;/*
A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.
 */

public class HappyNumber {

    public boolean isHappy(int number) {
        int sum  = 0;

        while(number!=0) {
            int digit = number%10;
            System.out.println("Last Digit::"+ digit);
            sum = sum + digit*digit;
            System.out.println("Sum::"+sum);
            number= number/10;
            if(sum==1 && number==0) {
                System.out.println("Sum Is 1");
                return true;
            }
            else if(number==0 && sum!=0) {
                if(sum<=4){
                    return false;
                }
                number = sum;
                sum= 0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        HappyNumber happyNumberc= new HappyNumber();
        happyNumberc.isHappy(2);
    }
}
