// 3. Develop a program to create a class Person with attributes (name, age). Add a method
// checkEligibility() to check if the person is eligible for voting (age ≥ 18). Create objects and
// test the method.

import java.util.Scanner;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void checkEligibility() {
        if (age >= 18) {
            System.out.println(name + " is eligible for voting.");
        } else {
            System.out.println(name + " is not eligible for voting.");
        }
    }
}

public class Pr5Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name & age : ");
        String name = sc.nextLine();
        int age = sc.nextInt();

        Person person = new Person(name, age);
        person.checkEligibility();

        sc.close();
    }
}    