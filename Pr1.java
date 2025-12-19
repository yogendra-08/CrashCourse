// Q1. Write a Java program to check whether a number entered by the user (Keyboard) is greater
// than, less than, or equal to another number.

import java.util.Scanner;
public class Pr1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter two numbers: ");
       int a = sc.nextInt();
       int b = sc.nextInt();
      

       if(a > b)
       {
        System.out.println("First number is greater");
       }
         else if(a < b)
         {
          System.out.println("Second number is greater");
         }
         else
         {
          System.out.println("Both numbers are equal");
         }

         sc.close();

    }
}