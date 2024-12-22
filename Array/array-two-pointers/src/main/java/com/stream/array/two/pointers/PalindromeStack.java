package com.stream.array.two.pointers;

import java.util.Stack;

public class PalindromeStack {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindromeStack(s)); // Output: true
    }

    private static boolean isPalindromeStack(String s) {

        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();


        Stack<Character> stack = new Stack<>();
        for(char c: cleaned.toCharArray()){
            stack.push(c);


        }
        for(char c: cleaned.toCharArray()){

            if(stack.pop() != c){
                return false;
            }

        }
        return true;

    }

    //Logic:
    //Use a stack to reverse the string implicitly and compare.
}
