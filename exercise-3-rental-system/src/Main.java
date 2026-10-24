public class Main {
    public static void main(String[] args) {

        RentalAgency agency = new RentalAgency("City Wheels");
        Car car = new Car("ABC-123","Toyota Camry",50,5);
        Motorcycle motorcycle = new Motorcycle("XYZ-789","Yamaha MT-07",30,true);

        agency.addVehicle(car);
        agency.addVehicle(motorcycle);
        agency.displayAvailableVehicles();

        System.out.println("Renting Vehicle...");
        agency.rentVehicle("ABC-123",3);

        System.out.println("\nRenting Vehicle again...");
        agency.rentVehicle("ABC-123",3);
        
        System.out.println("\nReturning Vehicle...");
        agency.returnVehicle("ABC-123");
        agency.displayAvailableVehicles();
    }
}