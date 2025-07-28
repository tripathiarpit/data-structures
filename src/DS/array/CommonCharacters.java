package DS.array;
import java.util.*;
public class CommonCharacters {
    public static void main(String[] args) {
        String []  words = {"bella","label","roller"};
        List<String> al =  commonChars(words);
        System.out.println(al);
    }
    public static List<String> commonChars(String[] words) {
        int [] reference = countFrequency(words[0]);
        for(int i = 1; i<words.length ; i++) {
            reference = countCommonFrequency(reference, countFrequency(words[i]));
        }
        ArrayList<String> al = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            if(reference[i]!=0) {
               String letter = String.valueOf((char)(97+ i));
               while(reference[i]>0) {
                   al.add(letter);
                   reference[i]--;
               }
            }

        }
        return al;
    }

    public static int[] countFrequency(String word) {
        int [] frequencyArray = new int[26];
        for(Character letter: word.toCharArray()) {
            frequencyArray[letter-97]++;
        }
        return frequencyArray;
    }

    public static int[] countCommonFrequency(int[] word, int[] word2) {
        int [] commonFrequencyArray = new int[26];
        for (int i=0; i<26; i++) {
            commonFrequencyArray[i] = Math.min(word[i], word2[i]);
        }
        return  commonFrequencyArray;
    }

}
