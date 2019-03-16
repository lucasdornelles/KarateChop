package com.kata.karatechop;

public class BinarySearch {

    public int indexOf(int item, Integer[] array) {
        int searchIndex = 0;
        int upperIndex = array.length;
        int lowerIndex = 0;
        int searchItem;
        int newSearchIndex;
        boolean endOfArray = false;
        while (!endOfArray) {
            newSearchIndex = (upperIndex + lowerIndex)/2;
            searchItem = array[newSearchIndex];
            if (searchItem > item) {
                if (newSearchIndex == searchIndex) endOfArray = true;
                else {
                    upperIndex = newSearchIndex;
                    searchIndex = newSearchIndex;
                }
            } else if (searchItem < item) {
                if (newSearchIndex == searchIndex) endOfArray = true;
                else {
                    lowerIndex = newSearchIndex;
                    searchIndex = newSearchIndex;
                }
            } else if (searchItem == item) {
                return newSearchIndex;
            }
        } return -1;
    }
}
