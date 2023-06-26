import java.util.Arrays;

public class ArrayRotation {
    public int [] rotateArray(int [] array, int toPlaces){
        for(int i= 0; i < toPlaces; i++) {
            int firstElement = array[0];
            for(int j =0; j< array.length-1; j++) {
                array[j] = array[j+1];
            }
            array[array.length-1] = firstElement;
        }
       return array;
    }
    public static void main(String[] args) {
        ArrayRotation arrayRotation = new ArrayRotation();
        int array[] = new int[7];
        int toPlaces = 2;
        for (int i=0;i<array.length;i++) {
            array[i] = i * 100;
        }
        System.out.print("Input Array:");
        Arrays.stream(array).forEach(data -> {System.out.print(data); System.out.print(",");});
        System.out.println("");
        int [] outputArray = arrayRotation.rotateArray(array,toPlaces);
        System.out.print("Output Array:");
        Arrays.stream(outputArray).forEach(data -> {System.out.print(data); System.out.print(",");});
    }
}
