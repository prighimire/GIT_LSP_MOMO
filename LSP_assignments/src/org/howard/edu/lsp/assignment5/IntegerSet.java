package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.List;

    /**
     * The IntegerSet class represents a set of integers and provides various operations on sets.
     * It includes methods for adding, removing, and manipulating integers in the set.
     * The set operations such as union, intersection, difference, and complement are also supported.
     * Additionally, it includes methods to check if the set is empty, find the largest and smallest elements, etc.
     */
    public class IntegerSet {
        private List<Integer> set;

        /**
         * Default Constructor: Creates an empty IntegerSet with an internal representation as an ArrayList
         */
        public IntegerSet() {
            this.set = new ArrayList<>();
        }

        /**
         * Constructor to pass in an already initialized set
         *
         * @param set The ArrayList of integers to initialize the IntegerSet
         */
        public IntegerSet(ArrayList<Integer> set) {
            this.set = set;
        }

        /**
         * Clears the internal representation of the set, making it an empty set
         */
        public void clear() {
            set.clear();
        }

        /**
         * Returns the length (number of elements) in the set
         *
         * @return The length of the set
         */
        public int length() {
            return set.size();
        }

        /**
         * Checks if two sets are equal.
         * Two sets are equal if they contain all of the same values in ANY order.
         *
         * @param o The object to compare with the current IntegerSet.
         * @return True if the sets are equal, false otherwise.
         */
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof IntegerSet)) return false;
            IntegerSet that = (IntegerSet) o;
            return set.containsAll(that.set) && that.set.containsAll(set);
        }

        /**
         * Checks if the set contains a specific value
         *
         * @param value The integer value to check for in the set
         * @return True if the set contains the value, false otherwise
         */
        public boolean contains(int value) {
            return set.contains(value);
        }

        /**
         * Returns the largest item in the set.
         *
         * @return The largest item in the set.
         * @throws RuntimeException If the set is empty.
         */
        public int largest() {
            if (set.isEmpty()) {
                throw new RuntimeException("IntegerSet is empty");
            }
            return set.stream().max(Integer::compare).orElseThrow();
        }

        /**
         * Returns the smallest item in the set
         *
         * @return The smallest item in the set
         * @throws RuntimeException If the set is empty
         */
        public int smallest() {
            if (set.isEmpty()) {
                throw new RuntimeException("IntegerSet is empty");
            }
            return set.stream().min(Integer::compare).orElseThrow();
        }

        /**
         * Adds an item to the set or does nothing if it is already present
         *
         * @param item The integer value to be added to the set
         */
        public void add(int item) {
            if (!set.contains(item)) {
                set.add(item);
            }
        }

        /**
         * Removes an item from the set or does nothing if it is not present
         *
         * @param item The integer value to be removed from the set
         */
        public void remove(int item) {
            set.remove(Integer.valueOf(item));
        }

        /**
         * Performs the union of the current set with another set
         * Adds all elements from the given set to the current set
         *
         * @param intSetb The IntegerSet to perform the union with
         */
        public void union(IntegerSet intSetb) {
            for (int item : intSetb.set) {
                add(item);
            }
        }

        /**
         * Performs the intersection of the current set with another set
         * Retains only the elements that are common to both sets
         *
         * @param intSetb The IntegerSet to perform the intersection with
         */
        public void intersect(IntegerSet intSetb) {
            set.retainAll(intSetb.set);
        }

        /**
         * Performs the set difference (s1 - s2) between the current set and another set
         * Removes all elements from the current set that are also present in the given set
         *
         * @param intSetb The IntegerSet to subtract from the current set
         */
        public void diff(IntegerSet intSetb) {
            set.removeAll(intSetb.set);
        }

        /**
         * Performs the set complement of the current set with respect to another set
         * All elements that are not in the current set but are in the given set are added to the current set
         *
         * @param intSetb The IntegerSet to find the complement with
         */
        public void complement(IntegerSet intSetb) {
            IntegerSet complementSet = new IntegerSet();
            complementSet.union(this);
            complementSet.diff(intSetb);
            set = complementSet.set;
        }

        /**
         * Checks if the set is empty
         *
         * @return True if the set is empty, false otherwise
         */
        public boolean isEmpty() {
            return set.isEmpty();
        }

        /**
         * Returns a String representation of the set
         *
         * @return The String representation of the set
         */
        @Override
        public String toString() {
            return set.toString();
        }
    }
