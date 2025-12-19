// Q4. Write a Java program to create and handle MarksOutOfRangeException when entered marks are greater
// than 100 or less than 0.

import java.util.Scanner;

class MarksOutOfRangeException extends Exception {
    MarksOutOfRangeException() {
        System.out.println("Marks entered are out of range.");
    }
}

public class PR14Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks (3 subject):");
        int marks1 = sc.nextInt();
        int marks2 = sc.nextInt();
        int marks3 = sc.nextInt();
        try {
            if (marks1 < 0 || marks1 > 100 || marks2 < 0 || marks2 > 100 || marks3 < 0 || marks3 > 100) {
                throw new MarksOutOfRangeException();
            } else {
                float avg = (marks1 + marks2 + marks3) / 3;
                System.out.println("Your average marks are: " + avg);
            }
        } catch (MarksOutOfRangeException e) {
            // Exception handled
        }
    }
}