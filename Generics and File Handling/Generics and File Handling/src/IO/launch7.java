//package IO;
//import java.io.*;
//
//public class launch7 {
//    public static void main(String[] args)throws IOException {
//        File dir = new File("Files");
//        File file = new File(dir, "file2.txt");
//
//        FileWriter fw = new FileWriter(file, true);
//        BufferedWriter bw = new BufferedWriter(fw);
//
//        bw.write("Java");
//        bw.newLine();
//        bw.write(65);
//        bw.newLine();
//        char ch[] = {'s', 'o', 'h', 'a', 'm'};
//        bw.write(ch);
//
//        bw.flush();
//        bw.close();
//    }
//}

package IO;

import java.io.*;

public class launch7 {
    public static void main(String[] args) {
        File dir = new File("Files");
        File file = new File(dir, "file2.txt");

        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter bw = new BufferedWriter(fw)) {

            // Writing "Java" to the file
            bw.write("Java");
            bw.newLine();

            // Writing the integer 65 to the file
            bw.write(65);
            bw.newLine();

            // Writing the char array {'s', 'o', 'h', 'a', 'm'} to the file
            char[] ch = {'s', 'o', 'h', 'a', 'm'};
            bw.write(ch);

            // Flush the BufferedWriter to ensure data is written to the file
            bw.flush();
        } catch (IOException e) {
            // Handle IOException if any file writing operations fail
            e.printStackTrace();
        }
    }
}

