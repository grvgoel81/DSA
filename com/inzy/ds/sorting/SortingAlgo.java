package com.inzy.ds.sorting;

import java.util.Scanner;

public class SortingAlgo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch;
        do {
            int[] arr = new int[]{7, 11, 2, 4, 3, 9, 19, 1, 23, 56, 13};
            Sorting1 sorting = new Sorting1();
            System.out.println("\nSorting Algo");
            System.out.println("1. Bubble sort");
            System.out.println("2. Selection sort");
            System.out.println("3. Insertion sort");
            System.out.println("4. Heapsort");
            System.out.println("5. Mergesort");
            System.out.println("6. Bucket sort");
            System.out.println("7. Quick sort");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    sorting.bubbleSort(arr);
                    sorting.print("Bubble: ", arr);
                    break;
                case 2:
                    sorting.selectionSort(arr);
                    sorting.print("Selection: ", arr);
                    break;
                case 3:
                    sorting.insertionSort(arr, arr.length);
                    sorting.print("Insertion: ", arr);
                    break;
                case 4:

                    break;
                case 5:
                    sorting.mergeSort(arr, 0, arr.length - 1);
                    sorting.print("Merge: ", arr);
                    break;
                case 6:

                    break;
                case 7:
                    sorting.quickSort(arr, 0, arr.length - 1);
                    sorting.print("Quick: ", arr);
                    break;

                default:
                    System.out.println("wrong entry");
                    break;

            }
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scanner.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');
    }
}

class Sorting1 {

    void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    void insertionSort(int[] arr, int len) {
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

    private void merge(int[] arr, int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int[] L = new int[n1];
        int[] R = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];


        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = (l + r) / 2;

            // Sort first and second halves
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    void quickSort(int[] arr, int low, int high) {
        int i = low;
        int j = high;
        int pivot = arr[(i + j) / 2];
        while (i <= j) {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j) {
            quickSort(arr, low, j);
        }
        if (i < high) {
            quickSort(arr, i, high);
        }
    }

    void print(String type, int[] arr) {
        System.out.println(type + " ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
