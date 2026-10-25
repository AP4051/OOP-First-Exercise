import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private String agencyName;
    private List<Vehicle> fleet;

    public RentalAgency(String agencyName) {
        this.agencyName = agencyName;
        this.fleet = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        if (vehicle == null) {
            System.out.println("Invalid vehicle!");
            return;
        }

        for (Vehicle v : fleet) {
            if (v.getLicensePlate().equals(vehicle.getLicensePlate())) {
                System.out.println("Vehicle already exists!");
                return;
            }
        }

        fleet.add(vehicle);
        System.out.println("Vehicle added: " + vehicle.getModel());
    }

    public void displayAvailableVehicles() {
        System.out.println("Available vehicles at " + agencyName + ":");

        for (Vehicle vehicle : fleet) {
            if (!vehicle.isRented()) {
                vehicle.displayDetails();
                System.out.println("--------------------");
            }
        }
    }

    public void rentVehicle(String licensePlate, int days) {
        if (days <= 0) {
            System.out.println("Invalid rental duration!");
            return;
        }

        for (Vehicle vehicle : fleet) {
            if (vehicle.getLicensePlate().equals(licensePlate)) {
                if (vehicle.isRented()) {
                    System.out.println("Vehicle is already rented!");
                    return;
                }

                double cost = vehicle.calculateRentalCost(days);
                vehicle.rentVehicle();

                System.out.println("Rental successful!");
                System.out.println("Vehicle: " + vehicle.getModel());
                System.out.println("Total cost: $" + cost);
                return;
            }
        }

        System.out.println("Vehicle not found!");
    }

    public void returnVehicle(String licensePlate) {
        for (Vehicle vehicle : fleet) {
            if (vehicle.getLicensePlate().equals(licensePlate)) {
                if (!vehicle.isRented()) {
                    System.out.println("Vehicle is not rented!");
                    return;
                }

                vehicle.returnVehicle();
                System.out.println("Vehicle returned successfully!");
                return;
            }
        }

        System.out.println("Vehicle not found!");
    }
}
