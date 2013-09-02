package com.datastructures;

import java.util.List;

/**
 * Interface for searching a linear collection
 * 
 * @author Ben Nelson
 */
public interface LinearCollectionSearch<T extends Comparable> {
    /**
     * Search <code>sortedList</code> to see if it contains <code>objectToFind</code>.
     * @param sortedList the sorted list
     * @param objectToFind the object to find
     *
     * @return true if <code>sortedList</code> contains <code>objectToFind</code>, false otherwise
     */
    boolean contains(List<T> sortedList, T objectToFind);
}
