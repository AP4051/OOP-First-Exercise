public class BankAccount {
    private final String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;

        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Error: Initial balance cannot be negative. Setting to 0.0");
            this.balance = 0.0;
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
            System.out.println("Error: Owner name cannot be blank.");
            return;
        }
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Deposit amount must be positive.");
            return;
        }
        balance += amount;
        System.out.println("Deposited $" + amount);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be positive.");
            return;
        }
        if (amount > balance) {
            System.out.println("Error: Insufficient funds.");
            return;
        }
        balance -= amount;
        System.out.println("Withdrew $" + amount);
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber
                + ", Owner: " + ownerName
                + ", Balance: $" + balance);
    }
}