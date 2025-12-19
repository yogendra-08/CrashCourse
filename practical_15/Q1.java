// Q1. Write a Java program to read data from a text file using FileInputStream.

import java.io.FileInputStream;
import java.io.IOException;

public class Q1 {
    public static void main(String[] args) {
        try {
            FileInputStream file1 = new FileInputStream("input.txt");
            int data;
            System.out.println();
            while ((data = file1.read()) != -1) {
                System.out.print((char) data);
            }
            file1.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file ");
        }
    }
}