package simple_banking;

public class AccountDriver {
    public static void main(String[] args) {
        // Create an account ... (aka instantiate an account)
        Account a1 = new Account("Andy Berns");
        Account a2 = new Account("Aiden Berns");
        Account a3 = new Account("Irie Berns");
        Account a4 = new Account("Olive Berns");
        Account a5 = new Account();

        // ... and withdraw 100 units from it
        a1.deposit(100);
        System.out.println("Account a1's balance is: " +
                           a1.getBalance());

        a1.withdraw(200);
        System.out.println("Account a1's balance is now: " +
                           a1.getBalance());

        a1.withdraw(25);

        System.out.println(a1.getStatement());
    }
}
