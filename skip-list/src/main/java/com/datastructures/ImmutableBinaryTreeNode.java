package com.datastructures;

/**
 * Immutable implementation of the BinaryTreeNode
 *
 * @author Ben Nelson
 */
public class ImmutableBinaryTreeNode<T> implements BinaryTreeNode<T> {
    private BinaryTreeNode<T> left;
    private BinaryTreeNode<T> right;
    private T data;

    public ImmutableBinaryTreeNode(T data) {
        this.data = data;
    }

    public ImmutableBinaryTreeNode(T data, BinaryTreeNode<T> left, BinaryTreeNode<T> right) {
        this.left = left;
        this.right = right;
        this.data = data;
    }

    @Override
    public BinaryTreeNode<T> getLeft() {
        return left;
    }

    @Override
    public BinaryTreeNode<T> getRight() {
        return right;
    }

    @Override
    public T getData() {
        return data;
    }
}
