class Area {
    void area(double radius) {
        System.out.println("area of circle = " + Math.PI * radius * radius);
    }

    void area(double length, double breadth) {
        System.out.println("area of rectangle = " + length * breadth);
    }

    void area(int height, int base1) {
        System.out.println("area of triangle = " + 0.5 * height * base1);
    }
}

class Pr8Q1 {

    public static void main(String[] args) {
        Area obj = new Area();
        obj.area(5.5);
        obj.area(4.0, 6.0);
        obj.area(5, 10);
    }
}

