package com.stream.array.two.pointers;

import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeDeque {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindromeWithDeque(s)); // Output: true
    }

    private static boolean isPalindromeWithDeque(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : cleaned.toCharArray()) {
            deque.add(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) return false;
        }

        return true;
    }
    //Logic:
    //Compare the first and last characters using a deque.
}
