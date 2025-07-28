package DS.string;

public class PalindromeRecurrsion {
    public static void main(String[] args) {
        String inputString = "NAANNAAN"; // NAANNAAN
        boolean isPalindrome = checkPalindrome(inputString, 0, inputString.length() -1);
        System.out.println("Is String a palindrome:"+ isPalindrome);

    }
    public static boolean checkPalindrome(String inputString, int start, int end) {
        if(start > end) {
            return  true;
        }
        if (inputString.charAt(start) == inputString.charAt(end)) {
           return checkPalindrome(inputString, start +1, end -1);
        } else {
            return  false;
        }
    }
}
