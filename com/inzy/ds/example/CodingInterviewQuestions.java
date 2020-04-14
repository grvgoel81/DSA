package com.inzy.ds.example;

import java.util.HashMap;

public class CodingInterviewQuestions {

    public static void main(String[] args) {

        countTheOccurrenceOfGivenChar("countTheOccurrenceOfGivenChar", 'c');

        firstNonRepeatedCharacterFromString("firstNonRepeatedCharacterFromString");

        removeDuplicatesFromArray(new int[]{1, 2, 1, 2, 2, 2, 3, 4, 3, 6});

        reverseAnArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11});

        swapNumbers(3, 4);

        missingNumberInGivenIntegerArray(new int[]{1, 2, 3, 4, 5, 7, 8, 9, 10, 11});

    }

    // Question No : 1
    private static void countTheOccurrenceOfGivenChar(String str, char c) {
        char[] arr = str.toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == c) {
                count++;
            }
        }
        System.out.println("countTheOccurrenceOfGivenChar : " + count);
    }


    // Question No : 2
    private static void firstNonRepeatedCharacterFromString(String str) {
        char[] arr = str.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i])) {
                hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
            } else {
                hashMap.put(arr[i], 1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.get(arr[i]) == 1) {
                System.out.println("firstNonRepeatedCharacterFromString : " + arr[i]);
                break;
            }
        }
    }

    private static void removeDuplicatesFromArray(int[] arr) {
        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!hashMap.containsKey(arr[i])) {
                System.out.print(arr[i] + " ");
            }
            hashMap.put(arr[i], true);
        }
        System.out.println(" ");
    }

    private static void reverseAnArray(int[] arr) {
        int l = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[l];
            arr[l] = temp;
            l--;
        }
        printArray(arr);
    }

    // 4,3
    private static void swapNumbers(int a, int b) {
        System.out.println("Before " + a + " " + b);
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After " + a + " " + b);
    }

    private static void missingNumberInGivenIntegerArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] > 1) {
                System.out.print(arr[i] - 1 + " is missing");
            }
        }
    }

    private static void printArray(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
