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
        Integer[] array = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals("search for 0", 0, binarySearch.indexOf(1, array));
        assertEquals("search for 1", 1, binarySearch.indexOf(2, array));
    }

    @Test
    public void notInArray () {
        Integer[] array = new Integer[]{0, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(-1, binarySearch.indexOf(1, array));
    }


}
