public class Vehicle {                  // This is an example of encapsulation;
    private String name = "vehicle";    // this class is fully encapsulated.
    private String type;
    private String make;
    private String model;


    Vehicle() {
    }

    Vehicle(String name, String type, String make, String model) {
        this.name = name;
        this.type = type;
        this.make = make;
        this.model = model;
    }

    public String getName() { return name; }

    public String getType() {
        return type;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void fuel() {
        System.out.println("This " + name + " runs on gasoline.");
    }
}
