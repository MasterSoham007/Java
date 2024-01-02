package Static;

class Demo2 {
    static int a;
    static int b;

    int m;
    int n;

    static {
        System.out.println("control in static block");
        a = 10;
        b = 20;
    }
    {
        System.out.println("control in non static block");
        m = 30;
        n = 40;
    }

    static void disp1(){
        System.out.println("value of static variable a: " + a);
        System.out.println("value of static variable b: " + b);
    }

    void disp2(){
        System.out.println("value of non-static variable m: " + m);
        System.out.println("value of non-static variable n: " + n);
    }
}

public class Launch2 {
    public static void main(String[] args) {
        Demo2 d = new Demo2();

        Demo2.disp1();
        d.disp2();
    }
}
