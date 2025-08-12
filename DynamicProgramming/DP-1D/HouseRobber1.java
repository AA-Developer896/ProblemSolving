House Robber :
Question:
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.

link: https://leetcode.com/problems/house-robber/?envType=study-plan-v2&envId=top-interview-150 

Example 1:

Input: nums = [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
Total amount you can rob = 1 + 3 = 4.
Example 2:

Input: nums = [2,7,9,3,1]
Output: 12
Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
Total amount you can rob = 2 + 9 + 1 = 12.
 

Constraints:

1 <= nums.length <= 100
0 <= nums[i] <= 400

Solution:

class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        if(n == 1) return nums[0];
        int t[] = new int[n+1];
        t[0] = 0;
        t[1] = nums[0];
        for(int i = 2; i < n+1; i++) {
            t[i] = Math.max(t[i-2] + nums[i-1] , t[i-1]);
        }

        return t[n];

         
        
    }





 // int robHelper(int nums[], int n,int t[]) {
    //     //Base Condition
    //     if(n == 1 ) return nums[n-1];
    //     if(n == 0) return 0;

    //     if(t[n] == -1) {
    //         return t[n];
    //     }

    //     return t[n] = Math.max(nums[n-1] + robHelper(nums,n-2,t), robHelper(nums, n-1,t));


    // }
}