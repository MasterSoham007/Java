package ExceptionHandling;

// unchecked exception vs checked exception

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Launch6 {
    public static void main(String[] args) {
        int result = 8/0;   // unchecked exception

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // checked exception
        try {
            String str = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
