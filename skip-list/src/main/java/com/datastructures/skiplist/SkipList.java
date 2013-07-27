package com.datastructures.skiplist;

import java.util.List;

/**
 * A <a href="http://en.wikipedia.org/wiki/Skip_list">Skip List</a> implementation of the java collections List.
 * 
 * @author Ben Nelson
 * @author Dustin Savage
 * @author Mark Gordon
 */
public class SkipList<T> implements List<T> {
    private Node<T>[] levels;
    private int skipSize;
}
