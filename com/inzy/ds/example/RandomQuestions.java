package com.inzy.ds.example;

public class RandomQuestions {

    public static void main(String[] strg) {
        String str = "gnisnealogielsa";
        findNonRepeatingCharacter(str);
        int[] arr = {-21, -54, -19, -40, -32, -21, -12, -9, -3, -2};
        int arr2D[][] = {{0, 1, 1, 1},
                {0, 1, 0, 1},
                {0, 1, 1, 0},
                {1, 0, 1, 0}};
        int[] lisArr = {50, 3, 10, 7, 60, 80, 90};
        maxSumContiguous(arr);
        upcaseLength3("I am indian boy aaa bbbb bb.");
        System.out.println("LIS: " + _lis(lisArr));
    }

    private static void longestLine(int[][] arr) {
        int line = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

            }
        }
    }

    private static int _lis(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                count++;
            }
        }
        return count;
    }

    private static void findNonRepeatingCharacter(String str) {
        char[] arr = str.toCharArray();
        for (char a : arr) {
            if (str.indexOf(a) == str.lastIndexOf(a)) {
                System.out.println(a + " is first non repeating char");
                break;
            }
        }
    }

    private static void upcaseLength3(String str) {
        String result = "";
        String[] arr = str.split(" ");
        for (String s : arr) {
            if (s.length() == 3) {
                result = result + " " + s.toUpperCase();
            } else {
                result = result + " " + s;
            }
        }
        System.out.println("Final String: " + result);
    }

    private static void maxSumContiguous(int[] arr) {
        int sum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            if (sum < arr[i] + arr[i + 1]) {
                sum = arr[i] + arr[i + 1];
            }
        }
        System.out.println("max sum of contiguous: " + sum);
    }
}
