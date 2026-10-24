public class Vehicle {

    private String licensePlate;
    private String model;
    private double dailyRate;
    private boolean isRented;

    public Vehicle (String licensePlate,String model,double dailyRate) {
        this.licensePlate = licensePlate;
        this.model = model;
        this.isRented = false;
        if (dailyRate >= 0)
            this.dailyRate = dailyRate;
        else
            System.out.println("Error : Daily Rate amount must be positive.");
    }

    public String getLicensePlate () {
        return licensePlate;
    }

    public String getModel () {
        return model;
    }

    public double getDailyRate () {
        return dailyRate;
    }

    public boolean getIsRented () {
        return isRented;
    }

    public void rentVehicle () {
        isRented = true;
    }

    public void returnVehicle () {
        isRented = false;
    }

    public void calculateRentalCost(int days) {
        if (days > 0)
            System.out.println(dailyRate * days);
        else
            System.out.println("Error : Number of Days must be positive.");
    }

    public void displayDetails() {
        System.out.println("License Plate : " + licensePlate);
        System.out.println("Model : " + model);
        System.out.println("Daily Rate : $" + dailyRate);
        if (isRented)
            System.out.println("Status : Rented");
        else
            System.out.println("Status : Available");
    }

}