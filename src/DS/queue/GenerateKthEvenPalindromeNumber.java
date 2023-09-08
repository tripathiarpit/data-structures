package DS.queue;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateKthEvenPalindromeNumber {
    public static void main(String[] args) {
        GenerateKthEvenPalindromeNumber generateKthNumberUsingAB = new GenerateKthEvenPalindromeNumber();
        System.out.println("Kth Element is:"+generateKthNumberUsingAB.generateKthPalindromElement(3));
    }
    public String generateKthPalindromElement(int k) {
        Queue<String> generationQueue = new LinkedList<>();
        String ans = "";
        generationQueue.add("11");
        generationQueue.add("22");
        for(int i= 0; i<k;i++) {
            String temp = generationQueue.remove();
            ans = temp;
            String left = ans.substring(0,ans.length()/2);
            String right = ans.substring(ans.length()/2,ans.length());
            generationQueue.add(left+ "11"+right);
            generationQueue.add(left+ "22"+right);
        }
        return ans;
    }
}
