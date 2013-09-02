package com.datastructures;

import java.util.List;

/**
 * Brute force search
 * 
 * @author Ben Nelson
 */
public class LinearSearch<T extends Comparable> implements LinearCollectionSearch<T> {
    /**
     * Perform a brute force (aka linear search) algorithm on <code>sortedList</code> to see if it
     * contains <code>objectToFind</code>.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     *
     * @param sortedList the sorted list
     * @param objectToFind the object to find
     *
     * @return true if <code>sortedList</code> contains <code>objectToFind</code>, false otherwise
     */
    @Override
    public boolean contains(List<T> sortedList, T objectToFind) {
        for(T currentObject : sortedList) {
            if(currentObject.equals(objectToFind)) {
                return true;
            }
        }
        return false;
    }
}
