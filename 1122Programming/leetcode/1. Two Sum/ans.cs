/*
 *
 * https://leetcode.com/problems/two-sum/
 * Problem ID: 1. Two Sum
 * 
 * Author: asd7766zxc
 * 
 */


public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        var mapping = nums.Select((item, index) => new {item,index}).ToLookup(pair => pair.item, pair => pair.index);
        return nums.Select((item, index) => new { item, index }).Where((first,ind)=> mapping.Contains(target - first.item) && mapping[target-first.item].First()!=ind).Select((first, ind) => new int[]{first.index,mapping[target - first.item].First() }).FirstOrDefault();
    }
}