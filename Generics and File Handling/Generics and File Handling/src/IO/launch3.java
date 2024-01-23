package IO;

import java.io.*;

public class launch3 {
    public static void main(String[] args) {
        // Creating a File object for a directory named "Files"
        File dir = new File("Files");

        try {
            // Checking if the File object represents a directory
            System.out.println(dir.isDirectory());

            // Creating the directory (if it doesn't exist)
            if (!dir.exists()) {
                dir.mkdir();
                System.out.println("Directory created successfully.");
            } else {
                System.out.println("Directory already exists.");
            }

            // Creating a File object for a file named "file1.txt" within the "Files" directory
            File file1 = new File(dir, "file1.txt");

            // Creating the file (if it doesn't exist)
            if (!file1.exists()) {
                file1.createNewFile();
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }

            // Checking if the File object represents a file
            System.out.println(file1.isFile());

            int count = 0;
            File f = new File("src/IO");

            String str[] = f.list();

            for(String name : str){
                count++;
                System.out.println(name);
            }

            System.out.println(count);
        } catch (IOException e) {
            // Handle IOException if any of the file operations fail
            e.printStackTrace();
        }
    }
}
