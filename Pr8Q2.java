class Laptop {
    String brand;
    int ram;
    int processorSpeed;

    Laptop(String brand) {
        this.brand = brand;
    }

    Laptop(String brand, int ram) {
        this.brand = brand;
        this.ram = ram;
    }

    Laptop(String brand, int ram, int processorSpeed) {
        this.brand = brand;
        this.ram = ram;
        this.processorSpeed = processorSpeed;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Processor Speed: " + processorSpeed + " GHz");
        System.out.println("----------------------");
    }
}

public class Pr8Q2 {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Dell");
        laptop1.display();

        Laptop laptop2 = new Laptop("HP", 16);
        laptop2.display();

        Laptop laptop3 = new Laptop("Apple", 32, 3);
        laptop3.display();
    }
}
