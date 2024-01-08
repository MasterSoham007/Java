package Abstraction;

abstract class Aeroplane1{

//    abstract int age;    abstract is not applicable to variables
//    abstract keyword cannot be used to constructors as well due to by default presence of super(); keyword.
    abstract public void takeoff();
    abstract public void fly();

    public void landing(){
        System.out.println("Aeroplane is landing");
    }
}

class CargoPlane1 extends Aeroplane1{

    public void takeoff(){
        System.out.println("CargoPlane requires longer runway");
    }
    public void fly(){
        System.out.println("CargoPlane flies at a lower height");
    }

    public void alert(){
        System.out.println("Alert..");
    }

}

class PassengerPlane1 extends Aeroplane1{

    public void takeoff(){
        System.out.println("PassengerPlane requires medium size runway");
    }
    public void fly(){                                    // overriding method
        System.out.println("PassengerPlane flies at medium height");
    }
}

public class Launch1 {
    public static void main(String[] args) {
        Aeroplane1 ref1 = new CargoPlane1();
        ref1.takeoff();
        ref1.fly();
        ref1.landing();
//        ref1.alert();        parent type reference cannot access specialized methods
        ((CargoPlane1)ref1).alert(); // Down casting:- changing reference type of parent type to child type in order to access the specialized method of a child class.
        Aeroplane1 ref2 = new PassengerPlane1();
        ref2.takeoff();
        ref2.fly();
        ref2.landing();

//        Aeroplane1 ref = new Aeroplane1();       object of an abstract class cannot be made
    }
}
