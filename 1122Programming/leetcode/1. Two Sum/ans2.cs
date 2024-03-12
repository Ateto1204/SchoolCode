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
      return  nums.Select((f, s) => new {f,s}).Select((x) => new int[] { x.s, nums.Select((f, s) => new { f, s }).Where((a) => a.f == target - x.f && a.s != x.s).FirstOrDefault(new {f = 0,s =-1}).s}).Where(x => x[1] > 0).First();
    }
}