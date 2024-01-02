package Constructor;

class Student1{
    private String name;
    private int age;

    public Student1(){
        System.out.println("Default constructor is called");
        name = "Rohan";
        age = 18;
    }

    public Student1(String name){
        this.name = name;
        age = 19;
    }

    public Student1(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void disp(){
        System.out.println(name);
        System.out.println(age);
    }
}

public class Launch2 {

    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.disp();
        Student1 s2 = new Student1("Rahul");
        s2.disp();
        Student1 s3 = new Student1("Rohit",21);
        s3.disp();
    }

}
