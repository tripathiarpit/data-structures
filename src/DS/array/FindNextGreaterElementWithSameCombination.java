package DS.array;
/*
You have been given a number X, which all it's digits in Character Array.
Find the next possible greater number than N, which has same digits.
 */
public class FindNextGreaterElementWithSameCombination {
    public static void main(String[] args) {
        char ch[] = {1,4,8,4,9,7,5,3,2}; // Ans::  1,4,8,5,2,3,4,7,9
        FindNextGreaterElementWithSameCombination obj= new FindNextGreaterElementWithSameCombination();
        System.out.println("Next Greater Element is");
       char[] answer =  obj.findNextGreaterNumber(ch);
       for(char c: answer) {
           System.out.print((int)c);
        }
    }
    public char[] findNextGreaterNumber(char digits[]){
        int sourceSwappingIndex = -1;
        for(int start = digits.length-2; start >=0; start--) {
            if(digits[start]< digits[start+1]) {
                sourceSwappingIndex = start;
                break;
            }
        }
        if(sourceSwappingIndex==-1) {
            return digits;
        }

        int nextGreater = sourceSwappingIndex+1;
        int element = digits[sourceSwappingIndex];
        for(int start = sourceSwappingIndex+1; start <digits.length;start++) {
          if(digits[start]>element &&  digits[start]<= digits[nextGreater]) {
              nextGreater = start;
          }
        }

        digits[sourceSwappingIndex] = digits[nextGreater];
        digits[nextGreater] = (char)element;
        int counter = 0;
        // Ans::  1,4,8,5,2,3,4,7,9
        int endCondition = (digits.length-1 + sourceSwappingIndex) /2;
        for(int start = sourceSwappingIndex+1; start <= endCondition; start++){
            char last = digits[(digits.length -1) - counter];
            digits[(digits.length -1) - counter] = digits[start];
            digits[start] = last;
            counter++;
        }
        return digits;

    }
}
