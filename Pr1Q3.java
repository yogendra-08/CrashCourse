// Q3. Write a program to calculate the sum of digits of a number using a while loop.

import java.util.Scanner;

class Pr1Q3 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        while(num > 0)
        {
            sum += num % 10;
            num = num / 10;
        }
        System.out.println("The sum of the digits is: " + sum);

        sc.close();
    }
}