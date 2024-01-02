package Encapsulation;

class Student{
    private int age;
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}


public class Demo1 {
    public static void main(String[] args) {

        Student obj1 = new Student();
        Student obj2 = new Student();

        obj1.setName("Soham");
        obj1.setAge(21);
        obj2.setName("Sambaran");
        obj2.setAge(19);

        System.out.println(obj1.getName() + " " + obj1.getAge());
        System.out.println(obj2.getName() + " " + obj2.getAge());
    }
}
