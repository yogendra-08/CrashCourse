package Banking;

public class BankAccount {
    String accountnumber;
    double balance;

    public BankAccount(String accountnumber, double initialbalance) {
        this.accountnumber = accountnumber;
        this.balance = initialbalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ");
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn ");
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
}

