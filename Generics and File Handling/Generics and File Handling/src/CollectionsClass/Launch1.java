package CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;

public class Launch1 {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        al1.add(10);
        al1.add(5);
        al1.add(45);
        al1.add(23);

        System.out.println(al1);
        Collections.sort(al1);
        System.out.println(al1);

        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Soham");
        al2.add("Goswami");
        al2.add("Sambaran");
        al2.add("Anik");

        System.out.println(al2);
        Collections.sort(al2);
        System.out.println(al2);

        ArrayList al3 = new ArrayList();

        al3.add(10);
        al3.add(20);
        al3.add(30);
        al3.add(40);
        al3.add(50);

        System.out.println(al3);
        int index = Collections.binarySearch(al3,60);
        System.out.println("Index is: " + index);

        Collections.rotate(al3,3);
        System.out.println(al3);

        Collections.shuffle(al3);
        System.out.println(al3);

        System.out.println(Collections.frequency(al3, 20));
    }
}
