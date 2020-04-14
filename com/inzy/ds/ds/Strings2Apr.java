package com.inzy.ds.ds;

import java.util.HashMap;

public class Strings2Apr {
    public static void main(String[] args) {

        mergeTwoSortedArray(new int[]{2, 5, 7, 9, 13}, new int[]{1, 4, 7, 8, 10, 11, 12, 13, 14});
        findMinimum(new int[]{12, 5, 17, 2, 13, 6, 4, 1, 8});
        int a[] = {1, 0, 0, 1, 0, 1, 0, 1, 1, 1,
                1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0};

        int n = a.length;

        sortBinaryArray(a, n);
        System.out.print("Sorted: ");
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");


        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        char[] X = s1.toCharArray();
        char[] Y = s2.toCharArray();
        int m = X.length;
        n = Y.length;
        System.out.println("");
        System.out.println("Length of LCS is" + " " + lcs1(X, Y, m, n));
        pairOfIntegerArray(new int[]{1, 4, 8, 10, 11, 12, 7, 13, 3, 14}, 15);
        secHighestSalary(new int[]{1, 4, 14, 8, 13, 10, 11, 12, 7, 13, 3, 14});
        printCommon(new int[]{2, 5, 7, 8, 9, 13}, new int[]{1, 4, 7, 8, 10, 11, 12, 13, 14},
                new int[]{1, 5, 8, 10, 11, 12, 13, 14});
        isAnagram("kkashpfi", "pshkakif");
    }

    static char firstNonRepeated(String str) {

        return "".charAt(0);
    }

    static boolean isAnagram(String str, String anagram) {
        if (str.length() != anagram.length())
            return false;
        for (int i = 0; i < str.length(); i++) {
            if (anagram.contains("" + str.charAt(i))) {
                int index = anagram.indexOf(str.charAt(i));
                anagram = anagram.substring(0, index) + anagram.substring(index + 1);
            }
        }
        return anagram.isEmpty();
    }

    static int lcs1(char[] X, char[] Y, int m, int n) {

        int[][] L = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    L[i][j] = 0;
                } else if (X[i - 1] == Y[j - 1]) {
                    L[i][j] = L[i - 1][j - 1] + 1;
                } else {
                    L[i][j] = max(L[i - 1][j], L[i][j - 1]);
                }
            }
        }

        int index = L[m][n];
        char[] chars = new char[index];
        int i = m, j = n, k = index;

        while (i > 0 && j > 0) {
            if (X[i - 1] == Y[j - 1]) {
                chars[index - 1] = X[i - 1];
                index--;
                i--;
                j--;
            } else if (L[i - 1][j] > L[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }
        System.out.print("LCS: ");
        for (char c : chars) {
            System.out.print("" + c);
        }
        System.out.println("");
        return L[m][n];
    }

    private static void printCommon(int[] arr1, int[] arr2, int[] arr3) {
        int i = 0, j = 0, k = 0;
        String output = "";
        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                output = output + arr1[i];
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;
            }
        }
        System.out.println("Common: " + output);
    }

    static void secHighestSalary(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                secMax = max;
                max = arr[i];
            } else if (secMax < arr[i] && arr[i] != max) {
                secMax = arr[i];
            }
        }
        System.out.println("secHighestSalary: " + secMax);
    }

    static void sortBinaryArray(int a[], int n) {
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }
    }


    static void mergeTwoSortedArray(int[] arr1, int[] arr2) {
        int size1 = arr1.length, size2 = arr2.length;
        int i = 0, j = 0, k = 0;
        int[] output = new int[size1 + size2];
        while (i < size1 && j < size2) {
            if (arr1[i] < arr2[j]) {
                output[k] = arr1[i];
                i++;
                k++;
            } else {
                output[k] = arr2[j];
                j++;
                k++;
            }
        }
        while (i < size1) {
            output[k] = arr1[i];
            i++;
            k++;
        }
        while (j < size2) {
            output[k] = arr2[j];
            j++;
            k++;
        }

        for (int val : output) {
            System.out.println("Inzy " + val);
        }
    }

    static void findMinimum(int[] arr) {
        int size = arr.length;
        int min = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum: " + min);
    }


    static int lcs(char[] X, char[] Y, int m, int n) {
        int[][] L = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    L[i][j] = 0;
                } else if (X[i - 1] == Y[j - 1]) {
                    L[i][j] = L[i - 1][j - 1] + 1;
                } else {
                    L[i][j] = max(L[i - 1][j], L[i][j - 1]);
                }
            }
        }
        int index = L[m][n];
        char[] lcs = new char[index];
        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (X[i - 1] == Y[j - 1]) {
                lcs[index - 1] = X[i - 1];
                index--;
                i--;
                j--;
            } else if (L[i - 1][j] > L[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }
        System.out.print("LCS: ");
        for (char c : lcs) {
            System.out.print(c);
        }
        System.out.println("");
        return L[m][n];
    }

    static void pairOfIntegerArray(int[] arr, int k) {
        int length = arr.length;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        System.out.print("Pairs: ");
        for (int i = 0; i < length; i++) {
            int value = k - arr[i];
            if (hashMap.containsKey(value)) {
                System.out.print(" : " + hashMap.get(value) + "," + i);
            } else {
                hashMap.put(arr[i], i);
            }
        }
        System.out.println("");
    }

    static int max(int a, int b) {
        return Math.max(a, b);
    }
}
