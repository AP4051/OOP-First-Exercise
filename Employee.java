
public class Employee {
    private final String id;
    private String name;
    protected double baseSalary;

    public Employee(String id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        if (baseSalary < 0) {
            System.out.println("Error: Base salary cannot be negative");
            this.baseSalary = 0.0;
        } else {
            this.baseSalary = baseSalary;
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            System.out.println("Error : name cannot be empty! ");
            return;
        }
        this.name = name;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0) {
            System.out.println("Error: Base salary cannot be negative.");
            return;
        }
        this.baseSalary = baseSalary;
    }

    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name
                + ", Total Salary: " + calculateSalary());
    }

    public double calculateSalary() {
        return baseSalary;
    }


}

