package LambdaExpression;

interface Car{
    void drive();
}

public class Launch2 {
    public static void main(String[] args) {
        Car obj = new Car(){
          public void drive(){
              System.out.println("driving..");
          }
        };         // anonymous inner class

        obj.drive();
    }
}
