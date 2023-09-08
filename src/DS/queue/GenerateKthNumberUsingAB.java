package DS.queue;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateKthNumberUsingAB {
    public static void main(String[] args) {
        GenerateKthNumberUsingAB generateKthNumberUsingAB = new GenerateKthNumberUsingAB();
        System.out.println("Kth Element is"+generateKthNumberUsingAB.generateKthElement(5));
    }

    public String generateKthElement(int k) {
        Queue<String> generationQueue = new LinkedList<>();
        String ans = "";
        generationQueue.add("1");
        generationQueue.add("2");
        for(int i= 0; i<k;i++) {
            String temp = generationQueue.remove();
            ans = temp;
            generationQueue.add(ans+"1");
            generationQueue.add(ans+"2");
        }
        return ans;
    }
}
