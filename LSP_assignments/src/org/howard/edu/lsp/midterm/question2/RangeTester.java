package org.howard.edu.lsp.midterm.question2;

public class RangeTester {
    public static void test() {
        IntegerRange range1 = new IntegerRange(10, 20);
        IntegerRange range2 = new IntegerRange(15, 25);
        IntegerRange range3 = new IntegerRange(5, 15);

        System.out.println("Range 1: " + range1.contains(15)); // true
        System.out.println("Range 2: " + range2.contains(30)); // false

        System.out.println("Range 1 overlaps Range 2: " + range1.overlaps(range2)); // true
        System.out.println("Range 1 overlaps Range 3: " + range1.overlaps(range3)); // true
        System.out.println("Range 2 overlaps Range 3: " + range2.overlaps(range3)); // true

        System.out.println("Size of Range 1: " + range1.size()); // 11
        System.out.println("Size of Range 2: " + range2.size()); // 11
        System.out.println("Size of Range 3: " + range3.size()); // 11

        System.out.println("Range 1 equals Range 2: " + range1.equals(range2)); // false
        System.out.println("Range 1 equals Range 3: " + range1.equals(range3)); // false
    }
}
