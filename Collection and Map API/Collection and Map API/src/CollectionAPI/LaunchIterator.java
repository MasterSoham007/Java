package CollectionAPI;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class LaunchIterator {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(100);
        System.out.println(a1);

//        // for loop
//        for(int i = 0; i < a1.size(); i++){
//            Object o = a1.get(i);
//            System.out.println(o);
//
////            System.out.println(a1.get(i));
//        }
//
//        // for each
//        for(Object o : a1){
//            System.out.println(o);
//        }    for loops are not recommended to access the elements of a collection

        Iterator itr = a1.iterator();
        while (itr.hasNext()){
//            Integer i = (Integer)itr.next();
            System.out.println(itr.next());
        }

        ListIterator litr = a1.listIterator(a1.size()); // only applicable for list types, can also traverse in reverse direction
        while (litr.hasPrevious()){
            System.out.println(litr.previous());
        }
    }
}
