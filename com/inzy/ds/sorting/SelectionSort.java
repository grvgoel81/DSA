package com.inzy.ds.sorting;

public class SelectionSort {

    public static void main(String[] strg) {
        int[] arr = {21, 23, 2, 49, 25, 27, 12};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.printArray(arr);
        selectionSort.sort(arr, arr.length);
        selectionSort.printArray(arr);
    }

    private void sort(int[] arr, int len) {
        for (int i = 0; i < len; i++) {
            int minIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    private void printArray(int[] arr) {
        for (int i1 : arr) System.out.print(i1 + " ");
        System.out.println();
    }
}
