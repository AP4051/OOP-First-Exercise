public class Main {
    public static void main(String[] args) {

        RentalAgency agency = new RentalAgency("City Wheels");


        agency.addVehicle(new Car("ABC-123", "Toyota Camry", 50.0, 5));
        agency.addVehicle(new Motorcycle("MOTO-77", "Yamaha MT-07", 30.0, true));

        agency.rentVehicle("ABC-123", 3);
        System.out.println();


        agency.rentVehicle("ABC-123", 2);
        System.out.println();


        agency.displayAvailableVehicles();
        System.out.println();


        agency.returnVehicle("ABC-123");
        System.out.println();


        agency.displayAvailableVehicles();
        System.out.println();


    }
}
