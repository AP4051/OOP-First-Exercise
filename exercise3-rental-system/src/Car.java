public class Car extends Vehicle {

    private static final double serviceFee = 11.0;

    private int numberOfSeats;

    public Car(String licensePlate, String model, double dailyRate, int numberOfSeats) {
        super(licensePlate, model, dailyRate);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public double calculateRentalCost(int days) {

        return super.calculateRentalCost(days) + serviceFee;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("   Type: Car | Seats: " + numberOfSeats);
    }



}