import java.util.Scanner;

class Addition implements Runnable {
    private int a, b;

    public Addition(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        System.out.println("Sum: " + (a + b));
    }
}

class Subtraction implements Runnable {
    private int a, b;

    public Subtraction(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        System.out.println("Subtraction: " + (a - b));
    }
}

class Multiplication implements Runnable {
    private int a, b;

    public Multiplication(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        System.out.println("Product: " + (a * b));
    }
}

class Division implements Runnable {
    private int a, b;

    public Division(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        if (b != 0)
            System.out.println("Quotient: " + ((double) a / b));
        else
            System.out.println("Error: Division by zero");
    }
}

public class Pr10Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        Thread t1 = new Thread(new Addition(a, b));
        Thread t2 = new Thread(new Subtraction(a, b));
        Thread t3 = new Thread(new Multiplication(a, b));
        Thread t4 = new Thread(new Division(a, b));

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        sc.close();
    }
}
