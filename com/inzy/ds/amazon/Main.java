package com.inzy.ds.amazon;

public class Main {
    public static void main(String[] args) {
        Amazon amazon = new Amazon();

        System.out.println("replace0with5: " + amazon.replace0with5(1016));
        int[] arr = {1, 2, 5, 1, 7, 2, 4, 2};
        int n = arr.length;
        amazon.removeDups(arr, n);
        int[] product = {1, 4, 3, -6, 7, -7};
        System.out.println("Product: " + amazon.maxProduct(product, product.length));
        System.out.println("Highest PowerOf2: " + amazon.highestPowerOf2(127));
        int[] nextGreat = {16, 17, 4, 3, 5, 2};
        amazon.replaceWithNextGreatest(nextGreat, nextGreat.length);
        System.out.println("countSubStringStartEndWith1: " + amazon.countSubStringStartEndWith1("001110111111000100101011"));
    }
}
