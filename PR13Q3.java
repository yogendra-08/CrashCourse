import java.util.Scanner;

public class PR13Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {10, 20, 30, 40, 50};

        try {
            System.out.println("Enter index to access element");
            int index = sc.nextInt();
            System.out.println("Element at index " + index + " is " + numbers[index]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of range!");
        }
        sc.close();
    }
}
