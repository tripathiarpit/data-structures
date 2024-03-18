package DS.array;
/*
We have given an Array of length N, find the first missing positive number
arr[5]:  -4,-2,5,7,8
 */
public class FindFirstMissingPositiveNumber {


    public static void main(String[] args) {
        int arr[]= {-4,2,-7,6,9,1,-8,3};
        System.out.println("The missing +ve number is ::"+findTheFirstMissingPositiveNumber(arr));
    }
    public static  int findTheFirstMissingPositiveNumber(int arr[]) {
        int answer = 0;
        int indexCount = 0;
        while(indexCount <arr.length) {  //2
            if(arr[indexCount] != indexCount+1 &&  (arr[indexCount] > 0 && arr[indexCount] < arr.length)){
                int temp = arr[indexCount];
                arr[indexCount]= arr[temp-1];
                arr[temp-1] =  temp;
            } else {
                indexCount++;
            }
        }
        for(int i= 0; i< arr.length; i++) {
            if(arr[i]!=i+1) {
                answer = i + 1;
                return answer;
            }
        }
        if(answer == 0) {
            return arr.length+1;
        }
        return  answer;
    }
}
