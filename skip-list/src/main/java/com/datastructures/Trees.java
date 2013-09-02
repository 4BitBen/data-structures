package com.datastructures;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Perform tree-based algorithms on a tree-like structure.
 *
 * @author Ben Nelson
 */
public class Trees {
    enum DEPTH_FIRST_SEARCH {
        PRE_ORDER,
        IN_ORDER,
        POST_ORDER
    }

    /**
     * Determine the height of the tree.
     *
     * @param treeNode the root node
     * @return the height of the tree
     */
    public static int getHeight(BinaryTreeNode<?> treeNode) {
        if(treeNode.getLeft() != null || treeNode.getRight() != null) {
            return 1 + Math.max(getHeight(treeNode.getLeft()), getHeight(treeNode.getRight()));
        } else {
            return 0;
        }

    }

    /**
     * Perform a breadth-first search on a given node.
     *
     * @param treeNode the starting point
     */
    public static <T> Iterable<T> breadthFirstSearch(BinaryTreeNode<T> treeNode) {
        Queue<BinaryTreeNode<T>> queue = new ArrayDeque<BinaryTreeNode<T>>();
        queue.add(treeNode);
        Queue<T> data = new ArrayDeque<T>();
        breadthFirstSearch(queue, data);
        return data;
    }

    private static <T> void breadthFirstSearch(Queue<BinaryTreeNode<T>> traversalNodes, Queue<T> data) {
        if(traversalNodes.isEmpty()) { return; }
        BinaryTreeNode<T> node = traversalNodes.remove();
        data.add(node.getData());
        if(node.getLeft() != null) {
            traversalNodes.add(node.getLeft());
        }
        if(node.getRight() != null) {
            traversalNodes.add(node.getRight());
        }
        breadthFirstSearch(traversalNodes, data);
    }

    /**
     * Perform a depth-first search on a given node.  Takes up O(n) space.
     *
     * @param treeNode the starting point
     * @param order the traversal order
     */
    public static <T> Iterable<T> depthFirstSearch(BinaryTreeNode<T> treeNode, DEPTH_FIRST_SEARCH order) {
        Queue<T> data = new ArrayDeque<T>();
        depthFirstSearch(treeNode, order, data);
        return data;
    }

    private static <T> void depthFirstSearch(BinaryTreeNode<T> treeNode, DEPTH_FIRST_SEARCH order, Queue<T> data) {
        if(treeNode == null) {
            return;
        }
        switch (order) {
            case IN_ORDER:
                depthFirstSearch(treeNode.getLeft(), order, data);
                data.add(treeNode.getData());
                depthFirstSearch(treeNode.getRight(), order, data);
                break;
            case PRE_ORDER:
                data.add(treeNode.getData());
                depthFirstSearch(treeNode.getLeft(), order, data);
                depthFirstSearch(treeNode.getRight(), order, data);
                break;
            case POST_ORDER:
                depthFirstSearch(treeNode.getLeft(), order, data);
                depthFirstSearch(treeNode.getRight(), order, data);
                data.add(treeNode.getData());
                break;
        }
    }
}
