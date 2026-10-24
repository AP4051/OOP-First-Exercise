public class Car extends Vehicle {

    private int numberOfSeats;

    public Car (String licensePlate,String model,double dailyRate,int numberOfSeats) {
        super(licensePlate,model,dailyRate);
        if (numberOfSeats > 0)
            this.numberOfSeats = numberOfSeats;
        else
            System.out.println("Error : Number of seats must be positive.");
    }

    public int getNumberOfSeats () {
        return numberOfSeats;
    }

    public void setNumberOfSeats (int number) {
        if (number > 0) {
            this.numberOfSeats = number;
            System.out.println("Number of seats was changed successfully.");
        } else
            System.out.println("Error : Number of seats must be positive.");
    }

    @Override
    public void calculateRentalCost (int days) {
        if (days > 0) {
            double serviceFee = 50;
            System.out.println(getDailyRate() * days + serviceFee);
        } else
            System.out.println("Error : Number of Days must be positive.");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Seats : " + numberOfSeats);
    }

}