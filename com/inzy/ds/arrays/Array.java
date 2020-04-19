package com.inzy.ds.arrays;

import java.util.HashMap;

public class Array {

    void findTriplet(int[] arr, int n) {
        HashMap<Integer, Integer> set = new HashMap<>();
        for (int i = 0; i < n; i++) {
            set.put(arr[i], i);
        }
        boolean contained = false;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (i == j) continue;
                int val = arr[i] + arr[j];
                if (set.containsKey(val) && set.get(val) != i && set.get(val) != j) {
                    contained = true;
                    System.out.println(arr[i] + " + " + arr[j] + " = " + val);
                }
            }
        }
        if (!contained) {
            System.out.println("no such triplet exist");
        }
    }
}
