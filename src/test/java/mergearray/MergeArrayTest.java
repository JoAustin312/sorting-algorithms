package mergearray;

import com.sparta.ja.mergearray.MergeArray;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static com.sparta.ja.mergearray.MergeArray.mergeArrays;
import static com.sparta.ja.mergearray.MergeArray.isSorted;

public class MergeArrayTest {

    @Test
    @DisplayName("return true for sorted array")
    void returnTrueForSortedArray(){
        int[] sorted = { 1, 2, 3, 4 };
        assertTrue(isSorted(sorted));
    }

    @Test
    @DisplayName("return False for sorted array")
    void returnFalseForSortedArray(){
        int[] sorted = { 3, 2, 4, 1 };
        assertFalse(isSorted(sorted));
    }

    @Test
    @DisplayName("return merged sorted array from 2 sorted arrays")
    public void returnMergedSortedArrayFrom2SortedArrays() {
        int[] firstArray = {3, 4, 7, 12};
        int[] secondArray = {2, 6, 8, 13, 17};
        int[] expected = { 2, 3, 4, 6, 7, 8, 12, 13, 17 };

        assertArrayEquals(expected, mergeArrays(firstArray, secondArray));
    }

    @Test
    @DisplayName("return merged sorted array from 2 unsorted arrays")
    public void returnMergedSortedArrayFrom2UnsortedArrays() {
        int[] firstArray = {12, 3, 7, 4};
        int[] secondArray = {13, 17, 8, 2, 6};
        int[] expected = { 2, 3, 4, 6, 7, 8, 12, 13, 17 };

        Assertions.assertArrayEquals(expected, mergeArrays(firstArray, secondArray));
    }
}
