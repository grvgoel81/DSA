package com.inzy.ds.google;

public class Main {
    public static void main(String[] args) {
        Google google = new Google();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        google.subArrayWithGivenSum(arr, 15);
        System.out.println("Valid : " + google.validParenthesis(""));

        char[] arr1 = {5, 3, 4, 9, 7, 6};
        char[] arr2 = {4, 3, 2, 1};
        google.nextGreaterElement(arr1, arr1.length);
    }
}
