/*
 * --------------------------------------------------------
 * Title      : LeetCode Top Interview 150 - Problem #274
 * Problem    : H-Index
 * Link       : https://leetcode.com/problems/h-index/?envType=study-plan-v2&envId=top-interview-150
 * Solved On  : 29-04-2025
 * Language   : Java
 * 
 * Problem Statement:
 * Given an array of integers citations where citations[i] is the number of 
 * citations a researcher received for their ith paper, return the researcher's h-index.
 * The h-index is defined as the maximum value h such that the given researcher 
 * has published at least h papers that have each been cited at least h times.
 * 
 * Approach:
 * 1. Sort the citations array in ascending order.
 * 2. Loop through each element:
 *      - At index i, check if citations[i] >= (n - i), where n is the array length.
 *      - If yes, return (n - i) as the h-index.
 * 3. If no such condition is met, return 0.
 * 
 * Time Complexity  : O(n log n), due to sorting.
 * Space Complexity : O(1), constant extra space.
 * --------------------------------------------------------
 */

import java.util.Arrays;

class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        for (int i = 0; i < n; i++) {
            if (citations[i] >= n - i) {
                return n - i;
            }
        }
        return 0;
    }
}
