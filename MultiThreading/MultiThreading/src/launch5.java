import java.util.*;

class MyThread2 extends Thread{
    public void run(){
        String name = Thread.currentThread().getName();

        if(name.equals("CALC")){
            calc();
        }
        else {
            message();
        }
    }

    public void calc(){
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

    public void message(){
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


public class launch5 {
    public static void main(String[] args) {

        System.out.println("Main thread started");

        MyThread2 thread1 = new MyThread2();
        MyThread2 thread2 = new MyThread2();

        thread1.setName("CALC");
        thread2.setName("PRINT");

        thread1.start();
        thread2.start();
    }
}
