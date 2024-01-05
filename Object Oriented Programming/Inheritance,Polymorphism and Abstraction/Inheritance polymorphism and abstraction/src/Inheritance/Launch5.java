package Inheritance;

//Hierarchical Inheritance

class Animal1{ //extends Object
    void sleep(){
        System.out.println("Animal needs sleep");
    }
}

class Tiger1 extends Animal1{

}

class Monkey1 extends Animal1{

}

class Deer1 extends Animal1{

}

public class Launch5 {
    public static void main(String[] args) {
        Tiger1 t = new Tiger1();
        t.sleep();
    }
}
