/*
 *
 * https://leetcode.com/problems/two-sum/
 * Problem ID: 1. Two Sum
 * 
 * Author: revival0728
 * 
 */

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val arr = Array(nums.size) { Pair(nums[it], it) }
        arr.sortBy { it.first }
        return arr.run {
            val ans = Pair(0, this.lastIndex).toList().toMutableList()
            var sum = this[ans[0]].first + this[ans[1]].first
            while(sum != target) {
                if(sum < target)
                    ++ans[0]
                else
                    --ans[1]
                sum = this[ans[0]].first + this[ans[1]].first
            }

            IntArray(2) { this[ans[it]].second }
        }
    }
}
