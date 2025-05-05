/*
 * --------------------------------------------------------
 * Title      : LeetCode Top Interview 150 - Problem #42
 * Problem    : Trapping Rain Water
 * Link       : https://leetcode.com/problems/trapping-rain-water/
 * Solved On  : [05/05/25]
 * Language   : Java
 * 
 * Problem Statement:
 * Given n non-negative integers representing an elevation map where the width 
 * of each bar is 1, compute how much water it is able to trap after raining.
 * 
 * Approach:
 * 1. Create two arrays to store the max height to the left and right of each index.
 * 2. For each index, water trapped = min(leftMax, rightMax) - height.
 * 3. Sum this over the entire array.
 * 
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 * --------------------------------------------------------
 */

class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if (n == 0) return 0;

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        // Compute max height to the left of each index
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        // Compute max height to the right of each index
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        // Calculate total water trapped
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            trappedWater += Math.min(leftMax[i], rightMax[i]) - height[i];
        }

        return trappedWater;
    }
}
