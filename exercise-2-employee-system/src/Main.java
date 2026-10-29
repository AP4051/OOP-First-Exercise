public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Employee_1", "Mehdi", 2000);
        employees[1] = new FullTimeEmployee("Employee_2(full time)", "Amir Reza", 3000, 500, 200);
        employees[2] = new PartTimeEmployee("Employee_3(part-time)", "Hesam", 40, 25);

        double grandTotal = 0;
        for (Employee emp : employees) {
            emp.displayInfo();             // چندریختی: متد هر کلاس خودش اجرا می‌شود
            grandTotal += emp.calculateSalary();
        }

        System.out.println("Grand Total Payroll: $" + grandTotal);
    }
}