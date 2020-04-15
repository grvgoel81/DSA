package com.inzy.ds;

public class Utils {
    public static int[] getRandomArray(int length) {
        int[] randoms = new int[length];
        for (int i = 0; i < length; i++) {
            randoms[i] = (int) (Math.random() * 100);
        }
        return randoms;
    }
}
