interface Shape {
    void area();
}

class Circle implements Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    public void area() {
        double a = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + a);
    }
}

class Square implements Shape {
    double side;

    Square(double s) {
        side = s;
    }

    public void area() {
        double a = side * side;
        System.out.println("Area of Square: " + a);
    }
}

class Rectangle implements Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public void area() {
        double a = length * width;
        System.out.println("Area of Rectangle: " + a);
    }
}

public class Pr7Q2 {
    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        c.area();

        Square sq = new Square(4.0);
        sq.area();

        Rectangle rec = new Rectangle(6.0, 3.0);
        rec.area();
    }
}
