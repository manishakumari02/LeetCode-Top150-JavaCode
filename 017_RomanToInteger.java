/*
 * --------------------------------------------------------
 * Title      : LeetCode Top Interview 150 - Problem #13
 * Problem    : Roman to Integer
 * Link       : https://leetcode.com/problems/roman-to-integer/
 * Solved On  : [06/05/25]
 * Language   : Java
 * 
 * Problem Statement:
 * Given a Roman numeral, convert it to an integer. Roman numerals are 
 * represented by seven different symbols: I, V, X, L, C, D and M.
 * 
 * Approach:
 * 1. Store the value of each Roman symbol in a HashMap.
 * 2. Traverse the string from left to right.
 * 3. If the current symbol is smaller than the next one, subtract it.
 * 4. Otherwise, add it.
 * 5. Finally, add the value of the last symbol.
 * 
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * --------------------------------------------------------
 */

import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        int ans = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (hm.get(s.charAt(i)) >= hm.get(s.charAt(i + 1))) {
                ans += hm.get(s.charAt(i));
            } else {
                ans -= hm.get(s.charAt(i));
            }
        }

        // Add the value of the last character
        ans += hm.get(s.charAt(s.length() - 1));
        return ans;
    }
}
