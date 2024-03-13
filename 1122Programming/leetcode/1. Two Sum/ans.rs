/*
 *
 * https://leetcode.com/problems/two-sum/
 * Problem ID: 1. Two Sum
 * 
 * Author: revival0728
 * 
 */

use std::collections::HashMap;

impl Solution {
    pub fn two_sum(nums: Vec<i32>, target: i32) -> Vec<i32> {
        let mut map: HashMap<i32, usize> = HashMap::new();
        for (id, v) in nums.iter().enumerate() {
            if(map.contains_key(&(target - v))) {
                return vec![id.try_into().unwrap(), (*map.get(&(target - v)).unwrap()).try_into().unwrap()];
            } else {
                map.insert(*v, id);
            }
        }
        return vec![-1, -1];
    }
}
