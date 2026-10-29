public class Employee {

    private String id;
    private String name;
    private double baseSalary;

    public Employee(String id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        setBaseSalary(baseSalary);
    }

    public String getId() {
        return id; }
    public void setId(String id) {
        this.id = id; }

    public String getName() {
        return name; }
    public void setName(String name) {
        this.name = name; }

    public double getBaseSalary() {
        return baseSalary; }


    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0) {
            System.out.println("Base salary cannot be negative!");
        }
        else {
            this.baseSalary = baseSalary;
        }
    }


    public double calculateSalary() {
        return baseSalary; }


    public void displayInfo() {
        System.out.println("ID: " + id + " | Name: " + name + " | Total Salary: $" + calculateSalary());
    }

}
