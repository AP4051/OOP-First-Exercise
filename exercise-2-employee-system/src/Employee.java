public class Employee {

    private String id;
    private String name;
    private double baseSalary;

    public Employee (String id,String name,double baseSalary) {
        this.id = id;
        this.name = name;
        if (baseSalary < 0)
            System.out.println("Error : Base salary must be positive.");
        else
            this.baseSalary = baseSalary;
    }

    public String getId () {
        return id;
    }

    public void setId (String newId) {
        this.id = newId;
        System.out.println("Employee\'s id was changed successfully.");
    }

    public String getName () {
        return name;
    }

    public void setName (String newName) {
        this.name = newName;
        System.out.println("Employee\'s Name was changed successfully.");
    }

    public double getBaseSalary () {
        return baseSalary;
    }

    public void setBaseSalary (double newBaseSalary) {
        if (newBaseSalary >= 0) {
            this.baseSalary = newBaseSalary;
            System.out.println("Employee\'s Salary was changed successfully.");
        } else
            System.out.println("Error : Salary must be positive.");
    }

    public double calculateSalary () {
        return baseSalary;
    }

    public void displayInfo() {
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Salary : $" + calculateSalary());
    }

}