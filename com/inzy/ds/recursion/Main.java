package com.inzy.ds.recursion;

public class Main {
    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        recursion.printNumberDsc(5);
        recursion.printNumberAsc(5);
        System.out.println("factorial : " + recursion.factorial(4));
        System.out.println("factorial : " + recursion.factorialTailRec(6, 1));
        System.out.println("palindrome : " + recursion.isPalindrome("abccba", 0, 5));
        System.out.println("fib : " + recursion.fib(7));
    }
}
