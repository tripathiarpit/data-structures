package misc;
import java.util.*;
public class CountOfAAAinString {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println("Count of aaa is:"+CountOfAAAinString.countA(input.toCharArray(),0));

        System.out.println("Count of continue aaa is:"+CountOfAAAinString.countContinueA(input.toCharArray(),0));
    }

    public static int countA(char arr[], int firstPos) {
        int count = 0;
        if(firstPos+2 > (arr.length -1)){
            return 0;
        }
            if((arr[firstPos]== 'a' && arr[firstPos+1] =='a' && arr[firstPos+2] =='a')) {
                count++;
                firstPos = firstPos+3;
            }else {
                firstPos = firstPos+1;
            }

            int result = CountOfAAAinString.countA(arr,firstPos);
            count = count + result;
            return count;
    }

    public static int countContinueA(char arr[], int firstPos) {
        int count = 0;
        if(firstPos+2 > (arr.length -1)){
            return 0;
        }
        if((arr[firstPos]== 'a' && arr[firstPos+1]== 'a' && arr[firstPos+2]== 'a'  )) {
            count++;
            firstPos =firstPos+1;
        } else{
            firstPos =firstPos+1;
        }
        int result = CountOfAAAinString.countContinueA(arr,firstPos);
        count = count + result;
        return count;
    }
}
