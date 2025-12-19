// Q3. Develop a program to count the number of vowels, consonants, digits, and special characters in
// a string using StrinBuffer class

import java.util.Scanner;

public class Pr4Q3 {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();

        StringBuffer sb = new StringBuffer();
        sb.append(str);
        int vowels = 0, consonants = 0, digits = 0, specialChars = 0;
        for(int i = 0; i < sb.length(); i++)
        {
            char ch = sb.charAt(i);
            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            {
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                {
                    vowels++;
                }
                else
                {
                    consonants++;
                }
            }
            else if(ch >= '0' && ch <= '9')
            {
                digits++;
            }
            else
            {
                specialChars++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + specialChars);

        sc.close();

    }
}