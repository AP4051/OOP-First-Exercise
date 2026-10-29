public class FullTimeEmployee extends Employee {
  private double bonus;
  private double medicalAllowance;

public FullTimeEmployee(String id, String name, double baseSalary, double bonus, double medicalAllowance) {
      super(id, name, baseSalary);
      this.bonus = bonus;
      this.medicalAllowance = medicalAllowance;
  }

  public double getBonus() {
      return bonus;
  }

  public void setBonus(double bonus) {
      this.bonus = bonus;
  }

  public double getMedicalAllowance() {
      return medicalAllowance;
  }

  public void setMedicalAllowance(double medicalAllowance) {
      this.medicalAllowance = medicalAllowance;
  }

  @Override
  public double calculateSalary() {
      return getBaseSalary() + bonus + medicalAllowance;
  }
}
