// Q3. Write a Java program to create a user-defined exception NegativeNumberException when enters a
// negative number

import java.util.Scanner;

class NegativeNumberException extends Exception {
    NegativeNumberException() {
        System.out.println("Negative number entered!");
    }
}

public class PR14Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        try {
            if (number < 0) {
                
                throw new NegativeNumberException();
            } else {
                System.out.println("You entered: " + number);
            }
        } catch (NegativeNumberException e) {
            // Exception handled
        }
    }
}