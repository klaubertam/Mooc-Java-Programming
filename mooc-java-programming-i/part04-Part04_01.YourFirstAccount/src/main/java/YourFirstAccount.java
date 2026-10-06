
public class YourFirstAccount {

    public static void main(String[] args) {
      
        // Create the account with a balance of 100.0
        Account myAccount = new Account("My account", 100.00);

        // Print the initial balance
        System.out.println("Initial balance: " + myAccount.balance());

        // Deposit 20.0 into the account
        myAccount.deposit(20.00);

        // Print the final balance
        System.out.println("Final balance: " + myAccount.balance());
    }
}


