package com.stream.array.two.pointers;

public class PalindromeReverse {

    public static void main(String[] args) {
        //1. Using Reverse String
        //Reverse the string and compare it with the original.

        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s)); // Output: true
    }

    private static boolean isPalindrome(String s) {

        //Logic:
        //Remove non-alphanumeric characters and convert to lowercase.
        //Reverse the cleaned string and compare.

        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        //String reversed = new StringBuilder(s).reverse().toString();// false
        String reversed = new StringBuilder(cleaned).reverse().toString();//true

        return (cleaned.equals(reversed));
    }
}
