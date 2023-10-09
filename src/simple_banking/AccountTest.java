package simple_banking;

import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {

    @Test
    public void testDeposit() {
        Account a1 = new Account();

        a1.deposit(100);
        a1.deposit(200);

        assertEquals(300, (int) a1.getBalance());

    }

    public void testWithdraw() {
        Account a1= new Account();

        a1.withdraw(100);

        assertEquals(0, (int) a1.getBalance());

        a1.deposit(100);
        a1.withdraw(50);

        assertEquals(50, (int) a1.getBalance());



    }
}
