package CollectionAPI;

import java.util.PriorityQueue;

// priority queue follows mean heap data structure
public class LaunchPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add(100);
        pq.add(50);
        pq.add(150);
        pq.add(25);
        pq.add(75);
        pq.add(125);
        pq.add(175);
//        pq.add("pw");  heterogeneous type of data is not allowed, null vaule is also not allowed

        System.out.println(pq);
        pq.add(25); // duplicate values are allowed
        System.out.println(pq);
    }
}
