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
        if(nums.size() == 2) return {0, 1};
        map<int, vector<int>> mp;
        for(int i=0; i<nums.size(); i++) {
            mp[nums[i]].push_back(i);
        }
        sort(nums.begin(), nums.end());
        int p, q, sum;
        p = 0;
        q = nums.size()-1;
        while(p < nums.size() && q >= 0) {
            sum = nums[p] + nums[q];
            if(sum == target) {
                if(nums[p] != nums[q]) return {mp[nums[p]][0], mp[nums[q]][0]};
                return {mp[nums[p]][0], mp[nums[q]][1]};
            }
            else if(sum > target) q--;
            else if(sum < target) p++;
        }
        return {0, 0};
    }
};