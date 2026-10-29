public class Vehicle {

    private String licensePlate;
    private String model;
    private double dailyRate;
    private boolean isRented;

    public Vehicle(String licensePlate, String model, double dailyRate) {
        this.licensePlate = licensePlate;
        this.model = model;
        this.dailyRate = dailyRate;
        this.isRented = false;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getModel() {
        return model;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public boolean isRented() {
        return isRented;
    }

    public void rentVehicle() {
        this.isRented = true;
    }

    public void returnVehicle() {
        this.isRented = false;
    }

    public double calculateRentalCost(int days) {
        return dailyRate * days;
    }

    public void displayDetails() {
        System.out.println("Plate: " + licensePlate + " | Model: " + model
                + " | Daily Rate: $" + dailyRate
                + " | Status: " + (isRented ? "Rented" : "Available"));
    }


}
