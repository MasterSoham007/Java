package Polymorphism;

class Aeroplane1{
    public void takeoff(){                             // Inherited method
        System.out.println("Aeroplane is taking off");
    }

    public void fly(){
        System.out.println("Aeroplane is flying");
    }
}

class CargoPlane1 extends Aeroplane1{

    public void takeoff(){
        System.out.println("CargoPlane requires longer runway");
    }
    public void fly(){
        System.out.println("CargoPlane flies at a lower height");
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
        CargoPlane1 cp = new CargoPlane1();
        PassengerPlane1 pp = new PassengerPlane1();

        Aeroplane1 ref;

        ref = cp;
        ref.takeoff();
        ref.fly();

        System.out.println("--------------------------------------------------");

        ref = pp;
        ref.takeoff();
        ref.fly();
    }
}
