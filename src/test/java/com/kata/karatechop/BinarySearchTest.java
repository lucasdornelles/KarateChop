package com.kata.karatechop;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class BinarySearchTest {

    BinarySearch binarySearch;

    @Before
    public void setBinarySearch () {

        binarySearch = new BinarySearch();

    }

    @Test
    public void longOddArray () {
        Integer[] array = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        assertEquals("search for 1", 0, binarySearch.indexOf(1, array));
        assertEquals("search for 2", 1, binarySearch.indexOf(2, array));
        assertEquals("search for 3", 2, binarySearch.indexOf(3, array));
        assertEquals("search for 4", 3, binarySearch.indexOf(4, array));
        assertEquals("search for 5", 4, binarySearch.indexOf(5, array));
        assertEquals("search for 6", 5, binarySearch.indexOf(6, array));
        assertEquals("search for 7", 6, binarySearch.indexOf(7, array));
        assertEquals("search for 8", 7, binarySearch.indexOf(8, array));
        assertEquals("search for 9", 8, binarySearch.indexOf(9, array));
        assertEquals("search for 10", 9, binarySearch.indexOf(10, array));
        assertEquals("search for 11", 10, binarySearch.indexOf(11, array));
        assertEquals("search for 12", 11, binarySearch.indexOf(12, array));
        assertEquals("search for 13", 12, binarySearch.indexOf(13, array));
        assertEquals("search for 14", 13, binarySearch.indexOf(14, array));
        assertEquals("search for 15", 14, binarySearch.indexOf(15, array));
    }

    @Test
    public void notInArray () {
        Integer[] array = new Integer[]{0, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(-1, binarySearch.indexOf(1, array));
    }


}
