package com.inzy.ds.string;

import java.util.HashSet;

public class MyString {

    String LCS(String A, String B, int m, int n) {
        int[][] output = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 0 || j == 0) {
                    output[i][j] = 0;
                } else if (A.charAt(i - 1) == B.charAt(j - 1)) {
                    output[i][j] = output[i - 1][j - 1] + 1;
                } else {
                    output[i][j] = maxOf(output[i - 1][j], output[i][j - 1]);
                }
            }
        }
        int index = output[m][n];
        String out = "";
        int i = m, j = n;

        while (i > 0 && j > 0) {
            if (A.charAt(i - 1) == B.charAt(j - 1)) {
                out = A.charAt(i - 1) + out;
                i--;
                j--;
                index--;
            } else if (output[i - 1][j] > output[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }


        return index + "-" + out;

    }

    String LPS(String A, int m) {
        int[][] output = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    output[i][j] = 1;
                } else if (i > j) {
                    output[i][j] = 0;
                } else if (A.charAt(i) == A.charAt(j)) {
                    output[i][j] = output[i - 1][j - 1] + 2;
                } else {
                    output[i][j] = maxOf(output[i + 1][j], output[i][j - 1]);
                }
            }
        }
        System.out.println("");
        return "";
    }

    int maxOf(int a, int b) {
        return Math.max(a, b);
    }

    void firstNonRepeatedChar(String str) {
        HashSet<Character> repeated = new HashSet<>();
        HashSet<Character> nonRepeated = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (nonRepeated.contains(c)) {
                nonRepeated.remove(c);
                repeated.add(c);
            } else {
                nonRepeated.add(c);
            }
        }
        if (nonRepeated.iterator().hasNext())
            System.out.println("Non Repeated: " + nonRepeated.iterator().next());
        else System.out.println("No Non Repeated");

        if (repeated.iterator().hasNext())
            System.out.println("Repeated: " + repeated.iterator().next());
        else System.out.println("No Repeated Character");
    }

    String reverseRecursion(String str) {
        if (str.isEmpty())
            return "";
        int len = str.length() - 1;
        return str.charAt(len) + "" + reverseRecursion(str.substring(0, len));
    }

    boolean onlyDigit(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < 48 || str.charAt(i) > 57) {
                return false;
            }
        }
        return true;
    }

    boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str2.contains(str1.charAt(i) + "")) {
                int index = str2.indexOf(str1.charAt(i));
                str2 = str2.substring(0, index) + str2.substring(index + 1);
            }
        }
        return str2.isEmpty();
    }

    int occurrenceOfGivenChar(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (c == str.charAt(i)) {
                count++;
            }
        }

        return count;
    }

    boolean isPalindrome(String str1, int start, int end) {
        if (start > end || start == end) return true;
        if (str1.charAt(start) != str1.charAt(end))
            return false;
        return isPalindrome(str1, start + 1, end - 1);
    }

    // AB CD   ACBD
    boolean isInterleaved(String A, String B, String C) {
        if (A.length() + B.length() != C.length())
            return false;
        int j = 0, k = 0;
        for (int i = 0; i < C.length(); i++) {
            if (j < A.length() && C.charAt(i) == A.charAt(j)) {
                j++;
            } else if (k < B.length() && C.charAt(i) == B.charAt(k)) {
                k++;
            } else {
                return false;
            }
        }
        return true;
    }
}
