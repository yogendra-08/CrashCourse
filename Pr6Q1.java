class Vehicle {
    String brand = "Ford";
    int year = 2020;

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle {
    String model = "Mustang";

    void displayCar() {
        System.out.println("Model: " + model);
    }
}

class SportCar extends Car {
    String type = "Convertible";
    double engine = 2.0;

    void displaySportCar() {
        System.out.println("Type: " + type);
        System.out.println("Engine: " + engine + " L");
    }
}

public class Pr6Q1 {
    public static void main(String[] args) {
        SportCar mySportCar = new SportCar();

        // Calls all display methods
        mySportCar.display();        
        mySportCar.displayCar();     
        mySportCar.displaySportCar();
    }
}
