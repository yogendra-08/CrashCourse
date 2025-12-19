import java.util.Scanner;

public class Pr3Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Enter your choice: \n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: 
                System.out.println("Addition of " + a + " + " + b + " is " + (a+b));
                break;

            case 2: 
                System.out.println("Subtraction of " + a + " - " + b + " is " + (a-b));
                break;

            case 3: 
                System.out.println("Multiplication of " + a + " * " + b + " is " + (a*b));
                break;

            case 4: 
                    System.out.println("Division of " + a + " / " + b + " is " + (a/b));
                break;

            default: 
                System.out.println("Invalid choice");
                break;
        }
        sc.close();
    }
}
