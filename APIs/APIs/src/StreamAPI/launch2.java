package StreamAPI;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.*;

public class launch2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(8,4,2,7,5);
        Stream<Integer> streamData = list.stream();

//        Predicate<Integer> pre =(Integer i) ->{
//            if(i%2 == 0)
//                return true;
//            else
//                return false;
//        };

        Predicate<Integer> pre = i -> i%2 == 0;

//        Stream<Integer> finalStream = streamData.filter(n->n%2 == 0).sorted().map(n->n*2);
        Stream<Integer> finalStream = streamData.filter(pre).sorted().map(n->n*2);
//        Stream<Integer> sortedStream = filData.sorted();
//        Stream<Integer> mapStream = sortedStream.map(n-> n*2);
        finalStream.forEach(n-> System.out.println(n));
    }
}
