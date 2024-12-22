package com.stream.array.two.pointers;

public class ArrayHasTwoNumbersThatSumToTarget {

    public static void main(String[] args) {

        int[] nums = { 1, 2, 3, 4, 6 };
        int target = 8;
        hasTwoSum(nums, target);
    }

    public static void hasTwoSum(int[] nums, int target) {

        int left = 0;
        int[] place = new int[0];//
        int right = nums.length - 1; // num.length meaning total elements in Array. count starts from 1 for element
                                     // counting
        System.out.println("last index: " + right);
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                place = new int[] { left, right };
            }
            if (sum < target) {
                left++;
            } else {
                right--;
            }

        }
        System.out.println(place[0] + " " + place[1]);

    }

}
