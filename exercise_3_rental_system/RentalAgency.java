 import java.util.ArrayList;
import java.util.List;
public class RentalAgency {
    private String agencyName;
    private List<Vehicle> fleet;

       public RentalAgency(String agencyName) {
        this.agencyName = agencyName;
        this.fleet = new ArrayList<>();
    }

         public void addVehicle(Vehicle vehicle) { fleet.add(vehicle); }

            public void displayAvailableVehicles() {
        System.out.println("\\nAvailable vehicles at " + agencyName + ":");
        boolean found = false;
        for (Vehicle vehicle : fleet) {
            if (!vehicle.isRented()) {
                vehicle.displayDetails();
                System.out.println("--------------------");
                found = true;
            }
        }
        if (!found) System.out.println("No vehicles are currently available.");
    }

           public void rentVehicle(String licensePlate, int days) {
        if (days <= 0) {
            System.out.println("Error: Rental days must be positive.");
            return;
        }
        for (Vehicle vehicle : fleet) {
            if (vehicle.getLicensePlate().equalsIgnoreCase(licensePlate)) {
                if (vehicle.isRented()) {
                    System.out.println("Error: This vehicle is already rented.");
                    return;
                }
                double cost = vehicle.calculateRentalCost(days);
                vehicle.rentVehicle();
                System.out.println("Rental confirmed at " + agencyName);
                System.out.println("Vehicle: " + vehicle.getModel());
                System.out.println("Days: " + days);
                System.out.println("Total cost: $" + cost);
                return;
            }
        }
        System.out.println("Error: Vehicle with plate " + licensePlate + " was not found.");
    }
        
           public void returnVehicle(String licensePlate) {
        for (Vehicle vehicle : fleet) {
            if (vehicle.getLicensePlate().equalsIgnoreCase(licensePlate)) {
                if (!vehicle.isRented()) {
                    System.out.println("Error: This vehicle is not currently rented.");
                    return;
                }
                vehicle.returnVehicle();
                System.out.println(vehicle.getModel() + " has been returned successfully.");
                return;
            }
        }
        System.out.println("Error: Vehicle with plate " + licensePlate + " was not found.");
    }
  }