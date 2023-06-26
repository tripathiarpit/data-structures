import java.util.ArrayList;

public class SwapEqual {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length()!= s2.length()) {
            return false;
        }
        if(s1.length()<1 || s1.length()>100) {
            return false;
        }
        if(s1.equals(s2)) {
            return true;
        }
        int eneqC1= 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i< s1.length();i++) {
            char  c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if(c1!=c2) {
                eneqC1++;
                list.add(i);
            }
        }
        if(eneqC1 ==2){
            StringBuilder s = new StringBuilder(s1);
            char c1= s.charAt(list.get(0));
            char c2 = s.charAt(list.get(1));
            s.setCharAt(list.get(0),c2);
            s.setCharAt(list.get(1),c1);
            if(s.toString().equals(s2))
                return true;
            else
                return false;
        } else {
            return false;
        }


    }

    public static void main(String[] args) {
        SwapEqual sw = new SwapEqual();
        System.out.println(sw.areAlmostEqual("bank","kanb"));
    }
}
