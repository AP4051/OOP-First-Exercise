import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private String agencyName;
    private List<Vehicle> fleet;

    public RentalAgency(String agencyName) {
        this.agencyName = agencyName;
        this.fleet = new ArrayList<Vehicle>();
    }

    public String getAgencyName() {
        return agencyName;
    }

    public List<Vehicle> getFleet() {
        return fleet;
    }

    public void addVehicle(Vehicle v) {
        fleet.add(v);
    }

    public void displayAvailableVehicles() {
        System.out.println("\nAvailable vehicles in " + agencyName + ":");
        for (int i = 0; i < fleet.size(); i++) {
            Vehicle v = fleet.get(i);
            if (!v.getIsRented()) {
                v.displayDetails();
            }
        }
    }

    public double rentVehicle(String licensePlate, int days) {
        Vehicle target = null;
        for (Vehicle v : fleet) {
            if (v.getLicensePlate().equals(licensePlate)) {
                target = v;
                break;
            }
        }

        if (target == null) {
            System.out.println("Error: Vehicle " + licensePlate + " not found!");
            return -1;
        }

        if (target.getIsRented()) {
            System.out.println("Error: Vehicle " + licensePlate + " is already rented!");
            return -1;
        }

        target.rentVehicle();
        double totalCost = target.calculateRentalCost(days);
        System.out.println("Successfully rented " + licensePlate + " for " + days + " days. Total: $" + totalCost);
        return totalCost;
    }

    public void returnVehicle(String licensePlate) {
        Vehicle target = null;
        for (Vehicle v : fleet) {
            if (v.getLicensePlate().equals(licensePlate)) {
                target = v;
                break;
            }
        }

        if (target == null) {
            System.out.println("Error: Vehicle " + licensePlate + " not found!");
            return;
        }

        if (!target.getIsRented()) {
            System.out.println("Error: Vehicle " + licensePlate + " was not rented!");
            return;
        }

        target.returnVehicle();
        System.out.println("Vehicle " + licensePlate + " returned successfully.");
    }
}

