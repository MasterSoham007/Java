package Inheritance;



// Single Inheritance.
class Animal{
    void sleep(){
        System.out.println("Animal needs sleep");
    }
}

class Tiger extends Animal{

}

public class Launch3 {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.sleep();
    }
}
