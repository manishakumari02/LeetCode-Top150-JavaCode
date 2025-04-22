// --------------------------------------------------------
// DSA 150 Problem #1: Merge Sorted Array (LeetCode Problem #88)
// Link: https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
// Solved on: [23-04-2025]
// 
// Problem Description: 
// Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 
// as one sorted array. You must not allocate extra space for another array. 
// You must only modify nums1 in-place with O(1) extra memory.
// 
// Approach:
// 1. We will use three pointers (p1, p2, p3) to track the current position of both arrays and the result array.
// 2. Start from the end of nums1 (since it has extra space for nums2).
// 3. Compare the elements from the end of nums1 and nums2:
//    - If the element in nums1 is greater than or equal to the element in nums2, place the element from nums1 at the current position of nums1.
//    - Otherwise, place the element from nums2 at the current position of nums1.
// 4. Decrement the respective pointers (p1, p2, or p3) after each placement.
// 5. Continue the process until all elements are merged and nums1 is fully populated with sorted elements.
//
// Time Complexity: O(m + n) where m and n are the sizes of nums1 and nums2, respectively.
// Space Complexity: O(1) as we are not using any extra space except for the input arrays.
///////////////////////////////////////////////////////////

// Solution Code:

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1=m-1;
        int p2=n-1;
        int p3=nums1.length-1;
        while(p3>=0){
            if(p1<0){
                nums1[p3]=nums2[p2];
                p2--;
                p3--;
            }
            else if(p2<0){
                nums1[p3]=nums1[p1];
                p1--;
                p3--;
            }
            else if(nums1[p1]>=nums2[p2]){
                nums1[p3]=nums1[p1];
                p1--;
                p3--;
            }
            else{
                nums1[p3]=nums2[p2];
                p2--;
                p3--;

            }
        }
    }
}
