package DS.stack;

import java.util.Stack;

public class BalancedParanthesis {
    public static void main(String[] args) {
        BalancedParanthesis balancedParanthesis = new BalancedParanthesis();
        System.out.println(balancedParanthesis.isStringBalanced("{()}{{{(([]))}}}"));
    }

    public boolean isStringBalanced(String s) {
        Stack<Character> characterStack = new Stack<>();
        char [] characters = s.toCharArray();
        for(int i=0; i< characters.length; i++) {
            if (characters[i] == '{' || characters[i] == '(' || characters[i] == '[' ) {
                characterStack.push(characters[i]);
            } else {
                if(!characterStack.empty() && isMatchingCharacter(characters[i],characterStack.peek())) {
                    characterStack.pop();
                } else {
                    return false;
                }
            }
        }
        if (characterStack.isEmpty()) {
            return true;
        }
        return false;
    }
    public boolean isMatchingCharacter(Character a, Character b) {
        if(a =='}'){
            return b == '{';
        }
        else if(a ==')'){
            return b == '(';
        }
        else {
            return b == '[';
        }
    }
}
