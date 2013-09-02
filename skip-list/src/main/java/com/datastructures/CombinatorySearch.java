package com.datastructures;

import java.util.List;
import java.util.RandomAccess;

/**
 * LinearCollectionSearch implementation that will look to see if the List passed in supports RandomAccess. If so,
 * then the binary search algorithm is used.  If not, then the brute force (aka linear search) algorithm is used.
 *
 * @author Ben Nelson
 */
public class CombinatorySearch<T extends Comparable> implements LinearCollectionSearch<T> {
    private final LinearCollectionSearch<T> bruteForceSearch;
    private final LinearCollectionSearch<T> randomAccessSearch;

    /**
     * Create a search implementation
     *
     * @param bruteForceSearch the brute force (aka linear search) algorithm to use
     * @param randomAccessSearch the binary search algorithm to use
     */
    public CombinatorySearch(LinearCollectionSearch<T> bruteForceSearch, LinearCollectionSearch<T> randomAccessSearch) {
        this.bruteForceSearch = bruteForceSearch;
        this.randomAccessSearch = randomAccessSearch;
    }

    /**
     * Search <code>sortedList</code> to see if it contains <code>objectToFind</code>.
     * @param sortedList the sorted list
     * @param objectToFind the object to find
     *
     * @return true if <code>sortedList</code> contains <code>objectToFind</code>, false otherwise
     */
    @Override
    public boolean contains(List<T> sortedList, T objectToFind) {
        if(sortedList instanceof RandomAccess) {
            System.out.println("Using binary search.");
            return randomAccessSearch.contains(sortedList, objectToFind);
        } else {
            System.out.println("Using brute force search.");
            return bruteForceSearch.contains(sortedList, objectToFind);
        }
    }
}
