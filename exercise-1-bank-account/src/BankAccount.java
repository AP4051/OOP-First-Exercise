public class BankAccount {
    private final String accountNumber;
    private String ownerName;
    private double balance;

public BankAccount(String accountNumber, String ownerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Error: Initial balance cannot be negative. Balance set to 0.0.");
            this.balance = 0.0;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setOwnerName(String ownerName) {
    if (ownerName != null && !ownerName.trim().isEmpty()) {
            this.ownerName = ownerName;
        } else {
            System.out.println("Error: Owner name cannot be empty!");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited " + amount + "$. New balance: " + balance + "$");
        } else {
            System.out.println("Error: Deposit amount must be greater than zero!");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be greater than zero!");
        } else if (amount > balance) {
            System.out.println("Error: Insufficient funds! (Current balance: " + balance + "$)");
        } else {
            balance -= amount;
            System.out.println("Successfully withdrew " + amount + "$. New balance: " + balance + "$");
        }
    }

    public void displayAccountInfo() {
        System.out.println("------------------------------------");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Current Balance: " + balance + "$");
        System.out.println("------------------------------------");
    }
}
