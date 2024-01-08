package Inheritance;

class Aeroplane{
    public void takeoff(){                             // Inherited method
        System.out.println("Aeroplane is taking off");
    }

    public void fly(){
        System.out.println("Aeroplane is flying");
    }
}

class CargoPlane extends Aeroplane{
    public void fly(){
        System.out.println("CargoPlane flies at a lower height");
    }  // Overriding method

    public void carryGoods(){
        System.out.println("CargoPlane carries goods");
    } // Specialized method
}

class PassengerPlane extends Aeroplane{
    public void fly(){                                    // overriding method
        System.out.println("PassengerPlane flies at medium height");
    } // Overriding method

    public void carryPassengers(){                        // specialized method
        System.out.println("PassengerPlane carries passengers");
    } // Specialized method
}

public class Launch6 {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        cp.takeoff();
        cp.fly();

        PassengerPlane pp = new PassengerPlane();
        pp.takeoff();
        pp.fly();
    }
}
