public class BankAccount {

    private final String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber,String ownerName,double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        if (balance < 0)
            System.out.println("Error : Primary Balance amount must be positive.");
        else
            this.balance = balance;
    }

    public String getAccountNumber () {
        return accountNumber;
    }

    public String getOwnerName () {
        return ownerName;
    }

    public void setOwnerName (String newOwnerName) {
        if (newOwnerName == null || newOwnerName.isBlank())
            System.out.println("Error : Owner Name must not be Blank.");
        else {
            this.ownerName = newOwnerName;
            System.out.println("Owner Name was changed successfully.");
        }
    }

    public double getBalance () {
        return balance;
    }

    public void deposit (double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else
            System.out.println("Error : Deposit amount must be positive.");
    }

    public void withdraw (double amount) {
        if (amount <= 0)
            System.out.println("Error : Withdraw amount must be positive.");
        else if (amount > balance)
            System.out.println("Error : Withdraw amount must be smaller than balance amount.");
        else {
            balance -= amount;
            System.out.println("Withdraw successful.");
        }
    }

    public void displayAccountInfo () {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Owner Name : " + ownerName);
        System.out.println("Balance : $" + balance);
    }

}