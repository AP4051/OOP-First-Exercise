public class Main {
    public static void main(String[] args) {
        System.out.println("=== Bank Account System Test ===");

        BankAccount aliceAccount = new BankAccount("ACC-101", "Alice", 1000.0);

        System.out.println("\n[Test 1] Deposit negative amount:");
            aliceAccount.deposit(-200.0);

        System.out.println("\n[Test 2] Deposit 500 dollars:");
        aliceAccount.deposit(500.0);

        System.out.println("\n[Test 3] Withdraw more than balance:");
            aliceAccount.withdraw(2000.0);

        System.out.println("\n[Test 4] Withdraw 300 dollars:");
        aliceAccount.withdraw(300.0);

        System.out.println("\n[Final Result]:");
        aliceAccount.displayAccountInfo();
    }
}
