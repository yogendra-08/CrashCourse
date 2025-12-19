import Mathoperations.Mathutil;

public class PR11Q1 {
    public static void main(String[] args) {
        Mathutil mathutil = new Mathutil();
        int a = 10, b = 5;
        System.out.println("Addition: " + mathutil.add(a, b));
        System.out.println("Subtraction: " + mathutil.subtract(a, b));
        System.out.println("Multiplication: " + mathutil.multiply(a, b));
        System.out.println("Division: " + mathutil.divide(a, b));
    }
}
