package com.datastructures;

/**
 * Test the binary search method.
 */
public class BinarySearchTest extends LinearCollectionSearchTest {
    @Override
    public LinearCollectionSearch<Integer> createLinearCollectionSearch() {
        return new BinarySearch<Integer>();
    }
}
