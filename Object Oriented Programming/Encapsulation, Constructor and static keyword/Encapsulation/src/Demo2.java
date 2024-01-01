class Student1{
    private int age;
    private String name;

    Student1(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}


public class Demo2 {
    public static void main(String[] args) {

        Student1 obj1 = new Student1("Soham", 21);
        Student1 obj2 = new Student1("Sambaran", 19);

        System.out.println(obj1.getName() + " " + obj1.getAge());
        System.out.println(obj2.getName() + " " + obj2.getAge());
    }
}
