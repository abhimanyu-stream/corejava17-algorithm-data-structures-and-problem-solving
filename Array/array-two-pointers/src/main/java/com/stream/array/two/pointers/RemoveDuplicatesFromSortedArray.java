package com.stream.array.two.pointers;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 2, 3, 4, 4 };
        int[] arrayUnique = removeDuplicates(nums);
        Arrays.stream(arrayUnique).forEach(System.out::println);

    }

    private static int[] removeDuplicates(int[] nums) {

        int nextNonDuplicate = 1;// logic is to compare the nextNonDuplicate with i. if they are not equal then
                                 // increment the nextNonDuplicate. This way we can keep track of the unique
                                 // elements in
                                 // the array and return the array with unique elements only.
        for (int i = 1; i < nums.length; i++) {
            if (nums[nextNonDuplicate - 1] != nums[i]) {// logic is to compare the nextNonDuplicate with i. if they are
                                                        // not equal then increment the nextNonDuplicate. This way we
                                                        // can keep track of the unique elements in the array and return
                                                        // the array with unique elements only.
                nums[nextNonDuplicate] = nums[i];
                nextNonDuplicate++;
            }
        }
        return Arrays.copyOf(nums, nextNonDuplicate);// copyOf method is used to copy the array with the length of
                                                     // nextNonDuplicate. This way we can return the array with unique
                                                     // elements only.
    }

}
