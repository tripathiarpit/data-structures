package misc;

public class MinSuare {
    public static void main(String[] args) {
        System.out.println(minSq(6));
    }
    static int minSq(int n) {
        if(n==0 || n==1) {
            return n;
        }
        int min = Integer.MAX_VALUE;
        for(int i = 1; i*i<= n; i++) {
            int ans = minSq(n -i*i);
            min  = Integer.min(min, ans);
        }
        return min + 1;
    }
}
