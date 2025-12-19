// Q4. Write a program to check whether a given number is positive, negative, or zero using if…else

import java.util.Scanner;

public class Pr1Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if(num > 0)
        {
            System.out.println("The number is positive");
        }
        else if(num < 0)
        {
            System.out.println("The number is negative");
        }
        else
        {
            System.out.println("The number is zero");
        }

        sc.close();
    }
}
