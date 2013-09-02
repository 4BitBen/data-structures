package com.datastructures;

/**
 * Test the brute-force linear search.
 */
public class LinearSearchTest extends LinearCollectionSearchTest {
    @Override
    public LinearCollectionSearch<Integer> createLinearCollectionSearch() {
        return new LinearSearch<Integer>();
    }
}
