package com.mars.main;

import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {

    @Test
    public void should_bubble_sort() throws Exception {
        testSort(new BubbleSort());
    }

    @Test
    public void should_quick_sort() throws Exception {
        testSort(new QuickSort());
    }

    public void testSort(Sort sort) {
        int[] input = new int[]{5, 4, 3, 2, 1};
        int[] result = sort.sort(input);
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result);
    }

}
