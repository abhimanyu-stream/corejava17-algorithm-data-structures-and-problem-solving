package com.stream.Knapsack;

import java.util.Arrays;
//Example:
//Given weights and values of n items, put these items in a knapsack of capacity W to get the maximum total value in the knapsack. In other words, given two integer arrays val[0..n-1] and wt[0..n-1] which represent values and weights associated with n items respectively. Also given an integer W which represents knapsack capacity, find out the maximum value subset of val[] such that sum of the weights of this subset is smaller than or equal to W. You cannot break an item, either pick the complete item, or don’t pick it (0-1 property).
//https://www.geeksforgeeks.org/0-1-knapsack-problem-dp-10/

public class Knapsack {

    // Function to solve Knapsack problem using recursion with memoization
    public static int knapsack(int capacity, int[] weights, int[] values, int n, int[][] memo) {
        // Base case: no items left or no capacity left
        if (n == 0 || capacity == 0) {
            return 0;
        }

        // If the value is already computed, return it
        if (memo[n][capacity] != -1) {
            return memo[n][capacity];
        }

        // If the weight of the nth item is more than the capacity, skip it
        if (weights[n - 1] > capacity) {
            memo[n][capacity] = knapsack(capacity, weights, values, n - 1, memo);
            return memo[n][capacity];
        }

        // Recursive cases: either include or exclude the nth item
        // 1. Include the nth item
        int include = values[n - 1] + knapsack(capacity - weights[n - 1], weights, values, n - 1, memo);
        // 2. Exclude the nth item
        int exclude = knapsack(capacity, weights, values, n - 1, memo);

        // Store the result in memo and return the maximum of the two cases
        memo[n][capacity] = Math.max(include, exclude);
        return memo[n][capacity];
    }


}
/**
 * Below is a recursive implementation of the 0/1 Knapsack problem in Java 8.
 *
 * Problem Statement
 * You are given:
 *
 * A set of items, each with a weight and a value.
 * A knapsack with a maximum weight capacity.
 * The goal is to maximize the total value of items in the knapsack without exceeding its weight capacity.
 *
 * Explanation
 * Base Case:
 *
 * If there are no items left (n == 0) or the capacity is zero, the result is 0.
 * Recursive Case:
 *
 * If the weight of the current item exceeds the capacity, skip it.
 * Otherwise:
 * Calculate the value when including the current item.
 * Calculate the value when excluding the current item.
 * Return the maximum of these two options.
 * Parameters:
 *
 * capacity: Remaining capacity of the knapsack.
 * weights: Array of weights for the items.
 * values: Array of values for the items.
 * n: Number of items left to consider.
 * Output for the Example Input
 * yaml
 * Copy code
 * Maximum value in Knapsack: 220
 * Complexity
 * Time Complexity:
 * 𝑂
 * (
 * 2
 * 𝑛
 * )
 * O(2
 * n
 *  ), due to two recursive calls for each item.
 * Space Complexity:
 * 𝑂
 * (
 * 𝑛
 * )
 * O(n), for the recursion stack.
 * Notes
 * This implementation works well for small inputs but is inefficient for large problem sizes. To optimize it, consider implementing memoization or dynamic programming. Let me know if you’d like a more efficient version!
 *
 * */
