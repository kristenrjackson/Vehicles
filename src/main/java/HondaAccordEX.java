public class HondaAccordEX extends Car implements Vehicle_I {
    public String make = "Honda";
    public String model = "Accord";

    @Override
    public void fuel() {
        System.out.println("The Honda Accord EX runs on gasoline.");
    }

    public void numberOfDoors() {
        System.out.println("The Honda Accord EX has four doors.");
    }

    public void steering() {
        System.out.println("You use a steering wheel to steer the Honda Accord EX.");
    }
}
