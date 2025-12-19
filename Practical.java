class Vechical
{
   String brand = "Ford";
   int year = 2020;

   void display()
   {
       System.out.println("Brand: " + brand);
       System.out.println("Year: " + year);
   }
}

class Car extends Vechical
{
   String model = "Mustang";

   void displayCar()
   {
       System.out.println("Model: " + model);
   }
}

class Sportcars extends Vechical
{
   String type = "Convertible";
   int engine = 2;

   void displaySportcar()
   {
       System.out.println("Type: " + type);
       System.out.println("Engine: " + engine);
   }
}

public class Practical   {
   public static void main(String[] args) {
       Car myCar = new Car();
       Sportcars mySportcar = new Sportcars();

       myCar.display();
       myCar.displayCar();

       mySportcar.display();
       mySportcar.displaySportcar();
   }
}