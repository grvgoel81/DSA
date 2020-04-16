package com.inzy.ds.amazon;

public class Main {
    public static void main(String[] args) {
        Problems problems = new Problems();

        System.out.println("replace0with5: " + problems.replace0with5(1016));
        int[] arr = {1, 2, 5, 1, 7, 2, 4, 2};
        int n = arr.length;
        problems.removeDups(arr, n);
    }
}
