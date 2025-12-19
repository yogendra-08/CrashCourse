// Q2. Write a program to create a custom exception InsufficientBalanceException when withdrawal amount
// is greater than the available balance

import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException() {
        System.out.println("Insufficient balance for the withdrawal");
    }
}
 public class PR14Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000.0;
        System.out.println("Available balance: " + balance);
        System.out.println("Enter withdrawal amount:");
        double withdrawAmount = sc.nextDouble();
        try {
            if (withdrawAmount > balance) {
                throw new InsufficientBalanceException();
            } else {
                balance -= withdrawAmount;
                System.out.println("Withdrawal successful Remaining balance: " + balance);
            } 
        } catch (InsufficientBalanceException e) {
            
        }
    }
}