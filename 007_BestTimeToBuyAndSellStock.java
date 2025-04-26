// --------------------------------------------------------
// LeetCode Top Interview 150 - Problem #121: Best Time to Buy and Sell Stock
// Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/?envType=study-plan-v2&envId=top-interview-150
// Solved on: [26-04-2025]
//
// Problem Description:
// You are given an array `prices` where `prices[i]` is the price of a given stock on the ith day.
// You want to maximize your profit by choosing a single day to buy one stock and a different day in the future to sell.
// Return the maximum profit you can achieve from this transaction. If no profit is possible, return 0.
//
// Approach (Single Pass - Min Price Tracking):
// 1. Initialize `buyPrice` as the first element of the array.
// 2. Iterate through the array starting from index 1:
//    - If the current price is lower than `buyPrice`, update `buyPrice`.
//    - Else, calculate the profit if sold today and update `maxProfit` if it is greater.
// 3. Return the maximum profit found after traversing the array.
// 4. No extra space is used; updates are done in-place.
//
// Time Complexity: O(n), where n is the length of the array.
// Space Complexity: O(1), constant extra space used.
//
// Result:
// Returns the maximum profit possible from a single buy and sell operation, or 0 if no profit is possible.
// --------------------------------------------------------

class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            } else {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        
        return maxProfit;
    }
}
