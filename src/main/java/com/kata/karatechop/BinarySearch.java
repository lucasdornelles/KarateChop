package com.kata.karatechop;

public class BinarySearch {

    public int indexOf(int item, Integer[] array) {
        int searchIndex = (array.length)/2;
        int searchItem = array[searchIndex];
        boolean endOfArray = false;
        while (!endOfArray) {
            if (searchItem > item) {
                searchIndex = searchIndex/2;
                searchItem = array[searchIndex];
            } else if (searchItem < item) {
                searchIndex = (searchItem + array.length)/2;
                searchItem = array[searchIndex];
            } else if (searchItem == item) {
                return searchIndex;
            }
        } return -1;
    }
}
