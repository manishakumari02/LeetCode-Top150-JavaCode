// --------------------------------------------------------
// LeetCode Top Interview 150 - Problem #45: Jump Game II
// Link: https://leetcode.com/problems/jump-game-ii/?envType=study-plan-v2&envId=top-interview-150
// Solved on: [28-04-2025]
//
// Problem Description:
// You are given a 0-indexed array of integers `nums` where `nums[i]` represents the maximum jump length from that position.
// Your goal is to reach the last index in the minimum number of jumps.
// Return the minimum number of jumps to reach the last index. 
// The test cases are generated such that you can always reach the last index.
//
// Approach (Greedy - Maximum Reach with Jumps):
// 1. Initialize `curr` (current range end), `maxJump` (farthest reachable index), and `jump` (jump count) to 0.
// 2. Iterate through the array up to `nums.length - 1`:
//    - Update `maxJump` as the maximum of current `maxJump` and `i + nums[i]`.
//    - If the current index `i` reaches the `curr`, it means we must jump:
//        - Increment the `jump` count.
//        - Update `curr` to `maxJump`.
// 3. After the loop, return `jump`.
//
// Time Complexity: O(n), where n is the length of the array.
// Space Complexity: O(1), constant extra space used.
//
// Result:
// Returns the minimum number of jumps needed to reach the last index.
// --------------------------------------------------------

class Solution {
    public int jump(int[] nums) {
        int curr = 0;
        int maxJump = 0;
        int jump = 0;
        
        for (int i = 0; i < nums.length - 1; i++) {
            maxJump = Math.max(maxJump, i + nums[i]);
            if (i == curr) {
                jump++;
                curr = maxJump;
            }
        }
        
        return jump;
    }
}
