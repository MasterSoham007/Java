package IO;

import java.io.*;

class Cricketer implements Serializable{
    private String name;
    private int age;
    private int runs;

    public Cricketer(String name, int age, int runs){
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

public class launch10 {
    public static void main(String[] args)throws IOException, ClassNotFoundException{
//        Cricketer c = new Cricketer("Sachin", 44, 30000);
//
//        FileOutputStream fos = new FileOutputStream("Files/file4.txt");
//        BufferedOutputStream bos = new BufferedOutputStream(fos);
//        ObjectOutputStream oos = new ObjectOutputStream(bos);
//
//        oos.writeObject(c);
//        oos.flush();
//        oos.close();

        FileInputStream fis = new FileInputStream("Files/file4.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Cricketer cr = (Cricketer)ois.readObject();
        cr.display();

        ois.close();

    }
}

//
//package IO;
//
//import java.io.*;
//
//class Cricketer implements Serializable {
//    private String name;
//    private int age;
//    private int runs;
//
//    public Cricketer(String name, int age, int runs) {
//        this.name = name;
//        this.age = age;
//        this.runs = runs;
//    }
//}
//
//public class launch10 {
//    public static void main(String[] args) {
//        Cricketer c = new Cricketer("Sachin", 44, 30000);
//
//        try (FileOutputStream fos = new FileOutputStream("Files/file4.txt");
//             BufferedOutputStream bos = new BufferedOutputStream(fos);
//             ObjectOutputStream oos = new ObjectOutputStream(bos)) {
//
//            // Writing the serialized Cricketer object to the file
//            oos.writeObject(c);
//            // Flushing the ObjectOutputStream to ensure data is written to the file
//            oos.flush();
//
//        } catch (IOException e) {
//            // Handle IOException if any file writing operations fail
//            e.printStackTrace();
//        }
//    }
//}
