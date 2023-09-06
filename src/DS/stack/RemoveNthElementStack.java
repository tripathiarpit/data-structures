package DS.stack;

public class RemoveNthElementStack {

    public static void main(String[] args) {
            int arr[]=  {1,2,3,4,5,6,7};
        RemoveNthElementStack solve = new RemoveNthElementStack();
        solve.deleteNthElement(arr,arr.length-1,2);
        for (int element: arr
             ) {
            System.out.print(element+",");

        }
    }

    public void deleteNthElement(int arr[], int current, int position) {
        int temp = arr[current];
        if(current == position-1) {
            arr[current] = arr[current+1];
            return;
        }
        deleteNthElement(arr,current-1,position);
        arr[current-1] = temp;
        return;
    }
}
