public class PartTimeEmployee extends Employee {

    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String id, String name, int hoursWorked, double hourlyRate) {
        super(id,name,0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHoursworked(int hoursworked) {
        if (hoursworked >= 0) {
            this.hoursWorked = hoursworked;
        }
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate >= 0) {
            this.hourlyRate = hourlyRate;
        }
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}