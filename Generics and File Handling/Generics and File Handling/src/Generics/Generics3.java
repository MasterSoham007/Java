package Generics;

import java.util.*;

class Gen{

}

class Gen2<T>{
    T obj;

    public Gen2(T obj){
        this.obj = obj;
    }

    void disp(){
        System.out.println("The type of data is: "+ obj.getClass().getName());
    }

    public T getObj(){
        return obj;
    }
}

public class Generics3 {
    public static void main(String[] args) {
        Gen g = new Gen();

        ArrayList<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        Collection<Integer> list3 = new ArrayList<Integer>();
//        List<Object> list4 = new ArrayList<String>(); compile time error
        List<Integer> list5 = new ArrayList<Integer>();
//        ArrayList<int> list6 = new ArrayList<int>(); primitive data type not allowed as generics
        ArrayList<Gen> list7 = new ArrayList<Gen>();
        Gen2<Integer> g2 = new Gen2<Integer>(10);
        g2.disp();
        System.out.println(g2.getObj());

        System.out.println("*******************************************");
        Gen2<String> g3 = new Gen2<String>("Soham");
        g3.disp();
        System.out.println(g3.getObj());
    }
}
