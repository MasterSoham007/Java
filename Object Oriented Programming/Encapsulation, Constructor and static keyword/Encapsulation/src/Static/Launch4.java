package Static;

class Demo4{
    static void disp1(){
        System.out.println("static method disp1");
    }

    void disp2(){
        System.out.println("non static disp2");
    }
}

public class Launch4 {
    public static void main(String[] args) {
        Demo4.disp1();

        Demo4 d = new Demo4();
        d.disp2();
        d.disp1();
    }
}
