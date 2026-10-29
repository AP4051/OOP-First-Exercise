public class BankAccount {

    private final String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;

        if (balance < 0) {
            System.out.println("Error: Starting balance cannot be negative. Balance set to $0.00.");
            this.balance = 0.0;
        } else {
            this.balance = balance;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }


    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        if (ownerName == null || ownerName.isBlank()) {
            System.out.println("Error: Owner's name cannot be null or blank.");
            return;
        }
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double value) {
        if ((value <= 0) || (Double.isNaN(value)) || Double.isInfinite(value)) {
            System.out.println("Error: Valid values for deposition are only positive numbers.");
        }

        else {
            balance += value;
            System.out.printf("Deposit successful: $%.2f%n", value);
        }
    }

    public void withdraw(double value) {
        if (value <= 0 || Double.isNaN(value)
                || Double.isInfinite(value)) {
            System.out.println("Error: Valid values for withdrawal are only positive numbers.");
        }

        else if (value > balance) {
            System.out.println("Error: Insufficient funds.");
        }

        else {
            balance -= value;
            System.out.printf("Withdrawal successful: $%.2f%n", value);
        }
    }

    public void displayAccountInfo() {
        System.out.println("\n      Bank Account Information        ");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Owner's Name: " + ownerName);
        System.out.printf("Balance: $%.2f%n", balance);
    }
}