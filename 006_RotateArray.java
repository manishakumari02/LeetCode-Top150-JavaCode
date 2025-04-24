// --------------------------------------------------------
// LeetCode Top Interview 150 - Problem #189: Rotate Array
// Link: https://leetcode.com/problems/rotate-array/?envType=study-plan-v2&envId=top-interview-150
// Solved on: [24-04-2025]
//
// Problem Description:
// Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
//
// Approach (Reversal Algorithm):
// 1. First, reduce `k` to be within the bounds of the array length using `k = k % nums.length`.
// 2. Reverse the entire array to shift the elements to their rotated positions.
// 3. Reverse the first `k` elements to restore their order.
// 4. Reverse the remaining `n - k` elements to restore their order.
// 5. The array is rotated in-place with constant space complexity.
//
// Time Complexity: O(n), where n is the length of the array.
// Space Complexity: O(1), constant extra space used.
//
// Result:
// Modifies the array in place and rotates it by k steps to the right.
// --------------------------------------------------------

class Solution {
    public void rotate(int[] nums, int k) {
        // Handle cases where k is larger than the length of the array
        k = k % nums.length;
        
        // Step 1: Reverse the entire array
        reverse(nums, 0, nums.length - 1);
        
        // Step 2: Reverse the first k elements
        reverse(nums, 0, k - 1);
        
        // Step 3: Reverse the remaining n-k elements
        reverse(nums, k, nums.length - 1);
    }
    
    // Helper function to reverse a portion of the array
    public void reverse(int nums[], int si, int ei) {
        while (si < ei) {
            int temp = nums[ei];
            nums[ei] = nums[si];
            nums[si] = temp;
            
            si++;
            ei--;
        }
    }
}
