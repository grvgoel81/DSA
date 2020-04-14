package com.inzy.ds.example;

// Java program to find Maximum difference
// between two elements such that larger
// element appears after the smaller number
class MaximumDiffrence {
    /* The function assumes that there are at least two
    elements in array.
    The function returns a negative value if the array is
    sorted in decreasing order.
    Returns 0 if elements are equal */


    private int maxDiff(int[] arr, int size) {
        int max_diff = arr[1] - arr[0], min_val = arr[0];
        for (int i = 1; i < size - 1; i++) {
            if (arr[i] - min_val > max_diff)
                max_diff = arr[i] - min_val;
            if (arr[i] < min_val)
                min_val = arr[i];
        }
        return max_diff;
    }

    /* Driver program to test above functions */
    public static void main(String[] args) {
        MaximumDiffrence maxdif = new MaximumDiffrence();
        int[] arr = {11, 16, 90, 20, 110, 9};
        int size = arr.length;
        System.out.println("MaximumDifference is " + maxdif.maxDiff(arr, size));
    }
}

// This code has been contributed by Mayank Jaiswal

