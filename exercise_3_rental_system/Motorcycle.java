 public class Motorcycle extends Vehicle {
    private boolean hasHelmetIncluded;
    private static final double LONG_RENTAL_DISCOUNT = 0.10;

         public Motorcycle(String licensePlate, String model, double dailyRate,
                      boolean hasHelmetIncluded) {
        super(licensePlate, model, dailyRate);
        this.hasHelmetIncluded = hasHelmetIncluded;
    }
     
            public boolean isHelmetIncluded() { return hasHelmetIncluded; }
    public void setHelmetIncluded(boolean hasHelmetIncluded) {
        this.hasHelmetIncluded = hasHelmetIncluded;
    }

          public double calculateRentalCost(int days) {
        if (days <= 0) return 0;
        double total = super.calculateRentalCost(days);
        if (days >= 7) total *= (1 - LONG_RENTAL_DISCOUNT);
        return total;
    }

         public void displayDetails() {
        super.displayDetails();
        System.out.println("Helmet Included: " + hasHelmetIncluded);
    }
  }