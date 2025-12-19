// 1. Develop a program to create a class Arithmetic having four methods i.e. add(), sub(), mul()
// and div() to perform various operation. Create an object and perform operations.

import java.util.Scanner;
class Arithmetic {

    void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }
    void sub(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }
    void mul(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }
    void div(int a, int b) {
        System.out.println("Division: " + (a / b));
    }

}
public class Pr5Q1 {
    public static void main(String[] args) {
        Arithmetic art = new Arithmetic();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        art.add(a, b);
        art.sub(a, b);
        art.mul(a, b);
        art.div(a, b);

        sc.close();
    }
}