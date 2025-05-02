/*
 * --------------------------------------------------------
 * Title      : LeetCode Top Interview 150 - Problem #134
 * Problem    : Gas Station
 * Link       : https://leetcode.com/problems/gas-station/
 * Solved On  : [02/05/25]
 * Language   : Java
 * 
 * Problem Statement:
 * There are `n` gas stations arranged in a circle, where `gas[i]` is the amount of gas at station `i`,
 * and `cost[i]` is the gas required to travel from station `i` to `(i + 1) % n`.
 * 
 * You start at any one of the gas stations with an empty tank.
 * Return the starting station index if you can complete the circuit once in a clockwise direction.
 * Otherwise, return -1.
 * 
 * Note: If there is a solution, it is guaranteed to be unique.
 * 
 * Approach:
 * 1. First check if the total gas is at least the total cost — otherwise return -1.
 * 2. Traverse the array once:
 *      - Maintain a running total of `currGas`.
 *      - If at any point `currGas` becomes negative, reset it and move the starting point to `i + 1`.
 * 
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * --------------------------------------------------------
 */

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalIncome=0;
        int totalCost=0;
        for(int i=0;i<gas.length;i++){
            totalIncome+=gas[i];
            totalCost+=cost[i];
        }
      
        if(totalIncome<totalCost){
            return -1;
        }
        int total=0;
        int res=0;
        for(int i=0;i<gas.length;i++){
            total+=gas[i]-cost[i];
            if(total<0) {
                total=0;
                res=i+1;
            }
        }
        return res;
    }
}
