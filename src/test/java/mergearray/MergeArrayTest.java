package mergearray;

import com.sparta.ja.mergearray.MergeArray;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MergeArrayTest {

    @Test
    @DisplayName("return true for sorted array")
    void returnTrueForSortedArray(){
        int[] sorted = { 1, 2, 3, 4 };
        assertTrue(MergeArray.isSorted(sorted));
    }

    @Test
    @DisplayName("return False for sorted array")
    void returnFalseForSortedArray(){
        int[] sorted = { 3, 2, 4, 1 };
        assertFalse(MergeArray.isSorted(sorted));
    }

    @Test
    @DisplayName("return merged sorted array from 2 sorted arrays")
    public void returnMergedSortedArrayFrom2SortedArrays() {
        int[] firstArray = {3, 4, 7, 12};
        int[] secondArray = {2, 6, 8, 13, 17};
        int[] merged = { 2, 3, 4, 6, 7, 8, 12, 13, 17 };

        assertArrayEquals(merged, MergeArray.mergeArrays(firstArray, secondArray));
    }

    @Test
    @DisplayName("return merged sorted array from 2 unsorted arrays")
    public void returnMergedSortedArrayFrom2UnsortedArrays() {
        int[] firstArray = {12, 3, 7, 4};
        int[] secondArray = {13, 17, 8, 2, 6};
        int[] merged = { 2, 3, 4, 6, 7, 8, 12, 13, 17 };

        Assertions.assertArrayEquals(merged, MergeArray.mergeArrays(firstArray, secondArray));
    }
}
