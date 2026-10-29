public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("ACC-101", "Alice", 1000); 

             System.out.println("=== Initial Account Information ===");
        account.displayAccountInfo();
         
               System.out.println("\n=== Testing Deposit ===");
        account.deposit(-200);
        account.deposit(500);
             
               System.out.println("\n=== Testing Withdrawal ===");
        account.withdraw(2000);
        account.withdraw(300);
         
               System.out.println("\n=== Final Account Information ===");
        account.displayAccountInfo();
    }
 }
          
        