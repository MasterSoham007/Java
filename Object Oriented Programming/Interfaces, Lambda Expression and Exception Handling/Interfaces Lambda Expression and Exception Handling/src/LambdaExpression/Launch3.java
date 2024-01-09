package LambdaExpression;

interface Car1{
    void drive();
}

interface Car2{
    void drive(int wheels);
}

interface Car3{
    void drive(int wheels, float speed);
}

public class Launch3 {
    public static void main(String[] args) {
        Car1 obj = () -> System.out.println("driving..");
        obj.drive();

        Car2 obj1 = wheels -> System.out.println("driving.."+ wheels);
        obj1.drive(3);

        Car3 obj2 = (wheels,speed) -> System.out.println("driving.."+ wheels + speed);
        obj2.drive(4, 90.5f);
    }
}
