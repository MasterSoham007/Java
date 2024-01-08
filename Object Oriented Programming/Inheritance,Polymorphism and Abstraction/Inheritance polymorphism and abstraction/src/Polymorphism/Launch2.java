package Polymorphism;

class Aeroplane2{
    public void takeoff(){                             // Inherited method
        System.out.println("Aeroplane is taking off");
    }

    public void fly(){
        System.out.println("Aeroplane is flying");
    }
}

class CargoPlane2 extends Aeroplane2{

    public void takeoff(){
        System.out.println("CargoPlane requires longer runway");
    }
    public void fly(){
        System.out.println("CargoPlane flies at a lower height");
    }

}

class PassengerPlane2 extends Aeroplane2{

    public void takeoff(){
        System.out.println("PassengerPlane requires medium size runway");
    }
    public void fly(){                                    // overriding method
        System.out.println("PassengerPlane flies at medium height");
    }
}


class FighterPlane2 extends Aeroplane2{

    public void takeoff(){
        System.out.println("FighterPlane requires small size runway");
    }
    public void fly(){                                    // overriding method
        System.out.println("FighterPlane flies at high height");
    }
}

class Airport{
    public void poly(Aeroplane2 ref){
        ref.takeoff();
        ref.fly();
        System.out.println("--------------------------------------------------");
    }
}


public class Launch2 {
    public static void main(String[] args) {
        CargoPlane2 cp = new CargoPlane2();
        PassengerPlane2 pp = new PassengerPlane2();
        FighterPlane2 fp = new FighterPlane2();

        Airport a = new Airport();
        a.poly(cp);
        a.poly(pp);
        a.poly(fp);

//        ref = cp;
//        ref.takeoff();
//        ref.fly();
//
//        System.out.println("--------------------------------------------------");
//
//        ref = pp;
//        ref.takeoff();
//        ref.fly();
    }
}
