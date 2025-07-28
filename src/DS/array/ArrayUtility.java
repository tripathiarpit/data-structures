package DS.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArrayUtility {
    public static int prefixSumRecursion(int arr[], int index, int prefixSum[]) {
        if (index != 0) {
            int sum = prefixSumRecursion(arr, index - 1, prefixSum);
            sum = sum + arr[index];
            prefixSum[index] = sum;
            return sum;
        } else {
            ArrayList<Objects> al = new ArrayList<Objects>();
            List<Integer>  integerList  = new ArrayList<>();
            prefixSum[0] = arr[0];
            return arr[0];
        }

    }
}

