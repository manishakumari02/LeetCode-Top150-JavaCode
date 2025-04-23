// --------------------------------------------------------
// LeetCode Top Interview 150 - Problem #80: Remove Duplicates from Sorted Array II
// Link: https:https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/?envType=study-plan-v2&envId=top-interview-150
// Solved on: [23-04-2025]
//
// Problem Description:
// Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that 
// each unique element appears at most twice. The relative order of the elements should be kept the same.
// Modify the array in-place with O(1) extra memory, and return the new length.
//
// Approach:
// 1. If the array has two or fewer elements, return its length as it already satisfies the condition.
// 2. Use two pointers:
//    - Pointer `i` keeps track of the position to place the next valid element.
//    - Pointer `j` iterates through the array from index 2 onwards.
// 3. For each `nums[j]`, compare it with `nums[i - 2]`. If they are different, it means the current element
//    hasn't occurred more than twice yet, so it's safe to include it.
// 4. Copy `nums[j]` to `nums[i]` and increment `i`.
// 5. Continue this process to ensure no element appears more than twice in the final array.
//
// Time Complexity: O(n), where n is the length of the array.
// Space Complexity: O(1), since the operation is done in-place without extra memory.
// --------------------------------------------------------

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=2){
            return nums.length;
        }
        int i=2;
        for(int j=2;j<nums.length;j++){
            if(nums[j]!=nums[i-2]){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
}
