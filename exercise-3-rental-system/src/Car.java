public class Car extends Vehicle {
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
        // 40 for extra insurance
        return (getDailyRate() * days) + 40;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car: " + getModel() + " (" + getLicensePlate() + "), Seats: " + numberOfSeats + ", Rate: $" + getDailyRate() + ", Rented: " + getIsRented());
    }
}

