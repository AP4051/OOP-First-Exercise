public class Main {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency("City Wheels");

        Car car = new Car("ABC-123", "Toyota Camry", 50.0, 5);
        Motorcycle bike = new Motorcycle("MOTO-77", "Yamaha MT-07", 30.0, true);

        agency.addVehicle(car);
        agency.addVehicle(bike);

        System.out.println("--- All Available ---");
        agency.displayAvailableVehicles();

        System.out.println("\n--- Renting Car ---");
        agency.rentVehicle("ABC-123", 3);

        System.out.println("\n--- Renting Car Again (Should Fail) ---");
        agency.rentVehicle("ABC-123", 3);

        System.out.println("\n--- Available After Rent ---");
        agency.displayAvailableVehicles();

        System.out.println("\n--- Returning Car ---");
        agency.returnVehicle("ABC-123");

        System.out.println("\n--- Available After Return ---");
        agency.displayAvailableVehicles();
    }
}

