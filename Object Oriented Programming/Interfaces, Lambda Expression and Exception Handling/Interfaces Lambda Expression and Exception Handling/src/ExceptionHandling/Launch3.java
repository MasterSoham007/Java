package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Launch3 {
    public static void main(String[] args) {
        int num = 0;
//        Scanner sc = new Scanner(System.in);
//        try{
//            num = sc.nextInt();
//        }
//
//        catch (InputMismatchException e){
//            System.out.println("Enter a number");
//        }
//
//        finally {
//            sc.close();
//        }

        // try with resource
        try(Scanner sc = new Scanner(System.in)){
            num = sc.nextInt();
        }

        catch (InputMismatchException e){
            System.out.println("Enter a number" + e);
        }

        System.out.println(num);

        // try can work without catch and finally but, catch and finally cannot work without try block
        // finally block is generally used to close resources
        // DRY - do not repeat yourself
    }
}
