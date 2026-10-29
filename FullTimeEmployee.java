public class FullTimeEmployee extends Employee {
    private double bonus;
    private double medicalAllowance;

    public FullTimeEmployee(String id, String name, double baseSalary, double bonus, double medicalAllowance) {

        super(id, name ,baseSalary);
        this.bonus = bonus;
        this.medicalAllowance = medicalAllowance;
    }

    public double getBonus() {
        return bonus;
    }

    public double getMedicalAllowance() {
        return medicalAllowance;
    }

    public void setBonus(double bonus) {
        if (bonus >= 0) {
            this.bonus = bonus;
        }
    }

    public void setMedicalAllowance(double medicalAllowance) {
        if (medicalAllowance >= 0) {
            this.medicalAllowance = medicalAllowance;
        }
    }

    @Override
    public double getBaseSalary() {
        return super.getBaseSalary();
    }

    public double calculateSalary() {
        return super.calculateSalary() + bonus + medicalAllowance;
    }
}
