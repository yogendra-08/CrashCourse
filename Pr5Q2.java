// 2. Develop a program to create a class BankAccount with methods deposit(), withdraw(), and
// displayBalance(). Create an object and perform transactions.

import java.util.Scanner;

class BankAccount {
    
    void deposit(float amount)
    {
        System.out.println("Deposited: " + amount);
    }

    void withdraw(float amount)
    {
        System.out.println("Withdrawn: " + amount);
    }

    void displayBalance(float amount)
    {
        System.out.println("Balance: " + amount);
    }
}

public class Pr5Q2 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to deposit: ");
        float depositAmount = sc.nextFloat();
        acc.deposit(depositAmount);

        System.out.println("Enter amount to withdraw: ");
        float withdrawAmount = sc.nextFloat();
        acc.withdraw(withdrawAmount);

        float balance = depositAmount - withdrawAmount;
        acc.displayBalance(balance);

        sc.close();
    }
}