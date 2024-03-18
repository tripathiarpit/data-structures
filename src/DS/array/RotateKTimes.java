package DS.array;

import java.util.Arrays;

public class RotateKTimes {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        // BRUTE FORCE
//        int k =3;
//        for(int i= 0; i< k; i++) {
//
//            int temp = arr[arr.length-1];
//           // arr[0] = arr[arr.length-1];
//            for(int j=arr.length-1; j>=1; j--) {
//               arr[j]= arr[j-1];
//            }
//
//            arr[0] = temp;
//        }

        int k =3;
        int endPoint = arr.length -1;
        int startPoint = 0;
        reverse(startPoint,endPoint,arr);
        endPoint = k-1;
        startPoint =0;
        // 6 5 4 3 2 1
        reverse(startPoint,endPoint,arr);
      //  Arrays.stream(arr).forEach(System.out::println);
        startPoint = k;
        endPoint = arr.length-1;
        reverse(startPoint,endPoint,arr);
       Arrays.stream(arr).forEach(data-> System.out.println(data));
    }

    public static void reverse(int startPoint, int endPoint, int arr[]) {
        while(startPoint<endPoint) {
            int temp = arr[startPoint];
            arr[startPoint] = arr[endPoint];
            arr[endPoint] = temp;
            startPoint++;
            endPoint--;
        }
    }
}
