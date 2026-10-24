public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[3];
        employees[0] = new Employee("E1","employee1",2000);
        employees[1] = new FullTimeEmployee("E2","employee2",3000,500,200);
        employees[2] = new PartTimeEmployee("E3","employee3",40,25);

        double totalPayroll = 0;
        for (int i = 0 ; i < employees.length ; i++) {
            employees[i].displayInfo();
            totalPayroll += employees[i].calculateSalary();
            System.out.println();
        }
        System.out.println("Total Payroll : $" + totalPayroll);

    }
}