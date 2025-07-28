package DS.array;

public class FactorialRecursion {
    public static void main(String[] args) {
        System.out.println("The Factorial of Number is::"+ findFactorial(5));
    }
    public static int findFactorial(int number){
        if(number == 1) {
            return  1;
        }
        int answer = number + findFactorial(number - 1);
        return answer;
    }


}
