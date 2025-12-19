import Banking.BankAccount;
import java.util.Scanner;

public class Pr11Q2 {
    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter account number & initial balance: ");
        String accountNumber = sc.nextLine();
        double initialBalance = sc.nextDouble();

        BankAccount account = new BankAccount(accountNumber, initialBalance);
        
        account.checkBalance();
        
        System.out.print("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);
        account.checkBalance();
        
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);
        account.checkBalance();
        
        sc.close();
    }
}