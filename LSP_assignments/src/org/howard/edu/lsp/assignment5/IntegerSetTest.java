package org.howard.edu.lsp.assignment5;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class IntegerSetTest {
    private IntegerSet integerSet;

    @BeforeEach
    void setUp() {
        integerSet = new IntegerSet();
    }

    @Test
    @DisplayName("Test case for clear")
    public void testClear() {
        integerSet.add(1);
        integerSet.add(2);
        integerSet.clear();
        assertTrue(integerSet.isEmpty());
    }

    @Test
    @DisplayName("Test case for length")
    public void testLength() {
        integerSet.add(1);
        integerSet.add(2);
        assertEquals(2, integerSet.length());
    }

    @Test
    @DisplayName("Test case for equals")
    public void testEquals() {
        IntegerSet intSetA = new IntegerSet(new ArrayList<>(Arrays.asList(1, 2, 3)));
        IntegerSet intSetB = new IntegerSet(new ArrayList<>(Arrays.asList(3, 2, 1)));
        assertTrue(intSetA.equals(intSetB));
    }

    @Test
    @DisplayName("Test case for contains")
    public void testContains() {
        integerSet.add(1);
        assertTrue(integerSet.contains(1));
        assertFalse(integerSet.contains(2));
    }

    @Test
    @DisplayName("Test case for largest")
    public void testLargest() {
        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(3);
        assertEquals(3, integerSet.largest());
    }

    @Test
    @DisplayName("Test case for largest when empty")
    public void testLargestWhenEmpty() {
        assertThrows(RuntimeException.class, () -> integerSet.largest());
    }

    @Test
    @DisplayName("Test case for smallest")
    public void testSmallest() {
        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(3);
        assertEquals(1, integerSet.smallest());
    }

    @Test
    @DisplayName("Test case for smallest when empty")
    public void testSmallestWhenEmpty() {
        assertThrows(RuntimeException.class, () -> integerSet.smallest());
    }

    @Test
    @DisplayName("Test case for add")
    public void testAdd() {
        integerSet.add(1);
        integerSet.add(1);
        assertEquals(1, integerSet.length());
    }

    @Test
    @DisplayName("Test case for remove")
    public void testRemove() {
        integerSet.add(1);
        integerSet.remove(1);
        assertEquals(0, integerSet.length());
    }

    @Test
    @DisplayName("Test case for union")
    public void testUnion() {
        IntegerSet intSetA = new IntegerSet(new ArrayList<>(Arrays.asList(1, 2, 3)));
        IntegerSet intSetB = new IntegerSet(new ArrayList<>(Arrays.asList(3, 4, 5)));
        intSetA.union(intSetB);
        assertEquals("[1, 2, 3, 4, 5]", intSetA.toString());
    }

    @Test
    @DisplayName("Test case for intersection")
    public void testIntersection() {
        IntegerSet intSetA = new IntegerSet(new ArrayList<>(Arrays.asList(1, 2, 3)));
        IntegerSet intSetB = new IntegerSet(new ArrayList<>(Arrays.asList(3, 4, 5)));
        intSetA.intersect(intSetB);
        assertEquals("[3]", intSetA.toString());
    }

    @Test
    @DisplayName("Test case for difference")
    public void testDifference() {
        IntegerSet intSetA = new IntegerSet(new ArrayList<>(Arrays.asList(1, 2, 3)));
        IntegerSet intSetB = new IntegerSet(new ArrayList<>(Arrays.asList(3, 4, 5)));
        intSetA.diff(intSetB);
        assertEquals("[1, 2]", intSetA.toString());
    }

    @Test
    @DisplayName("Test case for complement")
    public void testComplement() {
        IntegerSet intSetA = new IntegerSet(new ArrayList<>(Arrays.asList(1, 2, 3)));
        IntegerSet intSetB = new IntegerSet(new ArrayList<>(Arrays.asList(3, 4, 5)));
        intSetA.complement(intSetB);
        assertEquals("[1, 2]", intSetA.toString());
    }

    @Test
    @DisplayName("Test case for isEmpty")
    public void testIsEmpty() {
        assertTrue(integerSet.isEmpty());
       
    }
    
    @Test
    @DisplayName("Test case for toString")
    public void testToString() {
        assertEquals("[1, 2, 3]", integerSet.toString());
    }
    
}
