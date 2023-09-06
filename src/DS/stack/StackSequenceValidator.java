package DS.stack;
//Given two integer arrays pushed and popped each with distinct values
//        return true if this could have been the result of a sequence of push and pop operations on an initially empty stack,
//        or false otherwise.
//Input: pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
//        Output: true
//        Explanation: We might do the following sequence:
//        push(1), push(2), push(3), push(4),
//        pop() -> 4,
//        push(5),
//        pop() -> 5, pop() -> 3, pop() -> 2, pop() -> 1

//Input: pushed = [1,2,3,4,5], popped = [4,3,5,1,2]
//        Output: false
//        Explanation: 1 cannot be popped before 2.

//Constraints
//1 <= pushed.length <= 1000
//        0 <= pushed[i] <= 1000
//        All the elements of pushed are unique.
//        popped.length == pushed.length
//        popped is a permutation of pushed.
import java.util.Stack;

public class StackSequenceValidator {
    public static void main(String[] args) {
        int [] push = {1,2,3,4,5};
        int [] pop = {4,3,5,1,2};
        Stack<Integer> verifierStack = new Stack<>();
        int justPoppedIndex = 0;
        for(int i= 0; i<push.length; i++) {
            int justPushedElement = push[i];

            if(justPushedElement != pop[justPoppedIndex]) {
                verifierStack.push(justPushedElement);
            } else {
                verifierStack.push(justPushedElement);
                while (!verifierStack.empty() && justPoppedIndex < pop.length) {
                    if (verifierStack.peek() == pop[justPoppedIndex]) {
                        verifierStack.pop();
                        justPoppedIndex++;
                    } else {
                        break;
                    }
                }
            }
        }
        System.out.println(verifierStack.empty()? "Correct Operations": "Not Correct Operations");
    }
}
