package com.inzy.ds.sorting;

public class QuickSort {

    public static void main(String[] strg) {
        int arr[] = new int[]{7, 11, 2, 4, 3, 9, 19, 1, 23, 56, 13};
        QuickSort quickSort = new QuickSort();
        quickSort.printArray(arr);
        quickSort.quickSort(arr, 0, arr.length - 1);
        quickSort.printArray(arr);
    }


    private void quickSort(int[] arr, int low, int high) {
        int i = low;
        int j = high;
        int pivot = arr[(i + j) / 2];
        while (i <= j) {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i <= j) {
                int swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(arr, low, j);
        if (high > i)
            quickSort(arr, i, high);
    }

    private void printArray(int[] arr) {
        for (int i1 : arr) System.out.print(i1 + " ");
        System.out.println();
    }
}
