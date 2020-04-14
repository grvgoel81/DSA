package com.inzy.ds.ds;

import java.util.HashMap;
import java.util.Map;

public class Strings {
    public static void main(String[] args) {
//        int a[] = {1, 0, 0, 1, 0, 1, 0, 1, 1, 1,
//                1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0};
//        printDuplicate("TimesInternet");
//        sortBinaryArray(a, a.length);
//        System.out.println(remove("acbbcddc"));// ac
        removeDuplicates("acbbcddc");
    }

    static void removeDuplicates(String z) {
        String k = "";
        int i;
        for (i = 1; i < z.length(); i++) {
            if (z.charAt(i) != z.charAt(i - 1)) {
                k = k + z.charAt(i - 1);
            }
        }
        if (z.charAt(i - 2) != z.charAt(i - 1) || k.equals("")) {
            k += z.charAt(i - 1);
        }
        System.out.println(k);
    }

    private static String removeUtil1(String str, char last_removed) {
        if (str.length() < 2)
            return str;

        if (str.charAt(0) == str.charAt(1)) {
            last_removed = str.charAt(0);
            while (str.length() > 1 && str.charAt(0) == str.charAt(1))
                str = str.substring(1);
            str = str.substring(1);
            return removeUtil(str, last_removed);
        }
        String remStr = removeUtil(str.substring(1), last_removed);

        if (remStr.length() != 0 && remStr.charAt(0) == str.charAt(0)) {
            last_removed = remStr.charAt(0);
            return remStr.substring(1);
        }
        if (remStr.length() == 0 && last_removed == str.charAt(0)) {
            return remStr;
        }
        return str.charAt(0) + remStr;
    }

    private static String remove(String str) {
        char last_removed = '\0';
        return removeUtil(str, last_removed);
    }

    //********
    //**  22 Feb 2020
    //********

    // How do you print duplicate characters from a string?

    static void printDuplicate(String str) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (hashMap.containsKey(c)) {
                hashMap.put(c, hashMap.get(c) + 1);
            } else {
                hashMap.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate : " + entry.getKey());
            }
        }
    }

    // How do you check if two strings are anagrams of each other?
    static boolean anagramsStrings(String str, String anagram) {
        if (str.length() != anagram.length())
            return false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (anagram.contains(c + "")) {
                anagram = anagram.substring(0, anagram.indexOf(c) - 1) + anagram.substring(anagram.indexOf(c));
            }
        }
        return true;
    }

    static void sortBinaryArray(int[] arr, int n) {
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        System.out.println("Duplicate : " + arr);
    }

    private static String removeUtil(String str, char last_removed) {
        if (str.length() < 2) {
            return str;
        }
        if (str.charAt(0) == str.charAt(1)) {
            last_removed = str.charAt(0);
            while (str.length() > 1 && str.charAt(0) == str.charAt(1))
                str = str.substring(1);
            str = str.substring(1);
            return removeUtil(str, last_removed);
        }

        String remStr = removeUtil(str.substring(1), last_removed);

        if (remStr.length() != 0 && remStr.charAt(0) == str.charAt(0)) {
            last_removed = remStr.charAt(0);
            return remStr.substring(1);
        }
        if (remStr.length() == 0 && last_removed == str.charAt(0)) {
            return remStr;
        }
        return str.charAt(0) + remStr;
    }
}