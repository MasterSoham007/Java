//package IO;
//import java.io.*;
//public class launch9 {
//    public static void main(String[] args)throws IOException {
//        File dir = new File("Files");
//        File file = new File(dir, "file3.txt");
//
//        FileWriter fw = new FileWriter(file);
//        PrintWriter pw = new PrintWriter(fw);
//
//        pw.write(97);
//        pw.write("\n");
//
//        pw.println("Java");
//        pw.println(100);
//        pw.println('a');
//        pw.println(50.5);
//        pw.println(true);
//
//        pw.close();
//    }
//}

package IO;

import java.io.*;

public class launch9 {
    public static void main(String[] args) {
        File dir = new File("Files");
        File file = new File(dir, "file3.txt");

        try (FileWriter fw = new FileWriter(file, true);
             PrintWriter pw = new PrintWriter(fw)) {

            // Writing an integer and a newline character
            pw.write(97);
            pw.write("\n");

            // Writing various data types using println
            pw.println("Java");
            pw.println(100);
            pw.println('a');
            pw.println(50.5);
            pw.println(true);

        } catch (IOException e) {
            // Handle IOException if any file writing operations fail
            e.printStackTrace();
        }
    }
}
