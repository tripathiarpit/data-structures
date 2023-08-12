package DS.array;

import java.util.Arrays;

public class ReverseAPartOfArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ReverseAPartOfArray reverseAPartOfArray = new ReverseAPartOfArray();
        Arrays.stream(arr).forEach(System.out::print);
        System.out.println("");
        reverseAPartOfArray.reverseArrayInPart(3,7,arr);
        System.out.println("After Reverse");
        Arrays.stream(arr).forEach(System.out::print);
    }

    public void reverseArrayInPart(int startIndex, int endIndex, int array[]) {

        while (startIndex < endIndex) {
            int temp = array[endIndex];
            array[endIndex] = array[startIndex];
            array[startIndex] = temp;
            startIndex++;
            endIndex --;
        }

    }

}
