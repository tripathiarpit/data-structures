package DS.stack;

import java.util.Stack;

public class RemoveAdjecent {
    public static void main(String[] args) {
        String input = "aaccbd";
        System.out.println("String After removing Adjacent Equal Character::"
                +new RemoveAdjecent().removeAdjacentEqualCharacter(input));
    }
    // e d a
    // a d e
    public String removeAdjacentEqualCharacter(String input) {
        Stack<Character> characterStack = new Stack<>();
        characterStack.push(input.charAt(0));

        for(int i = 1; i < input.length(); i++) {
            if(!characterStack.isEmpty() && characterStack.peek() == input.charAt(i)) {
                characterStack.pop();
            } else {
                characterStack.push(input.charAt(i));
            }
        }
        StringBuilder  sb = new StringBuilder();

        Stack<Character> characterStack2 = new Stack<>();

        while (!characterStack.isEmpty()) {
            characterStack2.push(characterStack.pop());
        }

        while (!characterStack2.isEmpty()) {
            sb.append(characterStack2.pop());
        }
        return sb.toString();
    }

}
