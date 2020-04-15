package com.inzy.ds.sorting;

import com.inzy.ds.Utils;

public class InsertionSort {

    public static void main(String[] strg) {
        int arr[] = Utils.getRandomArray(10);
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.printArray(arr);
        insertionSort.sortInsertion(arr, arr.length);
        insertionSort.printArray(arr);
    }


    private void sortInsertion(int[] arr, int len) {
        for (int i = 1; i < len; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    private void printArray(int[] arr) {
        for (int i1 : arr)
            System.out.print(i1 + " ");
        System.out.println();
    }
}
