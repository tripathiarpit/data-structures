package OOPS;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasic {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
        map.put("Arpit",1);
        map.put("Pinky",2);

        for(Map.Entry<String, Integer> name: map.entrySet()){
            System.out.println("key:"+ name.getKey() + " , Value:"+ name.getValue());
        }
    }
}
