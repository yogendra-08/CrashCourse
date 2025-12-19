// Q2. Write a Java program to find the largest of three numbers using the ternary operator

import java.util.Scanner;

public class Pr1Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int largest = (a > b) ? ( (a > c) ? a : c ) : ( (b > c) ? b : c );

        System.out.println("The largest number is: " + largest);

        sc.close();
    }
}