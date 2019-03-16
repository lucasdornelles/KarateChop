package com.kata.karatechop;

public class BinarySearch {

    public int indexOf(int item, Integer[] array) {
        int searchIndex = (array.length)/2;
        int upperIndex = array.length - 1;
        int searchItem = array[searchIndex];
        int newSearchIndex;
        boolean endOfArray = false;
        while (!endOfArray) {
            if (searchItem > item) {
                newSearchIndex = (searchIndex)/2;
                searchItem = array[newSearchIndex];
                if (newSearchIndex == searchIndex) endOfArray = true;
                else {
                    upperIndex = searchIndex;
                    searchIndex = newSearchIndex;
                }
            } else if (searchItem < item) {
                newSearchIndex = (searchIndex + upperIndex)/2;
                searchItem = array[newSearchIndex];
                if (newSearchIndex == searchIndex) endOfArray = true;
                else searchIndex = newSearchIndex;
            } else if (searchItem == item) {
                return searchIndex;
            }
        } return -1;
    }
}
