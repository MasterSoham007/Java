import java.util.*;

class Calc extends Thread{
    public void run(){
        System.out.println("Calculation task started");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first Number: ");
        int num1 = sc.nextInt();

        System.out.println("Please enter the second Number: ");
        int num2 = sc.nextInt();

        int res = num1 + num2;
        System.out.println(res);
        System.out.println("Calculation task ended");

        System.out.println("******************************************");

    }
}

class Message extends Thread{
    public void run(){
        System.out.println("Displaying important message task");
        try{
            for (int i = 0; i < 3; i++){
                System.out.println("Focus is important to master skills");
                Thread.sleep(2000);
            }
        }
        catch (Exception e){
            System.out.println("Some problem");
        }
        System.out.println("Displaying important message task ended");
    }
}

public class launch3 {
    public static void main(String[] args) {

        System.out.println("Main thread started");
        Calc t1 = new Calc();

        Message t2 = new Message();

        t1.start();
        t2.start();
    }
}
