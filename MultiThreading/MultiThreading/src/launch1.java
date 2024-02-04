public class launch1 {
    public static void main(String[] args) {
        System.out.println("Main thread");
        System.out.println("Before changing");

        String name = Thread.currentThread().getName();
        System.out.println("THe name of the main thread is " + name);
        System.out.println("The priority of the main thread is " + Thread.currentThread().getPriority());

        System.out.println("After Changing");
        Thread t = Thread.currentThread();
        t.setName("Soham");
        t.setPriority(1);

        String name1 = Thread.currentThread().getName();
        System.out.println("The name of the main thread is " + name1);
        System.out.println("The priority of the main thread is " + Thread.currentThread().getPriority());
    }
}
