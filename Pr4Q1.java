// Q1. Develop a program to input a string and display its length and individual characters.

import java.util.Scanner;

public class Pr4Q1 {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Length of the string is: " + str.length());
        System.out.println("Individual characters are: ");
        for(int i = 0; i < str.length(); i++)
        {
            System.out.println(str.charAt(i));
        }
        sc.close();
    }
}