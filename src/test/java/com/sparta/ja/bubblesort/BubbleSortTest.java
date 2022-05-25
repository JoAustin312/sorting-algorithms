package com.sparta.ja.bubblesort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BubbleSortTest
{
    @Test
    @DisplayName("check int array is being sorted")
    void checkIntArrayIsBeingSorted(){
        int[] expected = {2,6,10,34,48,52,94,152,285};
        int[] actual = {2,52,94,6,34,285,10,48,152};
        BubbleSort.bubbleSort(actual);
        Assertions.assertArrayEquals(expected, actual);
    }
}
