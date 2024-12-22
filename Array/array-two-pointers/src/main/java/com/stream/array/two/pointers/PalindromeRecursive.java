package com.stream.array.two.pointers;



public class PalindromeRecursive {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindromeCheck(s)); // Output: true
    }


    private static boolean isPalindromeCheck(String s){


        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return isPalindromeRecursive(cleaned, 0, cleaned.length() - 1);
    }

    private static boolean isPalindromeRecursive(String cleaned, int left, int right) {

        if(left >= right)
            return true;


        if(cleaned.charAt(left) != cleaned.charAt(right))
            return false;

        return isPalindromeRecursive(cleaned, left + 1, right - 1);


    }
    //Explanation of the Fix:
    //The base case (if (left >= right)) is correct, as it ensures that we stop the recursion when the left pointer meets or exceeds the right pointer.
    //When characters at left and right are not equal, we return false.
    //In the recursive step, the left pointer moves forward (left + 1), and the right pointer moves backward (right - 1).
}
