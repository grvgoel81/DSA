package com.inzy.ds.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Hackernoon {
    public static void main(String[] strg) {
        int[] arr = getRandomArray(11);
        System.out.println("Random Integer array : " + Arrays.toString(arr));
        System.out.println(printMissingNumber(new int[]{1, 9, 2, 4, 6, 7, 5, 8, 3}, 10));
        System.out.println(isAnagram("abicadefghija", "adeijafgihabc"));
        System.out.println(reverseRecursively("Combination"));
        System.out.println("isaNumber " + isaNumber("manada.d"));
        System.out.println("occurrenceOfGivenCharacter " + occurrenceOfGivenCharacter("manadad", 'm'));
        System.out.println("rotationOfEachOther " + rotationOfEachOther("IndiaVsEngland", "EnglandVsIndia"));
        System.out.println("rotationOfEachOther " + rotationOfEachOther("IndiaVsEngland", "EnglandIndiaVs"));
        System.out.println("rotationOfEachOther " + checkRotatation("IndiaVsEngland", "EnglandVsIndia"));
        System.out.println("rotationOfEachOther " + checkRotatation("IndiaVsEngland", "VsEnglandIndia"));
        System.out.println("isPalindromString " + isPalindromString("IndiaVaaidnI"));
        largestAndSmallestNumberFromIntegerArray(arr);
        printPairsUsingSet(arr, 12);
        firstNonRepeatingChar("abicadefghija");
        printDuplicateCharacters("Connmbination");
        numberOfVowelsInString("number Of Vowelss In String");
        permutation("1234");
        System.out.println("reverseWords : " + reverseWords("How do you reverse words in a given sentence without using any library method"));
        System.out.println("reverseWords : " + reverseWordsRecursive("How do you reverse words in a given sentence without using any library method"));

    }

    private static String reverseWords(String str) {
        String[] arr = str.split(" ");
        String rev = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            rev = rev + arr[i] + " ";
        }
        return rev;
    }

    private static String reverseWordsRecursive(String str) {
        String[] arr = str.split(" ");
        if (str.isEmpty() || !str.contains(" ")) {
            return str;
        }
        return reverseWordsRecursive(str.substring(str.indexOf(" ")).trim()) + " " + arr[0];
    }

    private static boolean rotationOfEachOther(String str, String rotation) {
        if (str.length() != rotation.length())
            return false;
        int index = -1;
        char[] strArr = str.toCharArray();
        char[] rotationArr = rotation.toCharArray();
        index = rotation.indexOf(strArr[0]);
        if (index != -1) {
            for (int i = 0; i < strArr.length; i++) {

                if (strArr[i] != rotationArr[index]) {
                    return false;
                }
                index = index + 1;
                if (strArr.length - 1 < index) {
                    index = 0;
                }
            }
        }
        return true;
    }

    private static boolean isPalindromString(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0, j = arr.length - 1; j >= arr.length / 2 && i <= arr.length / 2; i++, j--) {
            if (arr[i] != arr[j]) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkRotatation(String original, String rotation) {
        if (original.length() != rotation.length()) {
            return false;
        }

        String concatenated = original + original;
        return concatenated.contains(rotation);
    }

    private static int printMissingNumber(int[] numbers, int count) {
        int missingNo = -1;
        int totalSum = 0;
        int actualSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            totalSum = totalSum + numbers[i];
        }
        actualSum = (count * (count + 1)) / 2;
        System.out.println("Inzy " + totalSum + " : " + actualSum);
        missingNo = actualSum - totalSum;
        return missingNo;
    }

    private static void largestAndSmallestNumberFromIntegerArray(int[] numbers) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            } else if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println("Max " + max + " Min " + min);
    }

    public static void printPairsUsingSet(int[] numbers, int sum) {
        Set set = new HashSet(numbers.length);

        for (int value : numbers) {
            int target = sum - value;
            if (!set.contains(target)) {
                set.add(value);
            } else {
                System.out.printf("(%d, %d) %n", value, target);
            }
        }
    }

    private static void firstNonRepeatingChar(String word) {
        Set<Character> repeating = new HashSet<>();
        List<Character> nonrepeating = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (repeating.contains(c))
                continue;
            if (nonrepeating.contains(c)) {
                nonrepeating.remove((Character) c);
                repeating.add(c);
            } else {
                nonrepeating.add(c);
            }
        }
        System.out.println("nonrepeating " + nonrepeating);
        System.out.println("repeating " + repeating);
    }

    private static void printDuplicateCharacters(String word) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println("word " + map);
    }

    private static boolean isAnagram(String word, String anagram) {

        if (word.length() != anagram.length()) {
            return false;
        }
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = anagram.indexOf(c);
            if (index != -1) {
                anagram = anagram.substring(0, index) + anagram.substring(index + 1);
            } else {
                return false;
            }
        }
        return anagram.isEmpty();
    }

    private static String reverseRecursively(String str) {

        if (str.length() < 2)
            return str;
        return reverseRecursively(str.substring(1)) + str.charAt(0);
    }

    private static boolean isaNumber(String str) {
        boolean isaNo = true;
        for (char c : str.toCharArray()) {
            if (Character.getNumericValue(c) < 0 || Character.getNumericValue(c) > 9) {
                isaNo = false;
                break;
            }
        }
        return isaNo;
    }

    private static void numberOfVowelsInString(String str) {
        String vowelStr = "AEIOUaeiou";
        int consta = 0, vow = 0;
        for (char c : str.toCharArray()) {
            if (((int) c <= 90 && (int) c >= 65) || ((int) c <= 122 && (int) c >= 97)) {
                if (vowelStr.contains(String.valueOf(c))) {
                    vow++;
//                    System.out.println("Vowel : " + c + " ");
                } else {
                    consta++;
//                    System.out.println("Consta : " + c + " ");
                }
            }
        }
        System.out.println("Consta " + consta + " vow " + vow);
    }

    private static int occurrenceOfGivenCharacter(String str, char c) {
        int occurrence = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == c) {
                occurrence++;
            }
        }
        return occurrence;
    }

    private static void permutation(String word) {
        permutation("", word);
    }

    //                                          1            234
//                                          12           34
//                                          123          4
//                                          1234         ""
    private static void permutation(String perm, String word) {
        if (word.isEmpty()) {
            System.out.println(perm);
        } else {
            for (int i = 0; i < word.length(); i++) {
//                System.out.println(perm + word.charAt(i) + " : " + word.substring(0, i) + word.substring(i + 1));
                permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1));
            }
        }
    }


    private static int[] getRandomArray(int length) {
        int[] randoms = new int[length];
        for (int i = 0; i < length; i++) {
            randoms[i] = (int) (Math.random() * 15);
        }
        return randoms;
    }
}
