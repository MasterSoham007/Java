package Static;

class Demo3{
    static int a;
    static int b;

    int m;
    int n;
    static{
        System.out.println("static block");
        a = 10;
        b = 20;
    }

    {
        System.out.println("non-static block");
        m = 100;
        n = 200;
    }
}

public class Launch3 {
    public static void main(String[] args) {
        Demo3 d1 = new Demo3();
        Demo3 d2 = new Demo3();
    }
}
