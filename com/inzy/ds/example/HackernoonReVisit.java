package com.inzy.ds.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class HackernoonReVisit {
    public static void main(String[] strg) {
        int[] arrRandom = getRandomArray(11);
        int[] arr = {20, 22, 23, 24, 25, 24, 22, 26, 25, 24};
        int[] arr1 = new int[5];
//        System.out.println("Random Integer array : " + Arrays.toString(arr));
//        System.out.println("missingNumber " + missingNumberInGivenIntegerArray(new int[]{3, 10, 2, 4, 6, 7, 5, 8, 9}, 10));
//        duplicateNumberOnGivenIntegerArray(arr);
//        largestAndSmallestNumberInUnsortedIntegerArray(arr);
//        allPairsOfIntegerArrayWhoseSumIsEqualToGivenNumber(arr, 11);
//        reverseArray(arr);
//        System.out.println("isAnagramsWord " + isAnagramsWord("schoolmaster", "theclassroom"));
//        nonRepeatedCharacter("isanagramsWord");
//        System.out.println("reversedUsingRecursion " + reversedUsingRecursion("schoolmaster"));
//        System.out.println("isDigitaNumber " + isDigitaNumber("125678"));
//        System.out.println("occurrenceOfGivenCharacter  " + occurrenceOfGivenCharacter("12schOOOlmaster5678oo", 'O'));
//        permutation("1234");
//        System.out.println(atoi("65536688"));
//        System.out.println("validShuffleOfTwoString " + validShuffleOfTwoString("abc", "def", "dacbef"));
//        System.out.println("findKthLargest " + findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
//        System.out.println("removeGivenCharacter " + removeGivenCharacter("isanagramsWord", 'a'));
//        intersectionOfTwoSortedArray(new int[]{2, 3, 3, 5, 7, 10,}, new int[]{1, 2, 3, 3, 6, 7, 8, 9, 10});
//        topTwoNumbers(arr);
//        getSequence(arr);
//        int arr2[] = {1, 9, 3, 10, 4, 20, 2};
//        int arr2[] = {2, 5, 3, 7, 4, 8, 5, 13, 6};
//        int n = arr2.length;
//        System.out.println("findLongestConseqSubseq " + findLongestConseqSubseq(arr2, n));
//        System.out.println("isAnagram " + isAnagram("admirer", "madried"));
//        System.out.println("rotLeft " + Arrays.toString(rotLeft(new int[]{1, 2, 3, 4, 5}, 4)));
//        intersectionOfTwoUnsortedArrays(new int[]{3, 3, 3, 2, 5, 5, 7, 10,}, new int[]{3, 3, 6, 7, 1, 2, 8, 9, 10});

//        int k = 7;
//        int[] arrSmall = new int[]{12, 3, 5, 7, 4, 19, 26};  // 3, 4, 5, 7, 12, 19, 26
//        System.out.print("K'th smallest element is " + kthSmallest(arrSmall, 0, arrSmall.length - 1, k));

//        System.out.print(string_minimization("aabcccabba"));

    }
    // cabb abcc

    static int abc(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    static int string_minimization(String str) {

        int n = str.length();
        if (n < 2) {
            return 0;
        }
        int i = n / 2;
        String left = str.substring(0, i);
        String right = str.substring(i);

        int rightpos = i - 1;
        char cr = right.charAt(rightpos);
        char cl = left.charAt(0);
        if (cr == cl) {
            while (left.charAt(0) == cr) {
                left = left.substring(1);
            }
            while (right.charAt(rightpos) == cl) {
                rightpos--;
                right = right.substring(0, rightpos);
            }
        }
        String finalStr = right + left;
        return finalStr.length();
    }

    static int string_minimizationq(String s) {

        int n = s.length();
        if (n < 2) {
            return 0;
        }
        int len = 0;
        int i = n / 2;
        while (i < n) {
            if (s.charAt(i) == s.charAt(len)) {
                ++len;
                ++i;
            } else {
                if (len == 0) { // no prefix
                    ++i;
                } else {
                    // search for shorter prefixes
                    --len;
                }
            }
        }
        return len;
    }

    static void intersectionOfTwoUnsortedArrays(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int v : arr1) {
            set.add(v);
        }

        for (int v : arr2) {
            if (set.contains(v)) {
                set.remove(v);
                arrayList.add(v);
            }
        }
        System.out.println("intersection " + arrayList);
    }

    static int[] rotLeft(int[] a, int d) {
        int[] arr = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            if (d + i < a.length)
                arr[i] = a[d + i];
            else
                arr[i] = a[a.length - i - d];
        }
        return arr;
    }


    static boolean isAnagram(String str, String anagram) {
        if (str.length() != anagram.length())
            return false;

        for (int i = 0; i < str.length(); i++) {
            int index = anagram.indexOf(str.charAt(i));
            if (index != -1) {
                anagram = anagram.substring(0, index) + anagram.substring(index + 1);
            } else {
                return false;
            }
        }
        return anagram.isEmpty();
    }


    static int findLongestConseqSubseq(int arr[], int n) {
        Set<Integer> H = new HashSet<>();
        int ans = 0;
        for (int v : arr) {
            H.add(v);
        }
        for (int i = 0; i < n; i++) {
            if (!H.contains(arr[i] - 1)) {
                int j = arr[i];
                while (H.contains(j)) {
                    j++;
                }
                if (ans < j - arr[i]) {
                    ans = j - arr[i];
                }
            }
        }
        return ans;
    }

    private static int missingNumberInGivenIntegerArray(int[] arr, int count) {
        int actualSum = count * (count + 1) / 2;
        int totalSum = 0;
        for (int value : arr) {
            totalSum = totalSum + value;
        }
        return actualSum - totalSum;
    }

    private static void largestAndSmallestNumberInUnsortedIntegerArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int value : arr) {
            if (value >= max) {
                max = value;
            } else if (value < min) {
                min = value;
            }
        }
        System.out.println("Min " + min + " : Max " + max);
    }

    private static void allPairsOfIntegerArrayWhoseSumIsEqualToGivenNumber(int[] arr, int sum) {
        Set<Integer> set = new HashSet<>(arr.length);

        for (int value : arr) {
            int target = sum - value;
            if (set.contains(target)) {
                System.out.println("Pairs " + value + " " + target);
            } else {
                set.add(value);
            }
        }
    }


    private static void duplicateNumberOnGivenIntegerArray(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int value : arr) {
            if (hashMap.containsKey(value)) {
                hashMap.put(value, hashMap.get(value) + 1);
            } else {
                hashMap.put(value, 1);
            }
        }
        System.out.println("duplicateNumbers : " + hashMap);
    }

    private static void reverseArray(int[] arr) {
//        int[] temp = new int[arr.length];
        int j = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static boolean isAnagramsWord(String str, String anagram) {
        if (str.length() != anagram.length())
            return false;
        for (char c : str.toCharArray()) {
            int index = anagram.indexOf(c);
            if (index != -1) {
                anagram = anagram.substring(0, index) + anagram.substring(index + 1);
            } else {
                return false;
            }

        }
        return anagram.isEmpty();
    }

    private static void nonRepeatedCharacter(String str) {
        Set<Character> nonRepeated = new HashSet();
        List<Character> repeated = new ArrayList<>();
        for (char c : str.toCharArray()) {
            if (repeated.contains(c)) {
                continue;
            }
            if (nonRepeated.contains(c)) {
                nonRepeated.remove(c);
                repeated.add(c);
            } else {
                nonRepeated.add(c);
            }
        }
        System.out.println("nonRepeated " + nonRepeated + " : Repeated " + repeated);
    }

    private static String reversedUsingRecursion(String str) {

        if (str.isEmpty())
            return str;
        return reversedUsingRecursion(str.substring(1)) + str.charAt(0);

    }

    private static int isDigitaNumber(String str) {
        int count = 0;
        if (str == null)
            return count;
        for (int c : str.toCharArray()) {
            System.out.println("Inzy" + c);
            if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
                count++;
            }
        }
        return count;
    }

    private static int occurrenceOfGivenCharacter(String str, char c) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (c == ch) {
                count++;
            }
        }

        return count;
    }

    private static boolean stringRotationOfEachOther(String str, String rotation) {
        if (str.length() != rotation.length()) {
            return false;
        }
        String concanated = str + str;
        return concanated.contains(rotation);
    }

    private static void permutation(String input) {
        permutation("", input);
    }

    private static void permutation(String perm, String word) {
        if (word.isEmpty()) {
            System.out.println(perm);
        } else {
            for (int i = 0; i < word.length(); i++) {
                permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1));
            }
        }
    }

    private static int atoi(String input) { //1234
        int value = 0;
        for (int i = 0; i < input.length(); i++) {
            value = value + Character.getNumericValue(input.charAt(i)) * getVal(input.length() - i - 1);
        }
        return value;
    }

    private static int getVal(int num) {
        int val = 1;
        for (int j = 0; j < num; j++) {
            val = val * 10;
        }
        return val;
    }

    private static boolean validShuffleOfTwoString(String first, String second, String shuffle) {
        int index = -1;
        boolean valid;
        for (char c : first.toCharArray()) {
            if (shuffle.indexOf(c) != -1 && shuffle.indexOf(c) > index) {
                index = shuffle.indexOf(c);
                shuffle = shuffle.substring(0, shuffle.indexOf(c)) + shuffle.substring(shuffle.indexOf(c) + 1);
            } else {
                return false;
            }

        }
        valid = shuffle.equals(second);
        return valid;
    }

    public static String removeCharRecursive(String word, char ch) {
        int index = word.indexOf(ch);
        if (index == -1) {
            return word;
        }
        return removeCharRecursive(word.substring(0, index) + word.substring(index + 1), ch);
    }


    private static void intersectionOfTwoSortedArray(int[] arr, int[] arr1) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int length = arr.length <= arr1.length ? arr.length : arr1.length;
        int i = 0;
        int j = 0;
        while (i < length) {
            if (arr[i] == arr1[j]) {
                arrayList.add(arr[i]);
                j++;
                i++;
            } else if (arr[i] > arr1[j]) {
                j++;
            } else if (arr[i] < arr1[j]) {
                i++;
            }
        }

        System.out.println(arrayList);
    }


    private static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(k);
        for (int i : nums) {
            q.offer(i);

            if (q.size() > k) {
                q.poll();
            }
        }
        return q.peek();
    }

    private static void topTwoNumbers(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sec_max = Integer.MIN_VALUE;
        for (int val : arr) {
            if (val >= max) {
                max = val;
            } else if (val > sec_max) {
                sec_max = val;
            }
        }
        System.out.println(max + " : " + sec_max);
    }

    private static String removeGivenCharacter(String str, char c) {
        while (str.indexOf(c) != -1) {
            str = str.substring(0, str.indexOf(c)) + str.substring(str.indexOf(c) + 1);
        }
        return str;
    }

    private static String longestPalindromeInString(String str) {
        return "";
    }

    //{20, 22, 23, 24, 25, 24, 22, 26, 25, 24};
    private static void getSequence(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int val = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] - arr[j] <= 5 && arr[i] - arr[j] >= -5) {
                    val = j;
                } else {
                    break;
                }
            }
            hashMap.put((i + 1), (val + 1));
        }

        Iterator hmIterator = hashMap.entrySet().iterator();

        int max = Integer.MIN_VALUE;
        int sDate = -1;
        int edate = -1;
        while (hmIterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry) hmIterator.next();
            int enddate = ((int) mapElement.getValue());
            int startdate = (int) mapElement.getKey();
            if ((enddate - startdate) > max) {
                max = enddate - startdate;
                sDate = startdate;
                edate = enddate;
            }
        }
        System.out.println(sDate + " " + edate);
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int j = low;
        for (int i = low; i < high; i++) {
            if (arr[i] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        int temp = arr[j];
        arr[j] = arr[high];
        arr[high] = temp;
        return j;
    }

    private static int kthSmallest(int[] arr, int low, int high, int k) {
        if (k > 0 && k <= high - low + 1) {
            int p = partition(arr, low, high);
            if (p - low == k - 1)
                return arr[p];
            if ((p - low) > k - 1)
                return kthSmallest(arr, low, p - 1, k);
            return kthSmallest(arr, p + 1, high, k - p + low - 1);
        }
        return -1;
    }

    public static int partition(Integer[] arr, int l,
                                int r) {
        int x = arr[r], i = l;
        for (int j = l; j <= r - 1; j++) {
            if (arr[j] <= x) {
                //Swapping arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
            }
        }

        //Swapping arr[i] and arr[r]
        int temp = arr[i];
        arr[i] = arr[r];
        arr[r] = temp;

        return i;
    }

    // This function returns k'th smallest element
    // in arr[l..r] using QuickSort based method.
    // ASSUMPTION: ALL ELEMENTS IN ARR[] ARE DISTINCT
    public static int kthSmallest(Integer[] arr, int l,
                                  int r, int k) {
        // If k is smaller than number of elements
        // in array
        if (k > 0 && k <= r - l + 1) {
            // Partition the array around last
            // element and get position of pivot
            // element in sorted array
            int pos = partition(arr, l, r);

            // If position is same as k
            if (pos - l == k - 1)
                return arr[pos];

            // If position is more, recur for
            // left subarray
            if (pos - l > k - 1)
                return kthSmallest(arr, l, pos - 1, k);

            // Else recur for right subarray
            return kthSmallest(arr, pos + 1, r, k - pos + l - 1);
        }

        // If k is more than number of elements
        // in array
        return Integer.MAX_VALUE;
    }

    private static int[] getRandomArray(int length) {
        int[] randoms = new int[length];
        for (int i = 0; i < length; i++) {
            randoms[i] = (int) (Math.random() * 15);
        }
        return randoms;
    }
}
