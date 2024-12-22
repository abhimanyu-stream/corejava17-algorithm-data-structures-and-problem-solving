package com.stream.array.two.pointers;

import java.util.stream.IntStream;

public class PalindromeStreamAPI8 {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindromeWithStreamAPIJava8(s)); // Output: true
    }

    private static boolean isPalindromeWithStreamAPIJava8(String s) {

        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        return IntStream.range(0, cleaned.length()/2).allMatch(i->cleaned.charAt(i) == cleaned.charAt(cleaned.length() - i - 1 ));
    }
    //Logic:
    //Use a stream to check if each character matches its counterpart from the end.

}
