// Q3. Write a Java program to copy content from one file to another using streams.

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Q3 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("file1.txt");
            FileOutputStream fos = new FileOutputStream("file2.txt");

            int c;
            while ((c = fis.read()) != -1) {
                fos.write(c);
            } 

            fis.close();
            fos.close();

            System.out.println("\nFile copied successfully.\n");
        } catch (IOException e) {
            System.out.println("An error occurred: ");
        }
    }
}