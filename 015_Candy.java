/*
 * --------------------------------------------------------
 * Title      : LeetCode Top Interview 150 - Problem #135
 * Problem    : Candy
 * Link       : https://leetcode.com/problems/candy/
 * Solved On  : [04/05/25]
 * Language   : Java
 * 
 * Problem Statement:
 * There are `n` children standing in a line, each with a rating value.
 * You must give each child at least one candy.
 * Children with a higher rating than their neighbors must get more candies.
 * 
 * Return the minimum number of candies you must give to distribute them according to the rules.
 * 
 * Approach:
 * 1. Traverse from left to right and assign 1 extra candy if the current child has a higher rating.
 * 2. Traverse from right to left, adjusting candies where needed, while summing up the total.
 * 
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 * --------------------------------------------------------
 */

import java.util.Arrays;

class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] left = new int[n];
        Arrays.fill(left, 1);

        // Left to right pass
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                left[i] = left[i - 1] + 1;
            }
        }

        // Right to left pass and total calculation
        int total = left[n - 1];
        int right = 1;
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                right++;
            } else {
                right = 1;
            }
            total += Math.max(left[i], right);
        }

        return total;
    }
}
