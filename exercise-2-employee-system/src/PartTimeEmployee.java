public class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String id, String name,
                            int hoursWorked, double hourlyRate) {
        super(id, name, 0);
        setHoursWorked(hoursWorked);
        setHourlyRate(hourlyRate);
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        if (hoursWorked >= 0) {
            this.hoursWorked = hoursWorked;
        } else {
            System.out.println("Invalid working hours!");
        }
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate >= 0) {
            this.hourlyRate = hourlyRate;
        } else {
            System.out.println("Invalid hourly rate!");
        }
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}
