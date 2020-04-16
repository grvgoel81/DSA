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
}
