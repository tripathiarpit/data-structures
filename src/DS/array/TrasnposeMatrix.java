package DS.array;

public class TrasnposeMatrix {
    public static void main(String[] args) {
        int arr[][] = { {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}
        };
        transpose(arr);
        for(int i=0; i< arr.length; i++) {
            for(int j=0; j< arr.length;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }

    }

    public static void transpose(int arr[][]) {
        for(int i=0; i< arr.length; i++) {
            for(int j=0; j< arr.length;j++) {
               if(j<i) {
                   int lowerElement = arr[i][j];
                   int upperElement = arr[j][i];
                   arr[i][j] = upperElement;
                   arr[j][i] = lowerElement;
                   // 1 2 3
                   // 4 5 6
                   // 7 8 9

                   // 10, 20,21
               }
            }

        }
    }
}
