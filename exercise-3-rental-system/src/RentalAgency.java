import java.util.ArrayList;
import java.util.List;

public class RentalAgency {

    private String agencyName;
    private List<Vehicle> fleet;

    public RentalAgency (String agencyName) {
        this.agencyName = agencyName;
        this.fleet = new ArrayList<>();
    }

    public void displayAgencyName() {
        System.out.println("Agency Name : " + agencyName);
    }

    public void addVehicle (Vehicle vehicle) {
        fleet.add(vehicle);
        System.out.println("Vehicle added successfully.");
    }

    public void displayAvailableVehicles() {
        System.out.println("\nAvailable Vehicles : ");
        System.out.println();
        for (int i = 0 ; i < fleet.size() ; i++) {
            if (fleet.get(i).getIsRented() == false) {
                fleet.get(i).displayDetails();
                System.out.println();
            }
        }
    }

    public void rentVehicle (String licensePlate,int days) {
        if (days <= 0)
            System.out.println("Error : Number of days must be positive.");
        else {
            boolean found = false;
            for (int i = 0 ; i < fleet.size() ; i++) {
                if (fleet.get(i).getLicensePlate().equals(licensePlate)) {
                    found = true;
                    if (fleet.get(i).getIsRented() == true) {
                        System.out.println("Error : Vehicle is already rented.");
                        break;
                    } else {
                        fleet.get(i).rentVehicle();
                        System.out.println("Rental successful.");
                        System.out.print("Total Cost : $");
                        fleet.get(i).calculateRentalCost(days);
                        break;
                    }
                }
            }
            if (found == false)
                System.out.println("Error : Vehicle not found.");
        }
    }

    public void returnVehicle(String licensePlate) {
        boolean found = false;
        for (int i = 0 ; i < fleet.size() ; i++) {
            if (fleet.get(i).getLicensePlate().equals(licensePlate)) {
                found = true;
                if (fleet.get(i).getIsRented() == true) {
                    fleet.get(i).returnVehicle();
                    System.out.println("Vehicle returned successfully.");
                } else {
                    System.out.println("Error : Vehicle is not rented.");
                }
                break;
            }
        }
        if (found == false)
            System.out.println("Error : Vehicle not found.");
    }

}