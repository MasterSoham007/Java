//package IO;
//
//import java.io.*;
//
//public class launch6 {
//    public static void main(String[] args)throws IOException {
//        File dir = new File("Files");
//        File file = new File(dir, "file1.txt");
//
//        FileReader fr = new FileReader(file);
//
//        char ch[] = new char[(int)file.length()];
//        fr.read(ch);
//
//        for(char data : ch){
//            System.out.print(data);
//        }
//    }
//}

package IO;

import java.io.*;

public class launch6 {
    public static void main(String[] args) {
        File dir = new File("Files");
        File file = new File(dir, "file1.txt");

        try (FileReader fr = new FileReader(file)) {
            char[] ch = new char[(int) file.length()];
            int bytesRead = fr.read(ch);

            if (bytesRead != -1) {
                // Print the contents of the character array
                for (char data : ch) {
                    System.out.print(data);
                }
            } else {
                System.out.println("File is empty.");
            }
        } catch (IOException e) {
            // Handle IOException if any file reading operations fail
            e.printStackTrace();
        }
    }
}
