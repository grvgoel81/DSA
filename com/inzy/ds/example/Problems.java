package com.inzy.ds.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Problems {
    public static void main(String[] strg) {
//        int a[] = {1, -7, 4, -1, -2, 1, 5, -3};
//        System.out.println(abc(a));
//        String name = "i like this program very much";
//        String sd[] = name.split(" ");
//        reverseWords(sd);
//        String str = "13z31tjkdhj53iiii8";
//        sumOfNumber(str);
//        int R = 4;
//        int C = 6;
//        int[][] arr =
//                {{1, 2, 3, 4, 5, 6},
//                        {7, 8, 9, 10, 11, 12},
//                        {13, 14, 15, 16, 17, 18},
//                        {19, 20, 21, 22, 23, 24}};
//        spiralPrint(R, C, arr);

        int[] arr = {15, 2, 4, 8, 10, 5, 10, 23};
        int n = arr.length;
        int sum = 22;
        subArraySum(arr, n, sum);
        int[] A = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1};

        System.out.println("Total number of 1's present are " + count(A, 0, A.length - 1));
    }

    private static int count(int A[], int left, int right) {

        if (A[right] == 0)
            return 0;
        if (A[left] == 1)
            return right - left + 1;
        int mid = (right + left) / 2;
        return count(A, left, mid) + count(A, mid + 1, right);
    }

    private static void subArraySum(int[] arr, int n, int sum) {
        int curr_sum = 0, start = 0, end = -1;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            curr_sum = curr_sum + arr[i];
            if (curr_sum == sum) {
                end = i;
                break;
            }

            if (hashMap.containsKey(curr_sum - sum)) {
                start = hashMap.get(curr_sum - sum) + 1;
                end = i;
                break;
            }
            hashMap.put(curr_sum, i);
        }
        if (end == -1) {
            System.out.println("No sub-sequence found");
        } else {
            System.out.println("start : " + start + " end : " + end);
        }
    }

    private static void spiralPrint(int m, int n, int[][] arr) {
        int i, k = 0, l = 0;

        while (k < m && l < n) {
            for (i = l; i < n; ++i) {
                System.out.print(arr[k][i] + " ");
            }
            k++;
            System.out.println("");
            for (i = k; i < m; ++i) {
                System.out.print(arr[i][n - 1] + " ");
            }
            n--;
            System.out.println("");
            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    System.out.print(arr[m - 1][i] + " ");
                }
                m--;
            }
            System.out.println("");
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    System.out.print(arr[i][l] + " ");
                }
                l++;
            }
            System.out.println("");
        }

    }


    public int totalParents(int input1, int input2, int[] input3) {
        int totalParents = 0;
        if (input3 == null || input1 == 0)
            return totalParents;

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < input1; i++) {
            if (input3[i] == -1) {
                continue;
            }
            if (hashMap.containsKey(input3[i])) {
                int count = hashMap.get(input3[i]);
                hashMap.put(input3[i], count + 1);
            } else {
                hashMap.put(input3[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > input2) {
                totalParents++;
            }
        }
        return totalParents;
    }

    public static void sumOfNumber(String str) {
        char[] ar = str.toCharArray();
        // 13 z 31 t j k d h j 53 i i i i 8
        String num = "";
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            if (Character.isDigit(ar[i])) {
                num = num + ar[i] + "";
            } else {
                if (!num.equals(""))
                    sum = sum + Integer.parseInt(num);
                num = "";
            }
        }
        if (!num.equals(""))
            sum = sum + Integer.parseInt(num);
        System.out.println("India " + sum);

    }

    public static void reverseWords(String sd[]) {
        for (int i = sd.length - 1; i >= 0; i--) {
            System.out.print(sd[i] + " ");
        }
    }

    private static int abc(int[] arr) {
        int curr_max = arr[0];
        int actual_max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            curr_max = Math.max(arr[i], curr_max + arr[i]);
            actual_max = Math.max(actual_max, curr_max);

        }
        return actual_max;
    }

    private static void printNGE(int arr[], int n) {

        for (int i = 0; i < arr.length; i++) {

        }

    }
}
