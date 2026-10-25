public class FullTimeEmployee extends Employee {
    private double bonus;
    private double medicalAllowance;

    public FullTimeEmployee(String id, String name, double baseSalary,
                            double bonus, double medicalAllowance) {
        super(id, name, baseSalary);
        setBonus(bonus);
        setMedicalAllowance(medicalAllowance);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        if (bonus >= 0) {
            this.bonus = bonus;
        } else {
            System.out.println("Invalid bonus!");
        }
    }

    public double getMedicalAllowance() {
        return medicalAllowance;
    }

    public void setMedicalAllowance(double medicalAllowance) {
        if (medicalAllowance >= 0) {
            this.medicalAllowance = medicalAllowance;
        } else {
            System.out.println("Invalid medical allowance!");
        }
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus + medicalAllowance;
    }
}
