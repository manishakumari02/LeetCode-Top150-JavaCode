// --------------------------------------------------------
// LeetCode Top Interview 150 - Problem #55: Jump Game
// Link: https://leetcode.com/problems/jump-game/?envType=study-plan-v2&envId=top-interview-150
// Solved on: [27-04-2025]
//
// Problem Description:
// You are given an integer array `nums`. Each element in the array represents your maximum jump length at that position.
// Return true if you can reach the last index, or false otherwise.
//
// Approach (Greedy - Maximum Reach Tracking):
// 1. Initialize `maxReach` to 0.
// 2. Iterate through the array:
//    - If the current index `i` is greater than `maxReach`, return false (you cannot reach this point).
//    - Update `maxReach` as the maximum of current `maxReach` and `i + nums[i]`.
//    - If at any point `maxReach` reaches or exceeds the last index, return true immediately.
// 3. If loop finishes, return false (cannot reach end).
//
// Time Complexity: O(n), where n is the length of the array.
// Space Complexity: O(1), constant extra space used.
//
// Result:
// Returns true if you can reach the last index, false otherwise.
// --------------------------------------------------------

class Solution {
    public boolean canJump(int[] nums) {
        int maxReach = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                return false;
            }
            maxReach = Math.max(maxReach, i + nums[i]);
            if (maxReach >= nums.length - 1) {
                return true;
            }
        }
        
        return false;
    }
}
