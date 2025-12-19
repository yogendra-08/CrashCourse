import java.util.InputMismatchException;
import java.util.Scanner;

public class PR13Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        }
        sc.close();
    }
}
 