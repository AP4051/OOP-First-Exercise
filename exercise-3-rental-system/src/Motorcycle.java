public class Motorcycle extends Vehicle {

    private boolean hasHelmetIncluded;

    public Motorcycle (String licensePlate,String model,double dailyRate,boolean hasHelmetIncluded) {
        super(licensePlate,model,dailyRate);
        this.hasHelmetIncluded = hasHelmetIncluded;
    }

    public boolean getHasHelmetIncluded () {
        return hasHelmetIncluded;
    }

    public void setHasHelmetIncluded (boolean hasHelmetIncluded) {
        this.hasHelmetIncluded = hasHelmetIncluded;
        System.out.println("Has helmet included was changed successfully.");
    }

    @Override
    public void calculateRentalCost (int days) {
        if (days > 0) {
            double cost = getDailyRate() * days;
            if (days >= 7)
                cost *= 0.8;
            System.out.println(cost);
        } else
            System.out.println("Error : Number of Days must be positive.");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        if (hasHelmetIncluded)
            System.out.println("Helmet Included : Yes");
        else
            System.out.println("Helmet Included : No");
    }

}