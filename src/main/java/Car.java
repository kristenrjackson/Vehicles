public class Car extends Vehicle {      // This is an example of inheritance - we can extend a class
    public String speed = "60 mph";     // with child classes that inherit the fields and methods of
    public int numberOfDoors = 4;       // the parent class. Allows for code reusability. The "extends"
                                        // keyword creates a child class.
    public void driving() {
        System.out.println("Someone is driving the car.");
    }

    public void driving(int speed) {
        System.out.println("Someone is driving the car " + speed + "miles per hour.");
    }

    public void driving(String type, int speed) {
        System.out.println("Someone is driving the " + type + " at a speed of " + speed + " miles per hour.");
    }

    public void driving(String type, String make, String model, int speed) {
        System.out.println("Someone is driving the " + type + ", which is a " + make + " " + model + ", at " + speed +
                "miles per hour.");
    }

    public void numberOfDoors() {
        System.out.println("This car has four doors.");
    }

    public void fuel() {
        System.out.println("This car runs on gasoline.");
    }

    public void increaseSpeed() {
        System.out.println("Speeding up...");
    }

    public void decreaseSpeed() {
        System.out.println("Slowing down...");
    }
}
