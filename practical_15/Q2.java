// Q2. Write a Java program to write data into a file using FileOutputStream.

import java.io.FileOutputStream;
import java.io.IOException;

public class Q2 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("input.txt");
            String data = "Hello, World!";
            fos.write(data.getBytes());
            fos.close();
            System.out.println("\nData written to file successfully.\n");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file");
        }
    }
}