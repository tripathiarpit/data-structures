package misc;

public class SquareRootBinarySearch {
    public static void main(String[] args) {
        System.out.println(SquareRootBinarySearch.squareRoot(8));
    }
    public static int squareRoot(int number) {
        double low=0;
        double high = 0;
        if(number <=1){
            low = 0;
            high = 1;
        } else {
            low = 0;
            high = number;
        }
        double lowPre = 0.001;
        while((high - low) > lowPre) {
            double mid = (low+high)/2;
            if(mid * mid == number) {
                return (int)Math.floor(mid);
            } else if(mid * mid > number) {
                high = mid;
            } else {
                low = mid ;
            }
        }


        return (int)Math.floor((low + high)/2);

    }
}
