public class VehicleApp {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle("vehicle", "car", "Honda", "Accord");

        System.out.println("Name: " + myVehicle.getName());
        System.out.println("Type: " + myVehicle.getType());
        System.out.println("Make: " + myVehicle.getMake());
        System.out.println("Model: " + myVehicle.getModel());
    }
}
