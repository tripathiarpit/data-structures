package DS.array;

import java.util.*;

public class AllienWord {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character,Integer> orderPositionHashMap = new HashMap<>();
        for(int i= 0 ; i < order.length(); i++) {
            orderPositionHashMap.put(order.charAt(i),i);
        }
        for(int i= 1; i< words.length; i++) {
            if(compareTwoWords(words[i-1], words[i], orderPositionHashMap)){
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
    private boolean compareTwoWords(String word1, String word2 , HashMap<Character,Integer> orderPositionHashMap) {
        int wordCountTracker = 0;
        while(wordCountTracker < word1.length() && wordCountTracker < word2.length()) {
            Character character1 = word1.charAt(wordCountTracker);
            Character character2 = word2.charAt(wordCountTracker);
            Integer indexOfWordOne = getOrderOfWords(character1, orderPositionHashMap);
            Integer indexOfWordTwo = getOrderOfWords(character2, orderPositionHashMap);
            if(indexOfWordOne <= indexOfWordTwo) {
                wordCountTracker++;
                continue;
            }
            if(indexOfWordOne > indexOfWordTwo)
                return false;
        }
        if(wordCountTracker < word1.length()) {
            for(int j = wordCountTracker; j< word1.length(); j++) {
                Character character1 = word1.charAt(wordCountTracker);
                Character character2 = word2.charAt(word2.length()-1);
                Integer indexOfWordOne = getOrderOfWords(character1, orderPositionHashMap);
                Integer indexOfWordTwo = getOrderOfWords(character2, orderPositionHashMap);
                if(indexOfWordOne <= indexOfWordOne) {
                    wordCountTracker++;
                    continue;
                }
                if(indexOfWordOne > indexOfWordTwo)
                    return false;
            }
        }
        if(wordCountTracker < word2.length()) {
            for(int j = wordCountTracker; j< word2.length(); j++) {
                Character character1 = word1.charAt(word1.length()-1);
                Character character2 = word2.charAt(wordCountTracker);
                Integer indexOfWordOne = getOrderOfWords(character1, orderPositionHashMap);
                Integer indexOfWordTwo = getOrderOfWords(character2, orderPositionHashMap);
                if(indexOfWordOne <= indexOfWordOne) {
                    wordCountTracker++;
                    continue;
                }
                if(indexOfWordOne > indexOfWordTwo)
                    return false;
            }
        }
        return true;

    }

    private Integer getOrderOfWords( Character charToFind, HashMap<Character,Integer> orderPositionHashMap) {
        return orderPositionHashMap.get(charToFind);
    }

    public static void main(String[] args) {
        String []  words = {"hello","leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        AllienWord allienWord = new AllienWord();
        System.out.println("Sorted::"+allienWord.isAlienSorted(words,order));
    }
}
