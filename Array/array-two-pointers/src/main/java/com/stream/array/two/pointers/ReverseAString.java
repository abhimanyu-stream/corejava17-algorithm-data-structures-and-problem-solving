package com.stream.array.two.pointers;

import java.util.Arrays;

public class ReverseAString {
    public static void main(String[] args) {

        char[] s = { 'h', 'e', 'l', 'l', 'o' };
        char[] result = reverse(s);
        System.out.println(result);
        // Stream.of(result).forEach(System.out::println);

    }

    public static char[] reverse(char[] s) {

        int left = 0;
        int right = s.length - 1; // last element of given array
        while (left < right) {

            // do swapping
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        System.out.println(s);
        System.out.println(Arrays.toString(s));

        return s;
    }
}
