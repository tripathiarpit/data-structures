package misc;

public class Palindrome {
    public static void main(String[] args) {
        char [] chars = {1,2,3,3,2,1};
        System.out.println("Is palindrome?:"+Palindrome.checkPalindrome(chars, 0, chars.length-1));
    }
    public static boolean checkPalindrome(char[] array, int start, int end) {
        // 123321
        if(start == (array.length/2)-1){
            return array[start] == array[end];
        }
        boolean  ans  = checkPalindrome(array, start+1, end-1);
        if(ans){
            return  array[start] == array[end];
        } else {
            return false;
        }

    }
}
