package com.datastructures;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Test against the Trees class.
 *
 * @author Ben Nelson
 */
public class TreesTest {
    @Test
    public void testGetHeight() {
        ImmutableBinaryTreeNode<Integer> treeNode1 = new ImmutableBinaryTreeNode<Integer>(1);
        ImmutableBinaryTreeNode<Integer> treeNode5 = new ImmutableBinaryTreeNode<Integer>(5);
        ImmutableBinaryTreeNode<Integer> treeNode3 = new ImmutableBinaryTreeNode<Integer>(3, treeNode1, treeNode5);
        ImmutableBinaryTreeNode<Integer> treeNode9 = new ImmutableBinaryTreeNode<Integer>(9);
        ImmutableBinaryTreeNode<Integer> treeNode13 = new ImmutableBinaryTreeNode<Integer>(13);
        ImmutableBinaryTreeNode<Integer> treeNode11 = new ImmutableBinaryTreeNode<Integer>(11, treeNode9, treeNode13);
        ImmutableBinaryTreeNode<Integer> treeNode7 = new ImmutableBinaryTreeNode<Integer>(7, treeNode3, treeNode11);

        Assert.assertEquals(2, Trees.getHeight(treeNode7));
    }

    @Test
    public void testBreadthFirstSearch() {
        ImmutableBinaryTreeNode<Integer> treeNode1 = new ImmutableBinaryTreeNode<Integer>(1);
        ImmutableBinaryTreeNode<Integer> treeNode5 = new ImmutableBinaryTreeNode<Integer>(5);
        ImmutableBinaryTreeNode<Integer> treeNode3 = new ImmutableBinaryTreeNode<Integer>(3, treeNode1, treeNode5);
        ImmutableBinaryTreeNode<Integer> treeNode9 = new ImmutableBinaryTreeNode<Integer>(9);
        ImmutableBinaryTreeNode<Integer> treeNode13 = new ImmutableBinaryTreeNode<Integer>(13);
        ImmutableBinaryTreeNode<Integer> treeNode11 = new ImmutableBinaryTreeNode<Integer>(11, treeNode9, treeNode13);
        ImmutableBinaryTreeNode<Integer> treeNode7 = new ImmutableBinaryTreeNode<Integer>(7, treeNode3, treeNode11);

        Queue<Integer> expectedData = new ArrayDeque<Integer>();
        expectedData.add(7);
        expectedData.add(3);
        expectedData.add(11);
        expectedData.add(1);
        expectedData.add(5);
        expectedData.add(9);
        expectedData.add(13);

        for(Integer data : Trees.breadthFirstSearch(treeNode7)) {
            Assert.assertEquals(expectedData.remove(), data);
        }
    }

    @Test
    public void testDepthFirstSearch_InOrder() {
        ImmutableBinaryTreeNode<Integer> treeNode1 = new ImmutableBinaryTreeNode<Integer>(1);
        ImmutableBinaryTreeNode<Integer> treeNode5 = new ImmutableBinaryTreeNode<Integer>(5);
        ImmutableBinaryTreeNode<Integer> treeNode3 = new ImmutableBinaryTreeNode<Integer>(3, treeNode1, treeNode5);
        ImmutableBinaryTreeNode<Integer> treeNode9 = new ImmutableBinaryTreeNode<Integer>(9);
        ImmutableBinaryTreeNode<Integer> treeNode13 = new ImmutableBinaryTreeNode<Integer>(13);
        ImmutableBinaryTreeNode<Integer> treeNode11 = new ImmutableBinaryTreeNode<Integer>(11, treeNode9, treeNode13);
        ImmutableBinaryTreeNode<Integer> treeNode7 = new ImmutableBinaryTreeNode<Integer>(7, treeNode3, treeNode11);

        Queue<Integer> expectedData = new ArrayDeque<Integer>();
        expectedData.add(1);
        expectedData.add(3);
        expectedData.add(5);
        expectedData.add(7);
        expectedData.add(9);
        expectedData.add(11);
        expectedData.add(13);

        for(Integer data : Trees.depthFirstSearch(treeNode7, Trees.DEPTH_FIRST_SEARCH.IN_ORDER)) {
            Assert.assertEquals(expectedData.remove(), data);
        }
    }

    @Test
    public void testDepthFirstSearch_PreOrder() {
        ImmutableBinaryTreeNode<Integer> treeNode1 = new ImmutableBinaryTreeNode<Integer>(1);
        ImmutableBinaryTreeNode<Integer> treeNode5 = new ImmutableBinaryTreeNode<Integer>(5);
        ImmutableBinaryTreeNode<Integer> treeNode3 = new ImmutableBinaryTreeNode<Integer>(3, treeNode1, treeNode5);
        ImmutableBinaryTreeNode<Integer> treeNode9 = new ImmutableBinaryTreeNode<Integer>(9);
        ImmutableBinaryTreeNode<Integer> treeNode13 = new ImmutableBinaryTreeNode<Integer>(13);
        ImmutableBinaryTreeNode<Integer> treeNode11 = new ImmutableBinaryTreeNode<Integer>(11, treeNode9, treeNode13);
        ImmutableBinaryTreeNode<Integer> treeNode7 = new ImmutableBinaryTreeNode<Integer>(7, treeNode3, treeNode11);

        Queue<Integer> expectedData = new ArrayDeque<Integer>();
        expectedData.add(7);
        expectedData.add(3);
        expectedData.add(1);
        expectedData.add(5);
        expectedData.add(11);
        expectedData.add(9);
        expectedData.add(13);

        for(Integer data : Trees.depthFirstSearch(treeNode7, Trees.DEPTH_FIRST_SEARCH.PRE_ORDER)) {
            Assert.assertEquals(expectedData.remove(), data);
        }
    }

    @Test
    public void testDepthFirstSearch_PostOrder() {
        ImmutableBinaryTreeNode<Integer> treeNode1 = new ImmutableBinaryTreeNode<Integer>(1);
        ImmutableBinaryTreeNode<Integer> treeNode5 = new ImmutableBinaryTreeNode<Integer>(5);
        ImmutableBinaryTreeNode<Integer> treeNode3 = new ImmutableBinaryTreeNode<Integer>(3, treeNode1, treeNode5);
        ImmutableBinaryTreeNode<Integer> treeNode9 = new ImmutableBinaryTreeNode<Integer>(9);
        ImmutableBinaryTreeNode<Integer> treeNode13 = new ImmutableBinaryTreeNode<Integer>(13);
        ImmutableBinaryTreeNode<Integer> treeNode11 = new ImmutableBinaryTreeNode<Integer>(11, treeNode9, treeNode13);
        ImmutableBinaryTreeNode<Integer> treeNode7 = new ImmutableBinaryTreeNode<Integer>(7, treeNode3, treeNode11);

        Queue<Integer> expectedData = new ArrayDeque<Integer>();
        expectedData.add(1);
        expectedData.add(5);
        expectedData.add(3);
        expectedData.add(9);
        expectedData.add(13);
        expectedData.add(11);
        expectedData.add(7);

        for(Integer data : Trees.depthFirstSearch(treeNode7, Trees.DEPTH_FIRST_SEARCH.POST_ORDER)) {
            Assert.assertEquals(expectedData.remove(), data);
        }

        Trees.depthFirstSearch(treeNode7, Trees.DEPTH_FIRST_SEARCH.POST_ORDER);
    }
}
