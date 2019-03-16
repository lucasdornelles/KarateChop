package com.kata.karatechop;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class BinarySearchTest {

    BinarySearch binarySearch;
    private Integer[] array;

    @Before
    public void setBinarySearch () {

        binarySearch = new BinarySearch();

    }

    @Test
    public void longEvenArray () {
        array = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8};
        assertEquals(0, binarySearch.indexOf(1, array));

    }


}
