//package IO;
//
//import java.io.*;
//public class launch8 {
//    public static void main(String[] args)throws IOException {
//        File dir = new File("Files");
//        File file = new File(dir, "file2.txt");
//
//        FileReader fr = new FileReader(file);
//        BufferedReader br = new BufferedReader(fr);
//
//        String line = br.readLine();
//
//        while(line!= null){
//            System.out.println(line);
//            line = br.readLine();
//        }
//    }
//}

package IO;

import java.io.*;

public class launch8 {
    public static void main(String[] args) {
        File dir = new File("Files");
        File file = new File(dir, "file2.txt");

        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {

            // Reading the first line from the file
            String line = br.readLine();

            while (line != null) {
                // Printing the line to the console
                System.out.println(line);
                // Reading the next line
                line = br.readLine();
            }
        } catch (IOException e) {
            // Handle IOException if any file reading operations fail
            e.printStackTrace();
        }
    }
}
