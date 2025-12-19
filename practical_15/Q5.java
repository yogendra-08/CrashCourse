// Q5. Write a Java program to concatenate two files into one using SequenceInputStream.

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Q5 {
    public static void main(String[] args) {
        try {
            FileInputStream fis1 = new FileInputStream("file1.txt");
            FileInputStream fis2 = new FileInputStream("file2.txt");
            FileOutputStream fos = new FileOutputStream("combined.txt");

            int c;
            while ((c = fis1.read()) != -1) {
                fos.write(c);
            }
            while ((c = fis2.read()) != -1) {
                fos.write(c);
            }

            fis1.close();
            fis2.close();
            fos.close();
 
            System.out.println("Files concatenated successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: ");
        }
    }
}