package com.sparta.ja.bubblesort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BubbleSortTest
{
    @Test
    @DisplayName("check int array 5 elements is being sorted")
    void checkIntArray5ElementsIsBeingSorted(){
        int[] expected = {2,48,94,152,285};
        int[] actual = {2,94,285,48,152};
        BubbleSort.bubbleSort(actual);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("check int array negative elements is being sorted")
    void checkIntNegativeElementsIsBeingSorted(){
        int[] expected = {-285,-152,-94,-52,-48,-34,-10,-6,-2};
        int[] actual = {-2,-52,-94,-6,-34,-285,-10,-48,-152};
        BubbleSort.bubbleSort(actual);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("check int array negative and positive elements is being sorted")
    void checkIntNegativeAndPositiveElementsIsBeingSorted(){
        int[] expected = {-285,-94,-48,-34,-2,5,19,64,192};
        int[] actual = {-2,5,-94,64,-34,-285,19,-48,192};
        BubbleSort.bubbleSort(actual);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("check int array 9 elements is being sorted")
    void checkIntArray9ElementsIsBeingSorted(){
        int[] expected = {2,6,10,34,48,52,94,152,285};
        int[] actual = {2,52,94,6,34,285,10,48,152};
        BubbleSort.bubbleSort(actual);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("check empty array does not throw error") //not sure if this test is necessary
    void checkEmptyArrayDoesNotThrowError(){
        int[] expected = {};
        int[] actual = {};
        BubbleSort.bubbleSort(actual);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("check int array 1 element is returning same element")
    void checkIntArray1ElementIsReturningSameElement(){
        int[] expected = {5};
        int[] actual = {5};
        BubbleSort.bubbleSort(actual);
        Assertions.assertArrayEquals(expected, actual);
    }


}
