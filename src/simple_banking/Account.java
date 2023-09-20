package simple_banking;

import java.util.LinkedList;

public class Account {
    // If I exclude the explicit initialization to 0, it will
    // default to ... null
    private Integer balance = 0;
    private String name;

    private LinkedList<String> transactions = new LinkedList<>();

    // I want the name to be set when the object is created so I'm going to
    // add this as a parameter to the constructor.
    public Account(String n) {
        name = n;
    }

    public Account() {
        name = "Undefined";
    }

    // What are some things we can ask an account to do?
    // aka what are some things we can do with an account?
    // withdraw, deposit, transfer, print statement information

    // When I say 'ask an account to withdraw', I mean 'send
    // a withdraw message to an account', by which I mean
    // call the 'withdraw' method for this account.
    // When I withdraw, I need to give it how much I want to
    // withdraw as well. An account will reply to this message
    // with the current balance.
    public void withdraw(Integer amount) {
        // In order to know how to withdraw money, the account needs
        // to track the balance - so this becomes an instance variable
        if (amount <= balance) {
            balance = balance - amount;
            transactions.add("Withdraw: " + amount);
        }
        //return balance;
    }

    // This method deposits money into the account
    public void deposit(Integer amount) {
        // You could do this as 'balance += amount;'
        balance = balance + amount;
        transactions.add("Deposit: " + amount);
    }

    public String getStatement() {
        String statement = "";

        // add transactions to 'statement' -- this is a
        // foreach loop -- every iteration will have 'transaction' set to
        // a value from transactions (in order, of course)
        for(String transaction : transactions) {
            statement = statement + "\n" + transaction;
        }

        // Return final statement with current balance
        return statement + "\nBalance for " + name + ": " + balance;
    }

    // This method is called an 'accessor' (or 'getter') --
    // it returns the value of an instance variable
    public Integer getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    // This method is called a 'mutator' or 'setter'. It sets
    // the value of an instance variable.'
    public void setName(String n) {
        name = n;
    }

    // Adding a mutator that is _protected_, meaning only classes in this
    // package and subclasses can access it.
    protected void setBalance(Integer newBalance) {
        balance = newBalance;
    }
}
