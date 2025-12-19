// Q6. Create a Vector with 10 elements and perform the following operations: 
// a) Add, Insert, Remove, and Update elements. 
// b) Check size and capacity. 
// c) Search an element using contains() and indexOf(). 
// d) Delete all elements.

import java.util.Vector;

public class Pr4Q6 {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<>();

        vec.add("A");
        vec.add("B");
        vec.add("C");
        vec.add("D");
        vec.add("E");
        vec.add("F");
        vec.add("G");
        vec.add("H");
        vec.add("I");
        vec.add("J");

        System.out.println("Vector: " + vec);

        vec.insertElementAt("X", 2);
        System.out.println("After Insert X at index 2: " + vec);

        vec.remove(4);
        System.out.println("After Remove element at index 4: " + vec);

        vec.set(5, "Y");
        System.out.println("After Update element at index 5 to Y: " + vec);

        System.out.println("Size of Vector: " + vec.size());
        System.out.println("Capacity of Vector: " + vec.capacity());

        System.out.println("Contains 'C': " + vec.contains("C"));
        System.out.println("Index of 'G': " + vec.indexOf("G"));

        vec.clear();
        System.out.println("After Deleting all elements: " + vec);
    }
}
