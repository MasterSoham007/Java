//package IO;
//
//import java.io.*;
//
//public class launch5 {
//    public static void main(String[] args)throws IOException {
//        File dir = new File("Files");
//        File file = new File(dir, "file1.txt");
//
//        FileReader fr = new FileReader(file);
//        int i = fr.read();
//
//        while(i!= -1){
//            System.out.print(i + "----> ");
//            System.out.println((char)i);
//            i = fr.read();
//        }
//    }
//}


package IO;

import java.io.*;

public class launch5 {
    public static void main(String[] args) {
        File dir = new File("Files");
        File file = new File(dir, "file1.txt");

        try (FileReader fr = new FileReader(file)) {
            int i = fr.read();

            while (i != -1) {
                System.out.print(i + "----> ");
                System.out.println((char) i);
                i = fr.read();
            }
        } catch (IOException e) {
            // Handle IOException if any file reading operations fail
            e.printStackTrace();
        }
    }
}
