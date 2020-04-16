package com.inzy.ds.amazon;

public class Main {
    public static void main(String[] args) {
        Problems problems = new Problems();

        System.out.println("replace0with5: " + problems.replace0with5(1016));
        int[] arr = {1, 2, 5, 1, 7, 2, 4, 2};
        int n = arr.length;
        problems.removeDups(arr, n);
        int[] product = {1, 4, 3, -6, 7, -7};
        System.out.println("Product: " + problems.maxProduct(product, product.length));
        System.out.println("Highest PowerOf2: " + problems.highestPowerOf2(127));
        int[] nextGreat = {16, 17, 4, 3, 5, 2};
        problems.replaceWithNextGreatest(nextGreat, nextGreat.length);
    }
}
