public class SignedBit {
    public int hamminWeight(int n) {
      int count=0;
      while(n!=0) {
          n = n &(n-1);
          count++;
      }
      return count;
    }

    public static void main(String[] args) {
        SignedBit signedBit = new SignedBit();
        System.out.println(signedBit.hamminWeight(7));
    }
}
