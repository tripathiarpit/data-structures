package DS.array;

public class Print2DArrayBoundary {
    public static void main(String[] args) {

        int arr[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        printArrayBoundary(arr);
    }

    public static void printArrayBoundary(int arr[][]) {
        int i =0, j=0;
        for(int x=0 ;x<arr.length-1; x++) {
            System.out.print(arr[i][j]+",");
            j++;
        }
        System.out.println("");
        for(int x=0 ;x<arr.length-1; x++) {
            System.out.print(arr[i][j]+",");
            i++;
        }
        System.out.println("");
        for(int x=0 ;x<arr.length-1; x++) {
            System.out.print(arr[i][j]+",");
            j--;
        }
        System.out.println("");
        for(int x=0 ;x<arr.length-1; x++) {
            System.out.print(arr[i][j]+",");
            i--;
        }
    }
}
