public class PartTimeEmployee extends Employee {

    private int hoursWorked;
    private double hourlyRate;
    
    public PartTimeEmployee (String id,String name,int hoursWorked,double hourlyRate) {
        super(id,name,hourlyRate);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate; 
    }

    public int getHoursWorked () {
        return hoursWorked;
    }

    public void setHoursWorked (int hours) {
        if (hours >= 0) {
            this.hoursWorked = hours;
            System.out.println("Hours Worked was changed successfully.");
        } else
            System.out.println("Error : Number of hours must be positive.");
    }

    public double getHourlyRate () {
        return hourlyRate;
    }

    public void setHourlyRate (double amount) {
        if (amount >= 0) {
            this.hourlyRate = amount;
            System.out.println("Hourly Rate was changed successfully.");
        } else
            System.out.println("Error : Hourly Rate amount must be positive.");
    }

    @Override 
    public double calculateSalary () {
        return hourlyRate * hoursWorked;
    }

}