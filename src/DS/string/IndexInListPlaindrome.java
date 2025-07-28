package DS.string;

import java.util.*;


// Given a list of unique words, find all pairs of distinct indices (i, j) in the given list so that the
//         concatenation of the two words, i.e., words[i] + words[j], is a palindrome.
public class IndexInListPlaindrome {
    static String[] inputList;

    public static void main(String[] args) {
        inputList = new String[]{"abcd", "dcba", "lls", "s", "sssll"};
        palindromePairs(inputList);
    }

    public static List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> result = new ArrayList<>();
        Map<String, Integer> wordsIndex = new HashMap<>();
        for (int i = 0; i < inputList.length; i++) {
            wordsIndex.put(words[i], i);
        }
        //Case with Blank
        if (wordsIndex.containsKey("")) {
            int blankIndex = wordsIndex.get("");
            for (int i = 0; i < inputList.length; i++) {
                if (1 != blankIndex && isPalindrome(words[i], 0, inputList.length - 1)) {
                    result.add(Arrays.asList(blankIndex, i));
                    result.add(Arrays.asList(i, blankIndex));
                }
            }
        }
        // Reflection case
        for (int i = 0; i < inputList.length; i++) {
            String reverse = new StringBuffer(words[i]).reverse().toString();
            if (wordsIndex.containsKey(reverse) && wordsIndex.get(reverse) != i) {
                result.add(Arrays.asList(i, wordsIndex.get(reverse)));
            }
        }
        //
        for (int i = 0; i < inputList.length; i++) {
            String currentString = words[i];
            for (int j = 1; j < currentString.length(); j++) {
                String leftCut = currentString.substring(0, j);
                String rightCut = currentString.substring(j);
                if (isPalindrome(leftCut, 0, leftCut.length() - 1)) {
                    String revRight = new StringBuffer(rightCut).reverse().toString();
                    if (wordsIndex.containsKey(revRight)) {
                        result.add(Arrays.asList(wordsIndex.get(revRight), i));
                    }
                }
                if (isPalindrome(rightCut, 0, rightCut.length())) {
                    String revLeft = new StringBuffer(leftCut).reverse().toString();
                    if (wordsIndex.containsKey(revLeft)) {
                        result.add(Arrays.asList(i, wordsIndex.get(revLeft)));
                    }
                }
            }
        }
        return result;
    }

    public static boolean isPalindrome(String word, int currentIndex, int lastIndex) {
        if (currentIndex >= lastIndex) {
            return true;
        }
        if (word.charAt(currentIndex) != word.charAt(lastIndex))
            return false;

        return isPalindrome(word, currentIndex + 1, lastIndex - 1);
    }
}

