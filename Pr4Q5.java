// Q5. Write a program to convert wrapper objects into primitive data types (Unboxing).

public class Pr4Q5 {
    public static void main(String[] args)
    {
        Integer a = 10;
        Float b = 10.5f;
        Character c = 'A';
        Boolean d = true;

        int a1 = a.intValue();
        float b1 = b.floatValue();
        char c1 = c.charValue();
        boolean d1 = d.booleanValue();

        System.out.println("Int data type: " + a1);
        System.out.println("Float data type: " + b1);
        System.out.println("Char data type: " + c1);
        System.out.println("Boolean data type: " + d1);

        

    }
} 