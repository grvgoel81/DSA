package com.inzy.ds.example;

public class InsertionSort {

    public static void main(String[] strg) {
//        int arr[] = new int[]{7, 11, 2, 4, 3, 9, 19, 1, 23, 56, 13};
//        InsertionSort insertionSort = new InsertionSort();
//        insertionSort.printArray(arr);
//        insertionSort.sortInsertion(arr, arr.length);
//        insertionSort.printArray(arr);
        System.out.println(repeatedString("a", 1000000000));
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

    static long repeatedString(String line, long n) {
        long count = 0;
        long remCount = 0;
        long rem = line.length() % n;

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == 'a') {
                count++;
                if (i < rem) {
                    remCount++;
                }
            }
        }
        count = (count * (line.length() / n)) + remCount;
        return count;
    }
}
