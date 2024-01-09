package Interface;

interface A1{
    void show();
    default void config(){             // added in Java 8
        System.out.println("in config");
    }

    static void abc(){                 // added in Java 8
        System.out.println("in abc");
    }
}

class B1 implements A1{
    public void show(){
        System.out.println("in show");
    }
}

public class Launch3 {
    public static void main(String[] args) {
        A1.abc();
        A1 obj = new B1();
        obj.show();
        obj.config();
    }
}
