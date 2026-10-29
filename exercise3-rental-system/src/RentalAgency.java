import java.util.ArrayList;
import java.util.List;


public class RentalAgency {

    private String agencyName;
    private List<Vehicle> fleet;

    public RentalAgency(String agencyName) {
        this.agencyName = agencyName;
        this.fleet = new ArrayList<>();
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void addVehicle(Vehicle vehicle) {
        if (vehicle != null) {
            fleet.add(vehicle);
        }
    }

    // private helper: find a vehicle by license plate
    private Vehicle findVehicle(String licensePlate) {
        for (Vehicle v : fleet) {
            if (v.getLicensePlate().equalsIgnoreCase(licensePlate)) {
                return v;
            }
        }
        return null;
    }

    public void displayAvailableVehicles() {
        System.out.println("=== Available vehicles at " + agencyName + " ===");
        boolean found = false;
        for (Vehicle v : fleet) {
            if (!v.isRented()) {
                v.displayDetails();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No vehicles available.");
        }
    }

    public void rentVehicle(String licensePlate, int days) {
        if (days <= 0) {
            System.out.println("Error: number of days must be greater than 0.");
            return;
        }

        Vehicle vehicle = findVehicle(licensePlate);

        if (vehicle == null) {
            System.out.println("Error: vehicle with plate " + licensePlate + " not found.");
            return;
        }
        if (vehicle.isRented()) {
            System.out.println("Error: vehicle " + licensePlate + " is already rented.");
            return;
        }

        vehicle.rentVehicle();
        double totalCost = vehicle.calculateRentalCost(days);

        System.out.println("— Rental Confirmation —");
        System.out.println("Agency: " + agencyName);
        System.out.println("Vehicle: " + vehicle.getModel() + " (" + vehicle.getLicensePlate() + ")");
        System.out.println("Days: " + days);
        System.out.println("Total cost: $" + totalCost);
        System.out.println("—————————");


    }


    public void returnVehicle(String licensePlate) {
        Vehicle vehicle = findVehicle(licensePlate);

        if (vehicle == null) {
            System.out.println("Error: vehicle with plate " + licensePlate + " not found.");
            return;
        }
        if (!vehicle.isRented()) {
            System.out.println("Error: vehicle " + licensePlate + " was not rented.");
            return;
        }

        vehicle.returnVehicle();
        System.out.println("Vehicle " + vehicle.getModel() + " (" + licensePlate + ") returned successfully.");
    }



}