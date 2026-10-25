public class Main {
    public static void main(String[] args) {

        RentalAgency agency = new RentalAgency("City Wheels");

        Car car = new Car("ABC-123", "Toyota Camry", 50, 5);
        Motorcycle motorcycle = new Motorcycle(
            "XYZ-789", "Yamaha MT-07", 30, true
        );

        agency.addVehicle(car);
        agency.addVehicle(motorcycle);

        System.out.println("\n--- Available Vehicles ---");
        agency.displayAvailableVehicles();

        System.out.println("\n--- Rent Car ---");
        agency.rentVehicle("ABC-123", 3);

        System.out.println("\n--- Try Renting Again ---");
        agency.rentVehicle("ABC-123", 3);

        System.out.println("\n--- Return Car ---");
        agency.returnVehicle("ABC-123");

        System.out.println("\n--- Available After Return ---");
        agency.displayAvailableVehicles();

        System.out.println("\n--- Rent Motorcycle for 7 Days ---");
        agency.rentVehicle("XYZ-789", 7);
    }
}

