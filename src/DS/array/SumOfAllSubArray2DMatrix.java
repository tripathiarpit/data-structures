package DS.array;
/*
Given a 2D- MXN matrix, find the sum of all Sub-Array of given Matrix
 */
public class SumOfAllSubArray2DMatrix {
    public static void main(String[] args) {
        int rows = 2;
        int cols = 2;
        int arr[][] = {
                {1, 2},
                {5, 6}
        };
        SumOfAllSubArray2DMatrix sumOfAllSubArray2DMatrix = new SumOfAllSubArray2DMatrix();
        System.out.println("Sum of All sub Arrays is :"+sumOfAllSubArray2DMatrix.sumAllSubArray(arr, rows, cols));
    }

    public int sumAllSubArray(int arr[][], int rows, int cols) {
        int sum = 0;
        for(int start = 0; start < rows; start++) {
            for (int end = 0; end < cols; end++) {
                int totalTopLeft = (start + 1) * (end+1);
                int totalBottomRight = (rows-start) *( cols - end);
                int totalOccourance = totalTopLeft * totalBottomRight;
                int totalContributionOfIndex = arr[start][end] * totalOccourance;
                sum+= totalContributionOfIndex;
            }
        }
        return sum;
    }

}
