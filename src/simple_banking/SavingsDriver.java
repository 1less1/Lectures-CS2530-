package simple_banking;

public class SavingsDriver {
    public static void main(String[] args) {
        // If you uncomment this, it won't terminate...
        /*
        double sum = 0.0;

        while(sum != 1.0) {
            sum += 0.1;
        }
        */

        //Account a1 = new Account();
        SavingsAccount sa2 = new SavingsAccount();

        sa2.deposit(150);
        sa2.withdraw(15);
        sa2.accrueInterest();
        System.out.println(sa2.getStatement());
    }
}
