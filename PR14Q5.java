// Q5. Write a Java program to create a custom exception InvalidPasswordException when entered password is
// less than 6 characters.

import java.util.Scanner;

class InvalidPasswordException extends Exception {
    InvalidPasswordException() {
        System.out.println("Invalid password! Password must be at least 6 characters long.");
    }
}

public class PR14Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password:");
        String password = sc.nextLine();
        try {
            if (password.length() < 6) {
                throw new InvalidPasswordException();
            }
        } catch (InvalidPasswordException e) {
            
        }
        sc.close();  

    }
}