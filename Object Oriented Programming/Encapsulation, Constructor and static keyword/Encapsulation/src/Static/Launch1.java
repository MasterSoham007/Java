package Static;

public class Launch1 {
    static int a;
    static{
        System.out.println("Static block");
        a = 10;
        System.out.println(a);
    }

    public static void main(String[] args) {
        System.out.println("Main method");
    }
}
