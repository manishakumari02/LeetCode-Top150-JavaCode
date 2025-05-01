/*
 * --------------------------------------------------------
 * Title      : LeetCode Top Interview 150 - Problem #238
 * Problem    : Product of Array Except Self
 * Link       : https://leetcode.com/problems/product-of-array-except-self/
 * Solved On  : [01/05/25]
 * Language   : Java
 * 
 * Problem Statement:
 * Given an integer array `nums`, return an array `answer` such that:
 *   `answer[i]` is equal to the product of all the elements of `nums` except `nums[i]`.
 * 
 * Note: You must solve it without using division and in O(n) time.
 * 
 * Approach:
 * 1. Create an output array `ans` to store the result.
 * 2. First pass:
 *      - Compute the prefix product (product of all elements to the left of current index).
 * 3. Second pass (in reverse):
 *      - Compute the suffix product (product of all elements to the right) 
 *        and multiply it with existing prefix product in `ans`.
 * 
 * Time Complexity  : O(n)
 * Space Complexity : O(1) (excluding the output array)
 * --------------------------------------------------------
 */

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        // Step 1: Compute prefix product
        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        // Step 2: Compute suffix product and multiply
        int R = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] = ans[i] * R;
            R *= nums[i];
        }

        return ans;
    }
}
