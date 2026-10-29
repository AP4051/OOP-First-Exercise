public class Motorcycle extends Vehicle {

    private static final int longTermDays = 7;
    private static final double discountRate = 0.07;

    private boolean hasHelmetIncluded;

    public Motorcycle(String licensePlate, String model, double dailyRate, boolean hasHelmetIncluded) {
        super(licensePlate, model, dailyRate);
        this.hasHelmetIncluded = hasHelmetIncluded;
    }


    public boolean hasHelmetIncluded() {
        return hasHelmetIncluded;
    }

    public void setHasHelmetIncluded(boolean hasHelmetIncluded) {
        this.hasHelmetIncluded = hasHelmetIncluded;
    }

    @Override
    public double calculateRentalCost(int days) {
        double cost = super.calculateRentalCost(days);
        if (days >= longTermDays) {
            cost = cost * (1 - discountRate);
        }
        return cost;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("   Type: Motorcycle | Helmet included: " + (hasHelmetIncluded ? "Yes" : "No"));
    }

}
