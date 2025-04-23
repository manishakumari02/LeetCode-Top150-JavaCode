// --------------------------------------------------------
// Leetcode 150 Problem #2: Remove Element (LeetCode Problem #27)
// Link: https://leetcode.com/problems/remove-element/description/?envType=study-plan-v2&envId=top-interview-150
// Solved on: [23-04-2025]
//
// Problem Description:
// Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
// The relative order of the elements may be changed.
// You must do this by modifying the input array in-place with O(1) extra memory.
//
// Approach:
// 1. Use a pointer `j` to track the index of the next position to place a valid element.
// 2. Iterate through the array using pointer `i`.
// 3. For each element, if it is not equal to val, place it at index `j` and increment `j`.
// 4. At the end of the loop, the first `j` elements in the array are the result.
//
// Time Complexity: O(n) where n is the length of the array.
// Space Complexity: O(1) since no extra space is used.
///////////////////////////////////////////////////////////

// Solution Code:

class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
