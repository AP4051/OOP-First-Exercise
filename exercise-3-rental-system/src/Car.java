public class Car extends Vehicle {
    private int numberOfSeats;
    private static final double SERVICE_FEE = 20.0;

    public Car(String licensePlate, String model,
               double dailyRate, int numberOfSeats) {
        super(licensePlate, model, dailyRate);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        if (numberOfSeats > 0) {
            this.numberOfSeats = numberOfSeats;
        } else {
            System.out.println("Invalid number of seats!");
        }
    }

    @Override
    public double calculateRentalCost(int days) {
        if (days <= 0) {
            return 0;
        }
        return super.calculateRentalCost(days) + SERVICE_FEE;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Seats: " + numberOfSeats);
    }
}
