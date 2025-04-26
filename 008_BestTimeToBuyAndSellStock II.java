// --------------------------------------------------------
// LeetCode Top Interview 150 - Problem #122: Best Time to Buy and Sell Stock II
// Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/?envType=study-plan-v2&envId=top-interview-150
// Solved on: [26-04-2025]
//
// Problem Description:
// You are given an integer array `prices` where `prices[i]` is the price of a given stock on the ith day.
// On each day, you may decide to buy and/or sell the stock. You can only hold at most one share at a time.
// However, you can buy it and immediately sell it on the same day.
// Return the maximum profit you can achieve.
//
// Approach (Greedy - Capture All Profitable Moves):
// 1. Initialize `profit` to 0.
// 2. Iterate through the array from index 1:
//    - If today's price is higher than yesterday's, add the difference to `profit`.
//    - This simulates buying at a valley and selling at a peak (even if they're consecutive days).
// 3. Return the accumulated `profit` after traversing the array.
// 4. No extra space is used; updates are done in-place.
//
// Time Complexity: O(n), where n is the length of the array.
// Space Complexity: O(1), constant extra space used.
//
// Result:
// Returns the maximum profit achievable by making multiple buy and sell operations.
// --------------------------------------------------------

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }

        return profit;
    }
}
