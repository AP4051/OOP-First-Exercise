 public class Employee {
    private int id;
    private String name;
    private double baseSalary;

        public Employee(int id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        if (baseSalary >= 0) {
            this.baseSalary = baseSalary;
        } else {
            this.baseSalary = 0.0;
            System.out.println("Error: Base salary cannot be negative.");
        }
    }
           
              public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) {
        if (baseSalary >= 0) {
            this.baseSalary = baseSalary;
        } else {
            System.out.println("Error: Base salary cannot be negative.");
        }
    }
            
              public double calculateSalary() {
        return baseSalary;
    }
        
          public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Final Salary: $" + calculateSalary());
    }
 } 
 