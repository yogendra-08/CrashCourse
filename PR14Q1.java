import java.util.Scanner;

public class PR14Q1 {
    static int divide(int a, int b) throws ArithmeticException {
        return a / b; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numerator: ");
        int a = scanner.nextInt();
        System.out.print("Enter the denominator: ");
        int b = scanner.nextInt();
        try {
            int result = divide(a, b);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed!");
        }
    }
}
