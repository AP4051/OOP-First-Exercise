public class Main {
    public static void main(String[] args) {

        Employee[] employees = {
            new Employee("E001", "Alice", 2000),
            new FullTimeEmployee("E002", "Bob", 3000, 500, 200),
            new PartTimeEmployee("E003", "Charlie", 40, 25)
        };

        double totalPayroll = 0;

        for (Employee employee : employees) {
            employee.displayInfo();
            totalPayroll += employee.calculateSalary();
            System.out.println("--------------------");
        }

        System.out.println("Total Payroll: $" + totalPayroll);
    }
}
