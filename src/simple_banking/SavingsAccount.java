package simple_banking;

// We would say that SavingsAccount is a subclass of Account,
// Account is a superclass for SavingsAccount,
// SavingsAccount inherits from Account,
// SavingsAccount extends Account
public class SavingsAccount extends Account {
    // I need to remember how many withdrawls were done so that I can
    // prevent anything over 10
    private Integer numWithdrawls = 0;

    // This method _extends_ the behavior of Account -- Account
    // could not accrue interest, but our SavingsAccount can
    public void accrueInterest() {
        setBalance(getBalance() * 103);
    }

    // This method _refines_ the behavior of Account -- Account
    // could perform withdrawls, but our SavingsAccount limits
    // these to ten
    @Override
    public void withdraw(Integer amount) {
        if (numWithdrawls < 10) {
            super.withdraw(amount);
        }

        numWithdrawls = numWithdrawls + 1;
    }
}
