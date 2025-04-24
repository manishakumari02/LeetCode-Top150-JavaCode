// --------------------------------------------------------
// LeetCode Top Interview 150 - Problem #169: Majority Element
// Link: https:https://leetcode.com/problems/majority-element/?envType=study-plan-v2&envId=top-interview-150
// Solved on: [24-04-2025]
//
// Problem Description:
// Given an array `nums` of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times.
// You may assume that the majority element always exists in the array.
//
// Approach (Boyer-Moore Voting Algorithm):
// 1. Initialize `candidate` as the first element and set `count = 1`.
// 2. Iterate through the array starting from index 1.
//    - If the current element equals the `candidate`, increment `count`.
//    - Otherwise, decrement `count`.
//    - If `count` becomes 0, update `candidate` to the current element and reset `count` to 1.
// 3. By the end of the loop, `candidate` will hold the majority element.
//
// Time Complexity: O(n), where n is the length of the array.
// Space Complexity: O(1), constant extra space used.
//
// Result:
// Returns the majority element that appears more than n/2 times.
// --------------------------------------------------------

class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int candidate = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
            
            if (count == 0) {
                candidate = nums[i];
                count = 1;
            }
        }
        
        return candidate;
    }
}
