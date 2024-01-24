package MapAPI;

import java.util.Hashtable;
import java.util.TreeMap;

public class LaunchMap {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();

        ht.put(1,"Rohit");
        ht.put(2,"Rohan");
        ht.put(3,"Ramesh");
//        ht.put(null,"Hyder");   null value not allowed as key
        ht.putIfAbsent(2,"Rajesh");

        System.out.println(ht);

        TreeMap tm = new TreeMap();

        Integer i = new Integer(5);

        tm.put(i,"Rohit");
        tm.put(1,"Ramesh");
        tm.put(4,"Rahul");
        tm.put(3,"Roshan");

        System.out.println(tm); // sorted order
    }
}