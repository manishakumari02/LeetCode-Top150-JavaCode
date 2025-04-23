// --------------------------------------------------------
// Leetcode 150 Problem #3: Remove Duplicates (LeetCode Problem #26)
// Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
// Solved on: [23-04-2025]
//
// Problem Description:
// Given a sorted integer array nums, remove the duplicates in-place such that each element appears only once.
// The relative order of the elements should be preserved. You must do this by modifying the input array in-place with O(1) extra memory.
//
// Approach:
// 1. Use a pointer `k` to track the index where the next unique element will be placed.
// 2. Iterate through the array starting from the second element.
// 3. If the current element is different from the previous one, place it at the next unique position and increment `k`.
// 4. At the end of the loop, the array will have all unique elements in the first `k` positions, and `k` will be the new length of the array.
//
// Time Complexity: O(n) where n is the length of the array.
// Space Complexity: O(1) since no extra space is used.
///////////////////////////////////////////////////////////

// Solution Code:
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int k = 1; 
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k; 
    }
}
