package com.datastructures;

/**
 * Interface for a binary tree.
 *
 * @author Ben Nelson
 */
public interface BinaryTreeNode<T> {
    /**
     * Get the left node.
     *
     * @return the left node, can be null
     */
    BinaryTreeNode<T> getLeft();

    /**
     * Get the right node
     *
     * @return the right node, can be null
     */
    BinaryTreeNode<T> getRight();

    /**
     * Get the data
     *
     * @return the data
     */
    T getData();
}
