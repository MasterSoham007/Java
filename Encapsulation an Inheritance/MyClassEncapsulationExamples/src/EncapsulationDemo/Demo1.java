package EncapsulationDemo;

class Student{
    private String name;
    private int age;
    private int rollNumber;

    public Student(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

//    public void setValues(String name, int age, int rollNumber){
//        this.name = name;
//        this.age = age;
//        this.rollNumber = rollNumber;
//    }


    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public int getAge() {
        return age;
    }

//    public void setAge(int age) {
//        if(age>0) {
//            this.age = age;
//        }
//        else{
//            System.out.println("Not a correct age");
//        }
//    }

    public int getRollNumber() {
        return rollNumber;
    }

//    public void setRollNumber(int rollNumber) {
//        this.rollNumber = rollNumber;
//    }
}

public class Demo1 {
    public static void main(String[] args) {
        Student s = new Student("Soham", 21, 53);
//        s.setValues("Soham", 21, 53);
//        s.setAge(21);
//        s.setName("Soham");
//        s.setRollNumber(53);

        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getRollNumber());
    }
}
