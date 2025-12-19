// Q4. Write a Java program to count the number of bytes in a given file using FileInputStream.

import java.io.FileInputStream;
import java.io.IOException;

public class Q4 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("data.txt");
            int count = 0;
            int data;
            System.out.print("content of file: ");
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
                count++;
            }

            System.out.println("\nNumber of bytes in the file: \n" + count);
            fis.close();
        } catch (IOException e) {
            System.out.println("An error occurred ");
        }  
    }
}