package IO;

import java.io.*;

class Cricketer2 implements Serializable{
    private String name;
    transient private int age;
    private int runs;

    public Cricketer2(String name, int age, int runs){
        this.name = name;
        this.age = age;
        this.runs = runs;
    }

    public void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(runs);
    }
}

public class launch11 {
    public static void main(String[] args)throws IOException, ClassNotFoundException {
//        Cricketer2 c = new Cricketer2("Virat", 34, 26000);
//        c.display();
//
//        FileOutputStream fos = new FileOutputStream("Files/file5.txt");
//        BufferedOutputStream bos = new BufferedOutputStream(fos);
//        ObjectOutputStream oos = new ObjectOutputStream(bos);
//
//        oos.writeObject(c);
//        oos.flush();
//        oos.close();

        FileInputStream fis = new FileInputStream("Files/file5.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);

        Cricketer2 cr = (Cricketer2) ois.readObject();
        cr.display();
    }
}
