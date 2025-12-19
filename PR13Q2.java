import java.util.InputMismatchException;
import java.util.Scanner;

public class PR13Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter numerator: ");
            int num = sc.nextInt();

            System.out.print("Enter denominator: ");
            int den = sc.nextInt();

            int result = num / den;
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        } 
        catch (InputMismatchException e) {
            System.out.println("Please enter only integer values.");
        } 
        catch (Exception e) {
            System.out.println("Some other error occurred.");
        }
        sc.close();
    }
}
 