/**
 * https://leetcode.com/problems/find-the-pivot-integer/
 * Problem ID: 2485. Find the Pivot Integer
 *
 * Author: revival0728
 */


impl Solution {
    pub fn pivot_integer(n: i32) -> i32 {
        let n = n as usize;
        let mut prefix_sum = vec![0_usize];
        for i in 1..(n + 1) as usize {
            prefix_sum.push(i + prefix_sum.last().unwrap());
        }
        for x in 1..(n + 1) as usize {
            if prefix_sum[x] == prefix_sum[n] - prefix_sum[x - 1] {
                return x as i32;
            }
        }
        -1
    }
}
