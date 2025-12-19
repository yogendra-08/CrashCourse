import java.util.Scanner;

abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void area() {
        double a = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + a);
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double b) {
        length = l;
        width = b;
    }

    void area() {
        double a = length * width;
        System.out.println("Area of Rectangle: " + a);
    }
}

public class Pr7Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of Circle: ");
        double r = sc.nextDouble();
        Circle c = new Circle(r);
        c.area();

        System.out.print("Enter lengthof Rectangle: ");
        double l = sc.nextDouble();
        System.out.print("Enter width of Rectangle: ");
        double b = sc.nextDouble();
        Rectangle rec = new Rectangle(l, b);
        rec.area();

        sc.close();
    }
}
