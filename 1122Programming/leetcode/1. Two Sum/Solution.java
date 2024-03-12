/**
 * https://leetcode.com/problems/two-sum/
 * Problem ID: 1. Two Sum
 *
 * Author: Ateto
 */

 class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length == 2) {
            int[] dummy = {0, 1};
            return dummy;
        }
        Map<Integer, ArrayList<Integer>> mp = new HashMap();
        for(int i = 0; i < nums.length; i++) {
            if(mp.containsKey(nums[i]) == false) {
                ArrayList<Integer> dummy = new ArrayList();
                mp.put(nums[i], dummy);
            }
            mp.get(nums[i]).add(i);
        }
        Arrays.sort(nums);
        int p, q, sum;
        p = 0;
        q = nums.length - 1;
        while(p < nums.length && q >= 0) {
            sum = nums[p] + nums[q];
            if(sum == target) {
                if(nums[p] != nums[q]) {
                    int[] dummy = {mp.get(nums[p]).get(0), mp.get(nums[q]).get(0)};
                    return dummy;
                }
                int[] dummy = {mp.get(nums[p]).get(0), mp.get(nums[q]).get(1)};
                return dummy;
            } else if(sum > target) {
                q--;
            } else if(sum < target) {
                p++;
            }
        }
        int[] dummy = {-1, -1};
        return dummy;
    }
}