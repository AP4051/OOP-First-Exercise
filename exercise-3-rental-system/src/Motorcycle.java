public class Motorcycle extends Vehicle {
    private boolean hasHelmetIncluded;

    public Motorcycle(String licensePlate, String model, double dailyRate, boolean hasHelmetIncluded) {
        super(licensePlate, model, dailyRate);
        this.hasHelmetIncluded = hasHelmetIncluded;
    }

    public boolean getHasHelmetIncluded() {
        return hasHelmetIncluded;
    }

    public void setHasHelmetIncluded(boolean hasHelmetIncluded) {
        this.hasHelmetIncluded = hasHelmetIncluded;
    }

    @Override
    public double calculateRentalCost(int days) {
        double cost = getDailyRate() * days;
        if (days >= 7) {
            cost = cost * 0.9; // 10 percent discount
        }
        return cost;
    }

    @Override
    public void displayDetails() {
        System.out.println("Motorcycle: " + getModel() + " (" + getLicensePlate() + "), Helmet: " + hasHelmetIncluded + ", Rate: $" + getDailyRate() + ", Rented: " + getIsRented());
    }
}
