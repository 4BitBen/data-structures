package com.datastructures.skiplist;

/**
 * Represents a single node in a Skip List.
 * 
 * @author Ben Nelson
 * @author Dustin Savage
 * @author Mark Gordon
 */
public class Node<T> {
    private Node<T> next;
    private int width;
    private T data; 
}
