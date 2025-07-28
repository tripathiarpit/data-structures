package DS.array;

public class SwapArrayRecursion {
    public static void main(String[] args) {
        int [] inputArray= {1};
        System.out.print("Before SwaP");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i]);
        }
        // O/P 6,5,4,3,2,1

        swapArray(inputArray, 0, inputArray.length-1);
        System.out.println("After Swap");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i]);
        }
    }
    public static void swapArray(int [] array, int start, int end) {
        if(array.length<=1) {
            return;
        }
        if(start >=end) {
            return;
        }
        swapArrayPositions(array, start, end);
        swapArray(array,start+1, end -1);
    }

    public static void swapArrayPositions(int [] inputArray, int positionOne, int positionTwo) {
        int temp = inputArray[positionOne];
        inputArray[positionOne] = inputArray[positionTwo];
        inputArray[positionTwo] = temp;
    }



        }
