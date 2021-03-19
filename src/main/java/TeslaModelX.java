public class TeslaModelX extends Car{                           // These are example of polymorphism where we
    @Override                                                   // override a method from the class "Car".
    public void fuel() {
        System.out.println("This car runs on electricity.");
    }

    @Override
    public void numberOfDoors() {
        System.out.println("This car has two doors.");
    }
}
