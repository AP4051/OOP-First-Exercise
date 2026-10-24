public class FullTimeEmployee extends Employee {

    private double bonus;
    private double medicalAllowance;

    public FullTimeEmployee (String id,String name,double baseSalary,double bonus,double medicalAllowance) {
        super(id,name,baseSalary);
        this.bonus = bonus;
        this.medicalAllowance = medicalAllowance;
    }

    public double getBonus () {
        return bonus;
    }

    public void setBonus (double amount) {
        if (amount >= 0) {
            this.bonus = amount;
            System.out.println("Bonus amount was changed successfully.");
        } else
            System.out.println("Error : Bonus amount must be positive.");
    }

    public double getMedicalAllowance () {
        return medicalAllowance;
    }

    public void setMedicalAllowance (double amount) {
        if (amount >= 0) {
            this.medicalAllowance = amount;
            System.out.println("Medical Allowance amount was changed successfully.");
        } else
            System.out.println("Error : Medical Allowance amount must be positive.");
    }

    @Override
    public double calculateSalary () {
        return getBaseSalary() + bonus + medicalAllowance;
    }

}