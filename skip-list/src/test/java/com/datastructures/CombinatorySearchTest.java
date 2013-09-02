package com.datastructures;

/**
 * Test out the combination of either a binary search of a linear search based off the data structure passed in.
 *
 * @author Ben Nelson
 */
public class CombinatorySearchTest extends LinearCollectionSearchTest {
    @Override
    public LinearCollectionSearch<Integer> createLinearCollectionSearch() {
        return new CombinatorySearch<Integer>(new LinearSearch<Integer>(), new BinarySearch<Integer>());
    }
}
