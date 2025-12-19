// Q5. Write a program to calculate the reverse of digits of a number using a for loop.

import java.util.Scanner;

public class Pr1Q5 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int reverse = 0;
        for(int n = num; n != 0; n = n / 10)
        {
            int rev = n % 10;
            reverse = reverse * 10 + rev;
        }

        System.out.println("The reverse of the number is: " + reverse);

        sc.close();
    }
}