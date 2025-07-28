package DS.string;

//You are given two strings s and t of the same length and an integer maxCost.
//
//        You want to change s to t. Changing the ith character of s to ith character of t costs |s[i] - t[i]|
//        (i.e., the absolute difference between the ASCII values of the characters).
//
//        Return the maximum length of a substring of s that can be changed
//        to be the same as the corresponding substring of t with a cost less than or equal to maxCost.
//        If there is no substring from s that can be changed to its corresponding substring from t, return 0.


public class SubStringBudget {
    public static void main(String[] args) {
        equalSubstring();
    }
    public static void equalSubstring() {
        String one = "krrgw";
        String two = "zjxss";
        int maxCost = 19;
        int costTillCurrentIndex = 0;
        costTillCurrentIndex = findMaxLengthForCost(one.toCharArray(), two.toCharArray(),0, costTillCurrentIndex, maxCost);
        System.out.print("Cost till Current Index::"+ costTillCurrentIndex);
        //  costTillCurrentIndex;
    }

    public static int findMaxLengthForCost(char[] s, char[] t,int currentIndex,int costUntilNow, int maxCost) {
        int sumNow = (costUntilNow + Math.abs(s[currentIndex] - t[currentIndex])) > maxCost? 1:0 ;

        if(currentIndex >= s.length-1){
            if(sumNow <=maxCost){
                return currentIndex +1;
            }
            return currentIndex;
        }
        currentIndex =  findMaxLengthForCost(s, t, currentIndex +1, sumNow,maxCost);
        return currentIndex;
    }
}
