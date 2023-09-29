package DS.queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseKElementsFromQueue {


    public static void main(String[] args) {
        Queue<Integer> sourceQueue = new LinkedList<>();
        Stack<Integer> sourceStack = new Stack<>();
        for (int i=0; i<10;i++) {
            sourceQueue.add(i);
        }
        System.out.println("Before Reverse");
        sourceQueue.stream().forEach(e -> System.out.print(e + ", "));
        int noOfElements = 4;
        for (int i=0; i<noOfElements;i++) {
            sourceStack.push(sourceQueue.remove());
        }
        while(!sourceStack.empty()) {
            sourceQueue.add(sourceStack.pop());
        }
        for (int i=0; i<sourceQueue.size() - noOfElements;i++) {
            sourceQueue.add(sourceQueue.remove());
        }
        System.out.println("After Reverse");
        sourceQueue.stream().forEach(e -> System.out.print(e + ", "));
    }
}
