package com.inzy.ds.google;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Google {

    void subArrayWithGivenSum(int[] arr, int sum) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(i - 1)) {
                int val = hashMap.get(i - 1) + arr[i];
                if (val == sum) {
                    System.out.println(j + " : " + i);
                    return;
                } else if (val > sum) {
                    val = val - arr[j];
                    hashMap.put(i, val);
                    j++;
                    if (val == sum) {
                        System.out.println(j + " : " + i);
                        return;
                    }
                } else {
                    hashMap.put(i, val);
                }
            } else {
                hashMap.put(i, arr[i]);
                if (arr[i] == sum) {
                    System.out.println(j + " : " + i);
                    return;
                }
            }
        }
    }

    void nextGreaterElement(char[] arr, int len) {
        int minNum = Integer.MAX_VALUE;
        int minPos = len;
        int i;
        for (i = len - 1; i > 0; i--) {
            if (arr[i] < minNum) {
                minNum = arr[i];
                minPos = i;
            }
            if (arr[i - 1] < arr[i]) {
                break;
            }
        }
        arr[minPos] = arr[i - 1];
        arr[i - 1] = (char) minNum;
        Arrays.sort(arr, i, len);
        printArray(arr, "nextGreaterElement");
    }

    boolean validParenthesis(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (stack.empty()) {
                stack.push(str.charAt(i));
                continue;
            }
            char c = stack.pop();
            if (str.charAt(i) == c) {
                stack.push(c);
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    private void printArray(char[] arr, String title) {
        System.out.println(title);
        for (int val : arr) {
            System.out.print("[" + val + "] ");
        }
    }
}
