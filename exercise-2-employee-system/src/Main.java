public class Main {
    public static void main(String[] args) {
        System.out.println("=== Employee Payroll System ===");

        Employee[] employees = new Employee[3];

        employees[0] = new Employee("EMP-01", "John Doe", 2000.0);
        employees[1] = new FullTimeEmployee("FT-02", "Alice Smith", 3000.0, 500.0, 200.0);
        employees[2] = new PartTimeEmployee("PT-03", "Bob Wilson", 40, 25.0);

        double grandTotalPayroll = 0.0;

        System.out.println("\nEmployee Details:");
        for (int i = 0; i < employees.length; i++) {
            employees[i].displayInfo();
            grandTotalPayroll += employees[i].calculateSalary();
        }

        System.out.println("----------------------------------------");
        System.out.println("Grand Total Payroll Cost: $" + grandTotalPayroll);
    }
}

