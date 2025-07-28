package DS.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TryHashSet {
    public static void main(String[] args) {
        Set<String> uniqueNames = new HashSet<>(Arrays.asList("Arpit","Yamini", "Yannu",
                "Kannu","Vishal"));

        Iterator<String>ite = uniqueNames.iterator();
        while(ite.hasNext()) {
            String name = ite.next();
            System.out.println("Name:"+name);
            if(name.equals("Vishal")) {
                ite.remove();
            }
        }
        System.out.println("---------------------------");
        Iterator<String>ite2 = uniqueNames.iterator();
        while(ite2.hasNext()) {
            String name = ite2.next();
            System.out.println("Name:"+name);

        }
    }
}
