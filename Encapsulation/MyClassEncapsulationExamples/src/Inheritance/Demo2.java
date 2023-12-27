package Inheritance;

class Car{
    public void color(){
        System.out.println("My car color is red");
    }

    public void speed(){
        System.out.println("My car speed is 320 km/hr");
    }
}

class Tata extends Car{
    @Override
    public void speed(){
        System.out.println("My car speed is 200 km/hr");
    }


    // Specialized method
    public void cost(){
        System.out.println("My car cost is Rs 2000000");
    }
}

public class Demo2 {
    public static void main(String[] args) {
//        Tata t = new Tata(); // tight coupling
        
        Car c = new Tata(); // loose coupling
        c.color();
        c.speed();
        ((Tata)c).speed(); //downcasting
        ((Tata)c).cost(); //downcasting
    }
}
