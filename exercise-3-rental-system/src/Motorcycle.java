public class Motorcycle extends Vehicle {
    private boolean hasHelmetIncluded;
    private static final double WEEKLY_DISCOUNT = 0.10;

    public Motorcycle(String licensePlate, String model,
                      double dailyRate, boolean hasHelmetIncluded) {
        super(licensePlate, model, dailyRate);
        this.hasHelmetIncluded = hasHelmetIncluded;
    }

    public boolean isHasHelmetIncluded() {
        return hasHelmetIncluded;
    }

    public void setHasHelmetIncluded(boolean hasHelmetIncluded) {
        this.hasHelmetIncluded = hasHelmetIncluded;
    }

    @Override
    public double calculateRentalCost(int days) {
        if (days <= 0) {
            return 0;
        }

        double totalCost = super.calculateRentalCost(days);

        if (days >= 7) {
            totalCost = totalCost * (1 - WEEKLY_DISCOUNT);
        }

        return totalCost;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Helmet Included: " + hasHelmetIncluded);
    }
}
