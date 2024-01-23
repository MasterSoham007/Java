package IO;

class Student1{
    private String name;
    private int age;
    private String city;

    public Student1(String name, int age, String city){
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String toString(){
        return "Name: " + name + " | Age: " + age + " | City: " + city;
    }
}

public class launch1 {
    public static void main(String[] args) {
        Student1 st1 = new Student1("virat", 34, "delhi");
        System.out.println(st1);

        Student1 st2 = new Student1("sachin", 44, "mumbai");
        System.out.println(st2);
    }
}
