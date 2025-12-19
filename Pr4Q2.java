// Q2. Write a program to check whether a given string is a palindrome or not

import java.util.Scanner;

public class Pr4Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");

        String str = sc.nextLine();

        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (str.equals(rev))

        {
            System.out.println("The string is a palindrome");

        } else {
            System.out.println("The string is not a palindrome");
        }

        sc.close();
    }
}