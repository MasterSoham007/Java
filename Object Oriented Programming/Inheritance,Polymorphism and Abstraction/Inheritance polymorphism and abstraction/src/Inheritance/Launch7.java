package Inheritance;

class Demo4{
    int a,b;

    public Demo4(){
        System.out.println("Parent class constructor");
    }

    public Demo4(int x, int y){
        System.out.println("Parameterized parent class constructor");
        a = x;
        b = y;
    }
}

class Demo5 extends Demo4{
    int m,n;

    public Demo5(){
        System.out.println("Child class constructor");
    }

    public Demo5(int x, int y){
        System.out.println("Parameterized child class constructor");
        m = x;
        n = y;
    }
}

public class Launch7 {
    public static void main(String[] args) {
        Demo5 d = new Demo5();
    }
}
