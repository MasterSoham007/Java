package Constructor;

class Student3{
    private String name;
    private int age;

    public Student3(){
        this("Rohit", 21);
        System.out.println("Default constructor is called");
        name = "Rohan";
        age = 18;
    }

    public Student3(String name){
        this();
        this.name = name;
        age = 19;
    }

    public Student3(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void disp(){
        System.out.println(name);
        System.out.println(age);
    }
}

public class Launch3 {

    public static void main(String[] args) {
        Student3 s1 = new Student3();
        s1.disp();
        Student3 s2 = new Student3("Rahul");
        s2.disp();
    }

}
