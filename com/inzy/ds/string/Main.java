package com.inzy.ds.string;

public class Main {

    public static void main(String[] args) {

        MyString myString = new MyString();
        myString.firstNonRepeatedChar("abcdcdba");
        System.out.println("Reverse: " + myString.reverseRecursion("prinzya"));
        System.out.println("Only Digit: " + myString.onlyDigit("-23451415151"));
        System.out.println("Is Anagram: " + myString.isAnagram("abcder", "bacree"));
        System.out.println("Occurrence: " + myString.occurrenceOfGivenChar("-23451415151", '5'));
        System.out.println("Palindrome: " + myString.isPalindrome("abcdcba", 0, "abcdcba".length() - 1));
        System.out.println("Interleaved: " + myString.isInterleaved("ABC", "DEF", "ADBECF"));
        System.out.println("LCS: " + myString.LCS("bqdrcvefgh", "abcvdefgh", "bqdrcvefgh".length(), "abcvdefgh".length()));
        System.out.println("LPS: " + myString.LPS("adbbca", "adbbca".length()));
        ;

    }
}
