package com.inzy.ds.amazon;

import java.util.HashSet;
import java.util.Set;

public class Problems {
    int replace0with5(int num) {
        int output = num;
        int temp = 1;
        if (num == 0) {
            num = num + (5 * temp);
        }

        while (output > 0) {
            if (output % 10 == 0) {
                num = num + (temp * 5);
            }
            output = output / 10;
            temp = temp * 10;
        }
        return num;
    }

    void removeDups(int[] arr, int n) {
        Set<Integer> mp = new HashSet<>();
        for (int i = 0; i < n; ++i) {
            if (!mp.contains(arr[i]))
                System.out.print(arr[i] + " ");
            mp.add(arr[i]);
        }
    }

    int maxProduct(int arr[], int n) {
        int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            } else if (arr[i] > secMax) {
                secMax = arr[i];
            } else if (arr[i] < min) {
                secMin = min;
                min = arr[i];
            } else if (arr[i] < secMin) {
                secMin = arr[i];
            }
        }
        return Math.max(min * secMin, max * secMax);
    }

    int highestPowerOf2(int n) {
        int num = 1;
        while (num < n) {
            num = num * 2;
        }
        return num == n ? num : num / 2;

    }
}
