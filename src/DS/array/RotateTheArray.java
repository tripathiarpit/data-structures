package DS.array;

import java.util.Arrays;

public class RotateTheArray {

    public static void main(String[] args) {
 RotateTheArray rotateTheArray = new RotateTheArray();
        int arr[] = {1,2,3,4,5,6,7,8,0};
        System.out.println("Before Reverse::");
        Arrays.stream(arr).forEach(System.out::println);
        rotateTheArray.rotateTheArray(arr,6);
    }

    public void rotateTheArray(int arr[], int times) {
        // times = arr.length % times;
        System.out.println("After whole Reverse::");
        ReverseAPartOfArray reverseAPartOfArray = new ReverseAPartOfArray();
        reverseAPartOfArray.reverseArrayInPart(0,arr.length-1, arr);
        Arrays.stream(arr).forEach(System.out::print);
        System.out.println("After First k element Reverse::");
        reverseAPartOfArray.reverseArrayInPart(0,times-1, arr);
        Arrays.stream(arr).forEach(System.out::println);
        System.out.println("After k to N Reverse::");
        reverseAPartOfArray.reverseArrayInPart(times,arr.length-1,arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
