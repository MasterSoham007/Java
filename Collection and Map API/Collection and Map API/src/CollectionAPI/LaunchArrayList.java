package CollectionAPI;

import java.util.*;
//ArrayList in java
public class LaunchArrayList {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();
        al1.add(100);
        al1.add(200);
        al1.add(300);
        System.out.println(al1);
        System.out.println("*************************************");

        ArrayList al2 = new ArrayList();
        al2.add("PW skills");
        al2.add(1);
        al2.add('j');
        al2.add(1.1);
        System.out.println(al2);
        System.out.println("*************************************");

        al2.add(100);
        System.out.println(al2);
        System.out.println("*************************************");

        ArrayList al3 = new ArrayList();
        al3.add(1);
        al3.add(2);
        al3.add(3);
        System.out.println(al3);

        System.out.println("After adding collection");
        al3.addAll(al2);
        System.out.println(al3);

        al3.add(2, "pw");
        System.out.println(al3);
    }
}
