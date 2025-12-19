package Mathoperations;

public class Mathutil {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if(b!=0) {
            return (double) a / b;
        } else {
            System.out.println("Error: Division by zero");
            return 0;
        }
    }
    
}
