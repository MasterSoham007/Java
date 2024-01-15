package Generics;

import java.util.ArrayList;

public class Generics1 {
    public static void main(String[] args) {
//        // type safety
//        String ar[] = new String[10];
//        ar[0] = "Soham";
//        ar[1] = "Goswami";
////        ar[2] = 53;
//
//        String name1 = ar[0];
//        String name2 = ar[1];

        // no type safety
//        ArrayList al = new ArrayList();

        // typesafety achieved using generics
        ArrayList<String> al = new ArrayList<String>();

        al.add("Soham");
        al.add("Goswami");
//        al.add(10);  there would be no error if generics was not used as ArrayList can contain multiple data types

//        String n1 = (String)al.get(0);  down casting from Object type to String type in case of not using generics
//        String n2 = (String)al.get(1);

        String name1 = al.get(0);
        String name2 = al.get(1);
    }
}
