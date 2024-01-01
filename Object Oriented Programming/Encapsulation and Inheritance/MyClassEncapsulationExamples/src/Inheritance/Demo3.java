package Inheritance;

class Animal{
    String name;
    int age;

    public Animal(){
        this("puppy"); // it will search for a constructor in the same class which takes string type of data and has one parameter
        System.out.println("hey i am no parameter animal constructor");
    }

    public Animal(String name){
        this("jack", 24);
        this.name = name;
        System.out.println(name);
    }

    public Animal(int age){
        this.age = age;
        System.out.println(age);
    }

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println(name +" "+ age);
    }
}

class Dog extends Animal{
    int speed;

    public Dog(){
        this(30);
        System.out.println("hey i am no parameter dog constructor");
    }

    public Dog(int speed){
        super();
        this.speed = speed;
        System.out.println(speed);
    }
}

public class Demo3 {
    public static void main(String[] args) {
//        Animal a = new Animal();
        Dog d = new Dog(50);
    }
}
