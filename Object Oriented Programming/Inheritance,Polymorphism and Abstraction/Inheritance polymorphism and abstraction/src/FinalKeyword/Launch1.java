package FinalKeyword;

//final class Animal1{
//    void sleep(){
//        System.out.println("Animal is sleeping");
//    }
//}   final class cannot be inherited


class Animal1{
    final int age = 19;
    final void sleep(){
//        age = 20;  final variables are treated as compile time constants and their values cannot be changed
        System.out.println("Animal is sleeping");
    }
}

class Tiger1 extends Animal1{
//    void sleep(){
//
//    }      final method cannot be overridden in child class
}

public class Launch1 {
    public static void main(String[] args) {
        Tiger1 t = new Tiger1();
        t.sleep();
    }
}
