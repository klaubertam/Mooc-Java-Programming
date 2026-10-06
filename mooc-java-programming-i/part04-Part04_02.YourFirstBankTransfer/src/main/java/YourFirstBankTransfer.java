
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account matthewsAccount = new Account("Arto's account", 1000.0);
Account myAccount = new Account("Arto's account in Switzerland", 0.0);

System.out.println("Initial state");
System.out.println(matthewsAccount);
System.out.println(myAccount);

matthewsAccount.withdrawal(100.0);
System.out.println("The balance of Matthew's account is now: " + matthewsAccount.balance());
myAccount.deposit(100.0);
System.out.println("The balance of Matthew's other account is now: " + myAccount.balance());

System.out.println("End state");
System.out.println(matthewsAccount);
System.out.println(myAccount);
    }
}
