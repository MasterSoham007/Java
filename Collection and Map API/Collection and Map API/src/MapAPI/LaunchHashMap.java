package MapAPI;

import java.util.HashMap;
import java.util.LinkedHashMap;

// preservation of order of insertion is not guaranteed
public class LaunchHashMap {
    public static void main(String[] args) {
        HashMap hm1 = new HashMap();

//        hm1.put(null,null); null value is allowed as key and pair
        hm1.put(02,"Rohit");
        hm1.put(03,"Rohan");
        hm1.put(04,"Rohan");// duplicate values are allowed
        hm1.put(04,"Rohan");// duplicate keys are not allowed
        System.out.println(hm1);

        LinkedHashMap lhm2 = new LinkedHashMap(); // order of insertion is preserved

        lhm2.put("Virat","Rohit");
        lhm2.put("Rohit","Rohan");
        lhm2.put("Soham","Rohan");
        System.out.println(lhm2);
    }
}
