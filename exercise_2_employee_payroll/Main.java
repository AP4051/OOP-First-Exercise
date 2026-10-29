 public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

           employees[0] = new Employee(1, "John", 2000);
        employees[1] = new FullTimeEmployee(2, "Alice", 3000, 500, 200);
        employees[2] = new PartTimeEmployee(3, "Bob", 40, 25);

         double totalPayroll = 0;
        for (Employee employee : employees) {
            employee.displayInfo();
            totalPayroll += employee.calculateSalary();
            System.out.println("--------------------");
        }
        System.out.println("Total Payroll: $" + totalPayroll);
    }
 }