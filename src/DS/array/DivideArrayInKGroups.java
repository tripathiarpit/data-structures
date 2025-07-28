package DS.array;

import java.util.Arrays;
import java.util.HashMap;

public class DivideArrayInKGroups {
    public static void main(String[] args) {
        int arr[] = {53,78,62,108,83,56,66,110,49,104,117,123,86,131,94,107,84,103,42,127,100,50,55,97,
                81,93,71,45,63,39,91,87,129,126,84,125,73,95,116,47,106,52,121,54,38,68,69,76,89,90,57,67,86,114,64,87,79,92,115,60,51,105,132,101,59,130,44,85,80,82,48,65,128,102,74,61,40,46,
                98,111,109,119,72,43,112,120,58,113,77,88,41,118,75,85,124,122,96,83,99,70};
        Arrays.sort(arr);
        boolean res = isNStraightHand(arr, 50);
        System.out.println("Is Possible"+ res);
    }
    public static boolean isNStraightHand(int[] hand, int groupSize) {
        int handLength = hand.length;
        System.out.print("Length of Hand and Group:"+ handLength + ","+ groupSize);
        if(handLength % groupSize !=0) {
            return false;
        }
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for(int i = 0; i < handLength; i++ ) {
            frequencyMap.put(hand[i],frequencyMap.getOrDefault(hand[i],0)+1);

        }
        while (frequencyMap.size() > 0) {
            int currentCard = frequencyMap.entrySet().iterator().next().getKey();
            for (int i = 0; i < groupSize; i++) {
                if(!frequencyMap.containsKey(currentCard + i))
                    return false;
                frequencyMap.put(currentCard + i,frequencyMap.get(currentCard + i)-1);
                if( frequencyMap.get(currentCard + i) == 0) {
                    frequencyMap.remove(currentCard + i);
                }
            }

        }
        return true;
    }
}
