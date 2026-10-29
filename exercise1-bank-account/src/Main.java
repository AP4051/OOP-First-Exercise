public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("ACC-101", "Alice", 1000.00);

        account.displayAccountInfo();


        System.out.println("\n1. Attempting negative deposit (-200):");
        account.deposit(-200.00);
        System.out.printf("Balance after attempt to deposit: $%.2f%n", account.getBalance());


        System.out.println("\n2. Depositing $500:");
        account.deposit(500.00);
        System.out.printf("Current balance: $%.2f%n", account.getBalance());


        System.out.println("\n3. Attempt withdrawal of $2,000:");
        account.withdraw(2000.00);
        System.out.printf("Balance after attempt: $%.2f%n", account.getBalance());


        System.out.println("\n4. Withdraw $300:");
        account.withdraw(300.00);
        System.out.printf("Current balance: $%.2f%n", account.getBalance());


        account.displayAccountInfo();
    }
}
