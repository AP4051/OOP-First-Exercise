 public class Main {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency("City Wheels");
        Car car = new Car("CAR-101", "Toyota Camry", 50, 5);
        Motorcycle motorcycle = new Motorcycle("MOTO-202", "Yamaha MT-07", 30, true);

         agency.addVehicle(car);
        agency.addVehicle(motorcycle);
        agency.displayAvailableVehicles();

         System.out.println("\\n--- Renting the car for 3 days ---");
        agency.rentVehicle("CAR-101", 3);

          System.out.println("\\n--- Trying to rent the same car again ---");
        agency.rentVehicle("CAR-101", 3);

         System.out.println("\\n--- Available vehicles while car is rented ---");
        agency.displayAvailableVehicles();

          System.out.println("\\n--- Returning the car ---");
        agency.returnVehicle("CAR-101");

          System.out.println("\\n--- Available vehicles after return ---");
        agency.displayAvailableVehicles();

            System.out.println("\\n--- Motorcycle rental for 7 days ---");
        System.out.println("Motorcycle cost: $" + motorcycle.calculateRentalCost(7));
    }
  } 