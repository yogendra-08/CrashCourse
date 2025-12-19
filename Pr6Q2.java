import java.util.Scanner;

class Employee {
    String name;
    int salary;
    static Scanner sc = new Scanner(System.in);

    void input() {
        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();
        System.out.print("Enter Salary: ");
        salary = sc.nextInt();
        sc.nextLine(); 
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String dept;

    void inputManager() {
        input();
        System.out.print("Enter Department: ");
        dept = sc.nextLine();
    }

    void displayManager() {
        display();
        System.out.println("Department: " + dept);
    }
}

class Engineer extends Employee {
    String trade;

    void inputEngineer() {
        input();
        System.out.print("Enter Trade: ");
        trade = sc.nextLine();
    }

    void displayEngineer() {
        display();
        System.out.println("Trade: " + trade);
    }
}

public class Pr6Q2 {
    public static void main(String[] args) {
        Manager m = new Manager();
        System.out.println("\n--- Enter Manager Details ---");
        m.inputManager();
        System.out.println("\n--- Manager Details ---");
        m.displayManager();

        Engineer e = new Engineer();
        System.out.println("\n--- Enter Engineer Details ---");
        e.inputEngineer();
        System.out.println("\n--- Engineer Details ---");
        e.displayEngineer();

        Employee.sc.close();
    }
}
