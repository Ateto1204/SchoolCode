/*
 *
 * https://leetcode.com/problems/two-sum/
 * Problem ID: 1. Two Sum
 * 
 * Author: Ateto
 * 
 */

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int sz = nums.size();
        for(int i=0; i<sz; i++) {
            for(int j=i+1; j<sz; j++) {
                if(nums[i] + nums[j] == target) return {i, j};
            }
        }
        return {-1, -1};
    }
};