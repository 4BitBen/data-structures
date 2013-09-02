package com.datastructures;

import java.util.List;

/**
 * Binary Search implementation.
 *
 * @author Ben Nelson
 */
public class BinarySearch<T extends Comparable> implements LinearCollectionSearch<T> {
    /**
     * Perform a binary search algorithm on <code>sortedList</code> to see if it contains <code>objectToFind</code>.
     *
     * Time Complexity: O(log n)
     * Space Complexity: O(1)
     *
     * @param sortedList the sorted list
     * @param objectToFind the object to find
     *
     * @return true if <code>sortedList</code> contains <code>objectToFind</code>, false otherwise
     */
    @Override
    public boolean contains(List<T> sortedList, T objectToFind) {
        return contains(sortedList, objectToFind, 0, sortedList.size() - 1);
    }
    
    private boolean contains(List<T> sortedList, T objectToFind, int startIndex, int endIndex) {
        if(startIndex > endIndex) { return false; }
        int middle = startIndex + ((endIndex - startIndex) / 2);
        int compareValue = objectToFind.compareTo(sortedList.get(middle));
        if(compareValue == 0) {
            return true;
        } else if(compareValue > 0) {
            return contains(sortedList, objectToFind, middle + 1, endIndex);
        } else {
            return contains(sortedList, objectToFind, 0, middle - 1);
        }
    }
}
