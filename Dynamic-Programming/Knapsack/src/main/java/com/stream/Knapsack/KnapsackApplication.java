package com.stream.Knapsack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

import static com.stream.Knapsack.Knapsack.knapsack;

@SpringBootApplication
public class KnapsackApplication {

	public static void main(String[] args) {
		SpringApplication.run(KnapsackApplication.class, args);

		// Example input
		int[] values = {60, 100, 120}; // Values of items
		int[] weights = {10, 20, 30};  // Weights of items
		int capacity = 50;            // Capacity of the knapsack
		int n = values.length;        // Number of items

		// Initialize memoization table with -1
		int[][] memo = new int[n + 1][capacity + 1];
		for (int[] row : memo) {
			Arrays.fill(row, -1);
		}

		// Solve the Knapsack problem
		int maxValue = knapsack(capacity, weights, values, n, memo);

		// Output the result
		System.out.println("Maximum value in Knapsack: " + maxValue);
	}

}
/**
 *
 * Here’s the 0/1 Knapsack problem implemented in Java 8 using recursion with memoization. This approach improves efficiency by storing intermediate results to avoid redundant calculations.
 *
 *Explanation
 * Memoization:
 *
 * A 2D memo array stores the results of subproblems.
 * memo[n][capacity] represents the maximum value for n items and a knapsack with capacity.
 * Base Case:
 *
 * If there are no items (n == 0) or capacity is zero, return 0.
 * Recursive Case:
 *
 * If the result for a subproblem is already computed (memo[n][capacity] != -1), use it.
 * Otherwise:
 * If the current item's weight exceeds the capacity, skip it.
 * Otherwise, calculate the maximum of:
 * Including the current item.
 * Excluding the current item.
 * Store the result in the memo array.
 * Parameters:
 *
 * capacity: Remaining capacity of the knapsack.
 * weights: Array of weights of the items.
 * values: Array of values of the items.
 * n: Number of items left.
 * memo: Memoization table.
 * Output for Example Input
 * yaml
 * Copy code
 * Maximum value in Knapsack: 220
 * Complexity
 * Time Complexity:
 * 𝑂
 * (
 * 𝑛
 * ×
 * capacity
 * )
 * O(n×capacity), where n is the number of items and capacity is the knapsack's capacity. Memoization reduces redundant calculations.
 * Space Complexity:
 * 𝑂
 * (
 * 𝑛
 * ×
 * capacity
 * )
 * O(n×capacity), for the memoization table, and
 * 𝑂
 * (
 * 𝑛
 * )
 * O(n) for the recursion stack.
 * */

