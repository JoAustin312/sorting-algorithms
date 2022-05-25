package com.sparta.ja.bubblesort;


public class BubbleSort
{
    public static void main( String[] args ) {

    }

    public static void bubbleSort(int[] arr){
        int n = arr.length;
        int tempNum = 0;
        for (int i = 0; i < n; i++){
            for (int j = 1; j < (n-i); j++){
                if (arr[j-1] > arr[j]){
                    tempNum = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = tempNum;
                }
            }
        }
    }
}
