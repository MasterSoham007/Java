//package IO;
//
//import java.io.*;
//
//public class launch4 {
//    public static void main(String[] args) throws IOException {
//        File dir = new File("Files");
//        File file = new File(dir, "file1.txt");
//        file.createNewFile();
//
//        FileWriter fw = new FileWriter(file, true); // append is by default false
//
//        fw.write("soham");
//        fw.write("\n");
//        fw.write(65);
//        fw.write("\n");
//        fw.write(97);
//        fw.write("\n");
//        char ch[] = {'j', 'a', 'v', 'a'};
//        fw.write(ch);
//        fw.write("\n");
//
////        fw.close();
//
//        fw.flush();
//    }
//}

package IO;

import java.io.*;

public class launch4 {
    public static void main(String[] args) {
        File dir = new File("Files");
        File file = new File(dir, "file1.txt");

        try (FileWriter fw = new FileWriter(file, true)) {
            // Writing "soham" to the file
            fw.write("soham");
            fw.write("\n");

            // Writing the integer 65 to the file
            fw.write(65);
            fw.write("\n");

            // Writing the integer 97 to the file
            fw.write(97);
            fw.write("\n");

            // Writing the char array {'j', 'a', 'v', 'a'} to the file
            char ch[] = {'j', 'a', 'v', 'a'};
            fw.write(ch);
            fw.write("\n");

            // No need to explicitly close the FileWriter due to try-with-resources
        } catch (IOException e) {
            // Handle IOException if any of the file operations fail
            e.printStackTrace();
        }
    }
}

