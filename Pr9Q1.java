class add extends Thread {

    int num1 , num2;

    add(int num1 , int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void run()
    {
        System.out.println("Addition = " + (num1 + num2));
    }
}

class sub extends Thread {
    int num1 , num2;

    sub(int num1 , int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void run()
    {
        System.out.println("Subtraction = " + (num1 - num2));
    }
}

class mul extends Thread {
    int num1 , num2;

    mul(int num1 , int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void run()
    {
        System.out.println("Multiplication = " + (num1 * num2));
    }
}

class div extends Thread {
    int num1 , num2;

    div(int num1 , int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void run()
    {
       System.out.println("Division = " + (num1 / num2));
    }
}

public class Pr9Q1 {
    public static void main(String[] args) {
        int num1 = 20, num2 = 10;

        add addition = new add(num1, num2);
        sub subtraction = new sub(num1, num2);
        mul multiplication = new mul(num1, num2);
        div division = new div(num1, num2);

        addition.start();
        subtraction.start();
        multiplication.start();
        division.start();
    }
} 