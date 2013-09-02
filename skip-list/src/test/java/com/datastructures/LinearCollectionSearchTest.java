package com.datastructures;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Abstract class for testing out a list.
 */
public abstract class LinearCollectionSearchTest {
    
    public abstract LinearCollectionSearch<Integer> createLinearCollectionSearch();
    
    @Test
    public void testContains_ArrayList() {
        List<Integer> data = new ArrayList<Integer>();
        data.add(1);
        data.add(3);
        data.add(5);
        data.add(7);
        data.add(9);
        data.add(11);
        data.add(13);
        
        LinearCollectionSearch<Integer> search = createLinearCollectionSearch();
        
        Assert.assertTrue(search.contains(data, 1));
        Assert.assertTrue(search.contains(data, 3));
        Assert.assertTrue(search.contains(data, 5));
        Assert.assertTrue(search.contains(data, 7));
        Assert.assertTrue(search.contains(data, 9));
        Assert.assertTrue(search.contains(data, 11));
        Assert.assertTrue(search.contains(data, 13));
        
        Assert.assertFalse(search.contains(data, 0));
        Assert.assertFalse(search.contains(data, 8));
        Assert.assertFalse(search.contains(data, 14));
    }

    @Test
    public void testContains_LinkedList() {
        List<Integer> data = new LinkedList<Integer>();
        data.add(1);
        data.add(3);
        data.add(5);
        data.add(7);
        data.add(9);
        data.add(11);
        data.add(13);

        LinearCollectionSearch<Integer> search = createLinearCollectionSearch();

        Assert.assertTrue(search.contains(data, 1));
        Assert.assertTrue(search.contains(data, 3));
        Assert.assertTrue(search.contains(data, 5));
        Assert.assertTrue(search.contains(data, 7));
        Assert.assertTrue(search.contains(data, 9));
        Assert.assertTrue(search.contains(data, 11));
        Assert.assertTrue(search.contains(data, 13));

        Assert.assertFalse(search.contains(data, 0));
        Assert.assertFalse(search.contains(data, 8));
        Assert.assertFalse(search.contains(data, 14));
    }
}
