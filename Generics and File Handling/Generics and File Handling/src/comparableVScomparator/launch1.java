package comparableVScomparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    int marks;
    int age;
    String name;

    public Student(int marks, int age, String name){
        this.marks = marks;
        this.age = age;
        this.name = name;
    }

    public int getMarks(){
        return marks;
    }

    public int getAge(){
        return age;
    }

    public String toString(){
        return "" + marks + " - " + age + " - " + name;
    }
}

//class Alpha implements Comparator<Student>
//{
//    public int compare(Student a, Student b){
//        if(a.marks > b.marks)
//            return 1;
//        else
//            return -1;
//    }
//}


public class launch1 {
    public static void main(String[] args) {
        Student st1 = new Student(45, 18, "Rohan");
        Student st2 = new Student(46, 17, "Rohit");
        Student st3 = new Student(44, 19, "Mehu");

        List<Student> list = new ArrayList<>();

        list.add(st1);
        list.add(st2);
        list.add(st3);

        System.out.println(list);

//        Alpha a = new Alpha();
//        Collections.sort(list, a);

        Comparator<Student> com=(Student a, Student b)->{
            if(a.marks > b.marks)
                return 1;
            else
                return -1;
        };
        Collections.sort(list, com);
        System.out.println(list);
    }
}
