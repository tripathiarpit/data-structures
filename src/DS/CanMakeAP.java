package DS;

import java.util.Arrays;

public class CanMakeAP {
    public boolean canMakeArithmeticProgression(int[] array) {

        int arrayLenth = array.length;
        System.out.println("array lenth::"+ arrayLenth);
        if(array.length<2 || array.length>1000)
            return false;
        if(array.length==2)
            return true;

        Arrays.sort(array);
        Arrays.stream(array).forEach(data -> {System.out.print(data);
            System.out.println("");});
        double diff = array[1]-array[0];
        double sum =0;
        for(int i = 0; i< array.length-1;i++) {
            double nextElement = array[i]+ diff;
            double arrayNext = array[i+1];
            System.out.println("Next Element with Diff"+ nextElement);
            System.out.println("Next Element According of Array"+ arrayNext);
            if(nextElement!=array[i+1]){
                return false;
            } else {
                System.out.println("They Are equal");
            }

        }
        return true;
    }

    public static void main(String[] args) {
        CanMakeAP ap = new CanMakeAP();
        int [] arr = {3,5,1};
        System.out.println("Can form AP"+ap.canMakeArithmeticProgression(arr));
    }
}
