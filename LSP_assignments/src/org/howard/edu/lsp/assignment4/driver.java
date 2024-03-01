package org.howard.edu.lsp.assignment4;

public class driver {
    public static void main(String[] args) {
        // Create sets
        IntegerSet setA = new IntegerSet();
        setA.add(1);
        setA.add(2);
        setA.add(3);

        IntegerSet setB = new IntegerSet();
        setB.add(3);
        setB.add(4);
        setB.add(5);

        // Display sets
        System.out.println("Set A: " + setA);
        System.out.println("Set B: " + setB);

        // Perform operations
        System.out.println("Length of set A: " + setA.length());
        System.out.println("Is set A empty? " + setA.isEmpty());
        System.out.println("Is 2 in set A? " + setA.contains(2));
        System.out.println("Largest item in set A: " + setA.largest());
        System.out.println("Smallest item in set A: " + setA.smallest());


        // Set union
        setA.union(setB);
        System.out.println("Union of set A and set B: " + setA);

        // Set intersection
        setA.clear(); // Clear set A for intersection demonstration
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.intersect(setB);
        System.out.println("Intersection of set A and set B: " + setA);

        // Set difference
        setA.clear(); // Clear set A for difference demonstration
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.diff(setB);
        System.out.println("Difference of set A and set B: " + setA);

        // Set complement
        setA.clear(); // Clear set A for complement demonstration
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.complement(setB);
        System.out.println("Complement of set A with respect to set B: " + setA);
    }
}
