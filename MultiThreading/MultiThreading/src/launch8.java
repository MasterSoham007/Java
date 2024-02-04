
class library implements Runnable{
    String res1 = new String("JAVA");
    String res2 = new String("SQL");
    String res3 = new String("DSA");

    public void run(){
        String name = Thread.currentThread().getName();
        if(name.equals("STUDENT1")){
            try{
                Thread.sleep(3000);
                synchronized (res1)
                {
                    System.out.println("Student 1 has acquired " + res1);
                    Thread.sleep(3000);
                    synchronized (res2){
                        System.out.println("Student 1 has acquired " + res2);
                        Thread.sleep(3000);
                        synchronized (res3){
                            System.out.println("Student 1 has acquired " + res3);
                            Thread.sleep(3000);
                        }
                    }
                }
            }
            catch (Exception e){
                System.out.println("Some Problem");
            }
        }

        else {
            try{
                Thread.sleep(3000);
                synchronized (res3)
                {
                    System.out.println("Student 2 has acquired " + res3);
                    Thread.sleep(3000);
                    synchronized (res2){
                        System.out.println("Student 2 has acquired " + res2);
                        Thread.sleep(3000);
                        synchronized (res1){
                            System.out.println("Student 2 has acquired " + res1);
                            Thread.sleep(3000);
                        }
                    }
                }
            }
            catch (Exception e){
                System.out.println("Some Problem");
            }
        }
    }
}
public class launch8 {
    public static void main(String[] args) {
        library lib = new library();

        Thread t1 = new Thread(lib);
        Thread t2 = new Thread(lib);

        t1.setName("STUDENT1");
        t2.setName("STUDENT2");

        t1.start();
        t2.start();
    }
}
