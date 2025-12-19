// Q4. Write a program to convert primitive data types into objects (Autoboxing) using wrapper classes

public class Pr4Q4 {
    public static void main(String[] args)
    {
        int a = 10;
        float b = 20.5f;
        char c = 'A';
        boolean d = true;

        Integer a1 = Integer.valueOf(a);
        Float b1 = Float.valueOf(b);
        Character c1 = Character.valueOf(c);
        Boolean d1  = Boolean.valueOf(d);

        System.out.println("Integer object: " + a1);
        System.out.println("Float object: " + b1);
        System.out.println("Character object: " + c1);
        System.out.println("Boolean object: " + d1);
    }
}