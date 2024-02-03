package Annotations;

//functional interface
@FunctionalInterface
interface Demo{
    void disp();
//    void disp2();
}


@Deprecated
class Plane{
    public void PlaneFliesAtGoodHeight(){
        System.out.println("Plane is Flying");
    }
}

class CargoPlane extends Plane{
    // overridden method from parent class
    @Override
    public void PlaneFliesAtGoodHeight(){
        System.out.println("cargoplane flies low");
    }
}
public class launch1 {
    public static void main(String[] args) {
        Plane p = new CargoPlane();
        p.PlaneFliesAtGoodHeight();
    }
}
